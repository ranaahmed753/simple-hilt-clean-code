package edu.notes.hiltapp.model.signup_repository

import edu.notes.hiltapp.remote.signup.SignupHandler
import edu.notes.hiltapp.remote.signup.SignupListner
import javax.inject.Inject

class FirebaseSignupRepository @Inject constructor(
    private val signupHandler: SignupHandler,
    private val signupListner: SignupListner

) {
    fun signup(email:String,password:String){
        signupHandler.signup(email,password,signupListner)
    }
}