package edu.notes.hiltapp.remote.login

import javax.inject.Inject

class LoginHandler @Inject constructor(
    private val _loginStrategy: LoginStrategy
) {
    private lateinit var loginStrategy: LoginStrategy
    init {
        this.loginStrategy = _loginStrategy
    }
    fun login(email:String,password:String,loginListner: LoginListner){
        loginStrategy.login(email,password,loginListner)
    }
}