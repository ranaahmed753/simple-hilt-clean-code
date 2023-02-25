package edu.notes.hiltapp.remote.users

interface UserStrategy {
   fun fetchUsers()
   fun updateUser(id: String)
   fun deleteUser(id: String)
}