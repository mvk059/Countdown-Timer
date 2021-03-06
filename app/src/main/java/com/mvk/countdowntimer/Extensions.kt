package com.mvk.countdowntimer

import android.graphics.Color
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color as Colors
import androidx.compose.ui.graphics.SolidColor

fun Window.makeTransparentStatusBar() {
    markAttributes(
        WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
        true
    )
    decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
    markAttributes(
        WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
        false
    )
    statusBarColor = Color.TRANSPARENT
    navigationBarColor = Color.TRANSPARENT
}

fun Window.markAttributes(bits: Int, value: Boolean) {

}

fun Colors.toBrush(): Brush = SolidColor(this)