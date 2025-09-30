package com.example.rubenkidinicio.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.rubenkidinicio.presentation.screens.splash.SplashScreen
import com.example.rubenkidinicio.presentation.screens.menu.MenuScreen
import com.example.rubenkidinicio.presentation.screens.menu.Story1
import com.example.rubenkidinicio.presentation.screens.menu.Story2
import com.example.rubenkidinicio.presentation.screens.menu.Story3
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
        composable("menu") {
            MenuScreen(
                onNavigateToStory1 = { navController.navigate("Story1") },
                onNavigateToStory2 = { navController.navigate("Story2") },
                onNavigateToStory3 = { navController.navigate("Story3") }
            )
        }
        // Voy a definir las pantallas de los stories aqui//
        composable("Story1") {Story1()}
        composable("Story2") {Story2()}
        composable("Story3") {Story3()}
    }
}
