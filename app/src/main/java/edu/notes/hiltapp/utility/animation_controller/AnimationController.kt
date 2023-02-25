package edu.notes.hiltapp.utility.animation_controller

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import javax.inject.Inject

class AnimationController @Inject constructor(
    private val context: Context
) {
    fun slideInLeft(view: View){
        view.startAnimation(AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left))
    }
}