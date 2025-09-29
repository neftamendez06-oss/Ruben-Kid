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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rubenkidinicio.R
import com.example.rubenkidinicio.ui.theme.fleurdeleah //Importa Fuente de texto principal desde donde la declaraste
import com.example.rubenkidinicio.ui.theme.fondoprincipal //Importa color de el fondo
import com.example.rubenkidinicio.ui.theme.botones //Importa color de el botón

// Composable de la pantalla de bienvenida
// Recibe una lambda onNavigateToMenu que se ejecuta cuando se presiona el botón
@Composable
fun WelcomeScreen(onNavigateToMenu: () -> Unit) {

    // Contenedor principal que ocupa toda la pantalla y centra el contenido
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(fondoprincipal),
        contentAlignment = Alignment.Center
    ) {
        // Columna para organizar los elementos verticalmente
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            // Logo de la app
            Image(
                painter = painterResource(id = R.drawable.icon),
                contentDescription = "Logo Rubén Kid",
                modifier = Modifier.size(140.dp)
            )

            Spacer(modifier = Modifier.height(1.dp)) // espacio entre logo y texto

            // Título principal
            Text(
                text = "Rubén kid",
                fontSize = 90.sp,
                fontFamily = fleurdeleah,
                color = botones // dorado
            )

            Spacer(modifier = Modifier.height(35.dp)) // espacio antes del botón

            // Botón de "INICIO" que navega a la pantalla de menú
            Button(
                onClick = { onNavigateToMenu() }, // llama a la lambda para navegar
                colors = ButtonDefaults.buttonColors(
                    containerColor = botones,
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
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(onNavigateToMenu = {})
}

