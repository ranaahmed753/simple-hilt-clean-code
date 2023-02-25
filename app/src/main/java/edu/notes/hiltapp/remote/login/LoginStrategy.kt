package edu.notes.hiltapp.remote.login

import edu.notes.hiltapp.remote.signup.SignupListner

interface LoginStrategy {
    fun login(email:String,password:String)
}