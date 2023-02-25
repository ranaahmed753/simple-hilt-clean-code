package edu.notes.hiltapp.di.login_module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.model.login_repository.FirebaseLoginRepository
import edu.notes.hiltapp.model.login_repository.FirebaseLoginRepositoryImpl
import edu.notes.hiltapp.remote.login.FirebaseLoginStrategy
import edu.notes.hiltapp.remote.login.LoginHandler
import edu.notes.hiltapp.remote.login.LoginListner
import edu.notes.hiltapp.remote.login.LoginStrategy
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LoginModule {
    @Provides
    @Singleton
    fun provideLoginStrategy(loginListner: LoginListner) : LoginStrategy{
        return FirebaseLoginStrategy(loginListner)
    }

    @Provides
    @Singleton
    fun provideLoginHandler(loginStrategy: LoginStrategy) : LoginHandler{
        return LoginHandler(loginStrategy)
    }

    @Provides
    @Singleton
    fun provideFirebaseLoginStrategyImpl(toastController: ToastController) : LoginListner{
        return FirebaseLoginRepositoryImpl(toastController)
    }

    @Provides
    @Singleton
    fun provideFirebaseLoginRepository(loginHandler: LoginHandler) : FirebaseLoginRepository {
        return FirebaseLoginRepository(loginHandler)
    }



}