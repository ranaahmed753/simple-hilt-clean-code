package edu.notes.hiltapp.remote.signup

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class SignupHandler @Inject constructor(
    private val signupStrategy: SignupStrategy
){
    private lateinit var _signupStrategy: SignupStrategy
    init {
        this._signupStrategy = signupStrategy
    }
    fun signup(email:String,password:String,signupListner: SignupListner){
        _signupStrategy.signup(email,password,signupListner)
    }

}