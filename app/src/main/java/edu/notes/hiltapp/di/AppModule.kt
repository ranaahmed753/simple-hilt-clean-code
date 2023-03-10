package edu.notes.hiltapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.model.signup_repository.FirebaseSignupRepository
import edu.notes.hiltapp.model.signup_repository.FirebaseSignupRepositoryImpl
import edu.notes.hiltapp.remote.signup.FirebaseSignupStrategy
import edu.notes.hiltapp.remote.signup.SignupHandler
import edu.notes.hiltapp.remote.signup.SignupListner
import edu.notes.hiltapp.remote.signup.SignupStrategy
import edu.notes.hiltapp.utility.animation_controller.AnimationController
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: Context) : Context{
        return context
    }

    @Provides
    @Singleton
    fun provideToastController(context: Context) : ToastController{
        return ToastController(context)
    }

    @Provides
    @Singleton
    fun provideAnimationController(context: Context):AnimationController{
        return AnimationController(context)
    }

}