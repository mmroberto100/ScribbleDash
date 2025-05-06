package com.mmunoz.scribbledash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import com.mmunoz.scribbledash.feature_home.presentation.HomeScreen
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //https://developer.android.com/develop/ui/compose/system/insets-views-compose#system-bar-icons
        WindowCompat.getInsetsController(window, window.decorView)
            .isAppearanceLightStatusBars = true
        setContent {
            ScribbleDashTheme {
                HomeScreen()
            }
        }
    }
}