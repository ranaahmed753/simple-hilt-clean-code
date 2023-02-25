package edu.notes.hiltapp.remote.login

import javax.inject.Inject

class FirebaseLoginStrategy @Inject constructor(
    private val loginListner: LoginListner
) : LoginStrategy {
    private lateinit var _loginListner:LoginListner
    init {
        this._loginListner = loginListner
    }
    override fun login(email: String, password: String) {
        _loginListner.onLoading("Loading.....")
        if(email != "" && password != ""){
            _loginListner.onSuccess("you are logged in")
        }else{
            _loginListner.onFailed("logged in failed!!")
        }
    }
}