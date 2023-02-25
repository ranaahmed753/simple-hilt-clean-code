package edu.notes.hiltapp.remote.signup

interface SignupListner {
    fun onLoading(message : String)
    fun onSuccess(message : String)
    fun onFailed(error : String)
}