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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.rubenkidinicio.R
import kotlinx.coroutines.delay
import com.example.rubenkidinicio.ui.theme.fleurdeleah //< Importa Fuente de texto principal desde donde la declaraste
import com.example.rubenkidinicio.ui.theme.fondoprincipal //Importa color de azul de fondo principal

@Composable
fun SplashScreen(navController: NavHostController) {

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
            .background(fondoprincipal),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.icon), // tu logo en drawable
                contentDescription = "Logo Rubén Kid",
                modifier = Modifier.size(140.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Título principal
            Text(
                text = "Rubén kid",
                fontSize = 90.sp,
                fontFamily = fleurdeleah,
                color = Color(0xFFFDBB3E) // dorado
            )
        }
    }
}
//Utilizo este codigo para visulizar el splash de la app "usa NavHostController" @neftali
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    // Usamos un "NavContrxcoller" falso para la preview
    val fakeNavController = androidx.navigation.compose.rememberNavController()
    SplashScreen(navController = fakeNavController)
}