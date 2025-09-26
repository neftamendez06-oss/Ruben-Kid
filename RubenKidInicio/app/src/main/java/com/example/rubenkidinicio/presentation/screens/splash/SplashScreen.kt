package com.example.rubenkidinicio.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp as sp1
import androidx.navigation.NavHostController
import com.example.rubenkidinicio.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    val backgroundColor = Color(0xFF1E1E90) // azul oscuro

    // Espera 2.5 segundos y navega a la pantalla Welcome
    LaunchedEffect(Unit) {
        delay(2500L)
        navController.navigate("welcome") {
            popUpTo("splash") { inclusive = true } // elimina splash de la pila
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.icon), // tu logo en drawable
                contentDescription = "Logo Rubén Kid",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Rubén kid",
                fontSize = 32.sp1,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFD700) // dorado
            )

            Text(
                text = "EL LOGO VA AQUÍ",
                fontSize = 14.sp1,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        }
    }
}
