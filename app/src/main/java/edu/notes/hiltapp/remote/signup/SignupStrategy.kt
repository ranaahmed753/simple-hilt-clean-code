package edu.notes.hiltapp.remote.signup

interface SignupStrategy{
    fun signup(email:String,password:String)
}