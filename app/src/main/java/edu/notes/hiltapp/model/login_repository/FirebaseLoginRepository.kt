package edu.notes.hiltapp.model.login_repository

import edu.notes.hiltapp.remote.login.LoginHandler
import edu.notes.hiltapp.remote.login.LoginListner
import javax.inject.Inject

class FirebaseLoginRepository @Inject constructor(
    private val loginHandler: LoginHandler,
    private val loginListner: LoginListner
) {
    fun login(email:String,password:String){
        loginHandler.login(email,password,loginListner)
    }
}