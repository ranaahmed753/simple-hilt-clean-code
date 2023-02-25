package edu.notes.hiltapp.di.signup_module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.model.signup_repository.FirebaseSignupRepository
import edu.notes.hiltapp.model.signup_repository.FirebaseSignupRepositoryImpl
import edu.notes.hiltapp.remote.signup.FirebaseSignupStrategy
import edu.notes.hiltapp.remote.signup.SignupHandler
import edu.notes.hiltapp.remote.signup.SignupListner
import edu.notes.hiltapp.remote.signup.SignupStrategy
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SignupModule {
    @Provides
    @Singleton
    fun provideSignupStrategy(signupListner: SignupListner) : SignupStrategy {
        return FirebaseSignupStrategy(signupListner)
    }

    @Provides
    @Singleton
    fun provideSignupHandler(signupStrategy: SignupStrategy) : SignupHandler {
        return SignupHandler(signupStrategy)
    }

    @Provides
    @Singleton
    fun provideSignupListner(toastController: ToastController) : SignupListner{
        return FirebaseSignupRepositoryImpl(toastController)
    }

    @Provides
    @Singleton
    fun provideFirebaseSignupRepository(signupHandler: SignupHandler) : FirebaseSignupRepository {
        return FirebaseSignupRepository(signupHandler)
    }
}