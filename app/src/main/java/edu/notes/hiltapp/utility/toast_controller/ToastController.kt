package edu.notes.hiltapp.utility.toast_controller

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class ToastController @Inject constructor(
    private val context: Context
){
    fun toast(message : String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}