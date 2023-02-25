package edu.notes.hiltapp.remote.login

class FirebaseLoginStrategy : LoginStrategy {
    override fun login(email: String, password: String, loginListner: LoginListner) {
        loginListner.onLoading("Loading.....")
        if(email != "" && password != ""){
            loginListner.onSuccess("you are logged in")
        }else{
            loginListner.onFailed("logged in failed!!")
        }
    }
}