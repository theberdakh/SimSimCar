package com.theberdakh.simsimcar

import android.view.MotionEvent
import android.view.View
import java.io.OutputStream

fun View.onTouchSendListener(message: String, outputStream: OutputStream){
    this.setOnTouchListener { v, event ->
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                //Pressed
                outputStream.write(message.toByteArray())
            }

            MotionEvent.ACTION_UP -> {
                //released
                outputStream.write("S".toByteArray())
                v.performClick()
            }
            else -> {}
        }
        v.onTouchEvent(event)
    }
}