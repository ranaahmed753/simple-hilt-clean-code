package edu.notes.hiltapp.model.signup_repository

import android.content.Context
import android.widget.Toast
import edu.notes.hiltapp.remote.signup.SignupListner
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Inject

class FirebaseSignupRepositoryImpl @Inject constructor(
    private val toastController: ToastController
) : SignupListner {
    override fun onLoading(message: String) {
        toastController.toast(message)
    }

    override fun onSuccess(message: String) {
        toastController.toast(message)
    }

    override fun onFailed(error: String) {
        toastController.toast(error)
    }
}