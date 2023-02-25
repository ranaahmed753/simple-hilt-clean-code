package edu.notes.hiltapp.di.users_module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.notes.hiltapp.model.users.UserRepositoryImpl
import edu.notes.hiltapp.model.users.UsersRepository
import edu.notes.hiltapp.remote.users.FirebaseUserStrategy
import edu.notes.hiltapp.remote.users.UserListner
import edu.notes.hiltapp.remote.users.UserStrategy
import edu.notes.hiltapp.remote.users.UsersHandler
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UserModule {

    @Provides
    @Singleton
    fun provideUserListner(toastController: ToastController):UserListner{
       return UserRepositoryImpl(toastController)
    }
    @Provides
    @Singleton
    fun provideUserStrategy(userListner: UserListner):UserStrategy{
        return FirebaseUserStrategy(userListner)
    }

    @Provides
    @Singleton
    fun provideUsersHandler(userStrategy: UserStrategy):UsersHandler{
        return UsersHandler(userStrategy)
    }

    @Provides
    @Singleton
    fun provideUserRepository(usersHandler: UsersHandler):UsersRepository{
        return UsersRepository(usersHandler)
    }

    @Provides
    @Singleton
    fun provideUserRepositoryImpl(context: Context,toastController: ToastController):UserRepositoryImpl{
       return UserRepositoryImpl(toastController)
    }
}