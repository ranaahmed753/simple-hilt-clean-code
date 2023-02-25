package edu.notes.hiltapp.model.users

import android.content.Context
import edu.notes.hiltapp.remote.users.UserListner
import edu.notes.hiltapp.utility.toast_controller.ToastController

class UserRepositoryImpl(
    private val toastController: ToastController
) : UserListner {
    override fun onSuccess(message: String) {
        toastController.toast(message)
    }

    override fun failure(error: String) {
        toastController.toast(error)
    }
}