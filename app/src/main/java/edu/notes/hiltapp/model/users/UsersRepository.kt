package edu.notes.hiltapp.model.users

import edu.notes.hiltapp.remote.users.UsersHandler
import javax.inject.Inject

class UsersRepository @Inject constructor(
    private val usersHandler: UsersHandler
) {
   fun fetchUsers(){
        usersHandler.fetchUsers()
    }

   fun updateUser(id: String){
        usersHandler.updateUser(id)
    }

   fun deleteUser(id: String){
        usersHandler.deleteUser(id)
    }
}