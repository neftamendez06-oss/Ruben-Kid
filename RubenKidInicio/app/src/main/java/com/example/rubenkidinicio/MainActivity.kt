package com.example.rubenkidinicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.rubenkidinicio.presentation.navigation.AppNavigation
import com.example.rubenkidinicio.ui.theme.RubenKidInicioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RubenKidInicioTheme {
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}
