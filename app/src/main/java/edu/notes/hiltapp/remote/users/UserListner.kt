package edu.notes.hiltapp.remote.users

interface UserListner {
    fun onSuccess(message: String)
    fun failure(error: String)
}