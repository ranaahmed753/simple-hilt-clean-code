package edu.notes.hiltapp.remote.signup

class FirebaseSignupStrategy : SignupStrategy {
    override fun signup(email: String, password: String,signupListner: SignupListner) {
        signupListner.onLoading("creating user....")
        if(email != "" && password != ""){
            signupListner.onSuccess("account created successfully")
        }else{
            signupListner.onFailed("account created failed!!")
        }
    }
}