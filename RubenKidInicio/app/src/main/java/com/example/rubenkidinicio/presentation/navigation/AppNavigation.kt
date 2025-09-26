package com.example.rubenkidinicio.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rubenkidinicio.presentation.screens.splash.SplashScreen
import com.example.rubenkidinicio.presentation.screens.menu.MenuScreen
import com.example.rubenkidinicio.presentation.screens.welcome.WelcomeScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("welcome") { WelcomeScreen(onNavigateToMenu = { navController.navigate("menu") })
        }
        composable("menu") {
            MenuScreen()
        }
    }
}
