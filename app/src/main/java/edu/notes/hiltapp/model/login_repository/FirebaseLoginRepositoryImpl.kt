package edu.notes.hiltapp.model.login_repository

import android.content.Context
import edu.notes.hiltapp.remote.login.LoginListner
import edu.notes.hiltapp.utility.toast_controller.ToastController
import javax.inject.Inject

class FirebaseLoginRepositoryImpl @Inject constructor(
    private val toastController: ToastController
) : LoginListner {
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