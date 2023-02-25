package edu.notes.hiltapp.remote.users

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class UsersHandler @Inject constructor(
    private val userStrategy: UserStrategy
) {
    fun fetchUsers(){
        userStrategy.fetchUsers()
    }

    fun updateUser(id: String){
        userStrategy.updateUser(id)
    }

    fun deleteUser(id: String){
        userStrategy.deleteUser(id)
    }
}