package edu.notes.hiltapp.remote.signup

import javax.inject.Inject

class FirebaseSignupStrategy @Inject constructor(
    private val signupListner: SignupListner
) : SignupStrategy {
    override fun signup(email: String, password: String) {
        signupListner.onLoading("creating user....")
        if(email != "" && password != ""){
            signupListner.onSuccess("account created successfully")
        }else{
            signupListner.onFailed("account created failed!!")
        }
    }
}