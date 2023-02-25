package edu.notes.hiltapp.remote.login

interface LoginListner {
    fun onLoading(message : String)
    fun onSuccess(message : String)
    fun onFailed(error : String)
}