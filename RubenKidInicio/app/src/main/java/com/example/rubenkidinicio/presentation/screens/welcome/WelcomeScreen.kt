package com.example.rubenkidinicio.presentation.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rubenkidinicio.R

// Composable de la pantalla de bienvenida
// Recibe una lambda onNavigateToMenu que se ejecuta cuando se presiona el botón
@Composable
fun WelcomeScreen(onNavigateToMenu: () -> Unit) {

    // Definimos colores que se usarán en la pantalla
    val backgroundColor = Color(0xFF1E1E90) // azul de fondo
    val goldColor = Color(0xFFFFD700)       // color dorado para el texto principal
    val yellowColor = Color(0xFFFFC107)     // color amarillo para el botón

    // Contenedor principal que ocupa toda la pantalla y centra el contenido
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        // Columna para organizar los elementos verticalmente
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            // Logo de la app
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "Logo Rubén Kid",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(16.dp)) // espacio entre logo y texto

            // Título principal
            Text(
                text = "Rubén Kid",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = goldColor
            )

            // Subtítulo o descripción
            Text(
                text = "EL LOGO VA AQUÍ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp)) // espacio antes del botón

            // Botón de "INICIO" que navega a la pantalla de menú
            Button(
                onClick = { onNavigateToMenu() }, // llama a la lambda para navegar
                colors = ButtonDefaults.buttonColors(
                    containerColor = yellowColor,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(200.dp)
                    .height(55.dp)
            ) {
                Text(
                    text = "INICIO",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}