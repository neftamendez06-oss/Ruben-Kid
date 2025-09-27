package com.example.rubenkidinicio.presentation.screens.menu

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.rubenkidinicio.ui.theme.fleurdeleah //< Importa Fuente de texto principal desde donde la declaraste
import com.example.rubenkidinicio.ui.theme.fondosecundario //Importa color de el fondo
import com.example.rubenkidinicio.ui.theme.botones //Importa color de el botón

// Composable principal de la pantalla de menú
@Composable
fun MenuScreen() {

    // Contenedor principal que ocupa toda la pantalla
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(fondosecundario),
        contentAlignment = Alignment.TopCenter
    ) {
        // Columna principal con padding
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {

            // Encabezado: logo + texto
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.icon), // logo de la app
                    contentDescription = "Logo Rubén Kid",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(8.dp)) // espacio entre logo y texto

                Column {
                    Text(
                        text = "Rubén Kid",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = fleurdeleah,
                        color = botones // dorado
                    )
                }
            }

            Spacer(modifier = Modifier.height(85.dp)) // espacio antes de las cards

            // Lista de tarjetas (Cards) con números de ejemplo
            MenuCard("01")
            Spacer(modifier = Modifier.height(16.dp))
            MenuCard("02")
            Spacer(modifier = Modifier.height(16.dp))
            MenuCard("03")
        }
    }
}

// Composable para cada Card del menú
@Composable
fun MenuCard(number: String) {
    Card(
        onClick = { /* acción al pulsar la card */ }, // aquí puedes agregar navegación o acción
        colors = CardDefaults.cardColors(
            containerColor = botones // amarillo de la card
        ),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth(0.8f) // ocupa el 80% del ancho
            .height(200.dp)
    ) {
        // Contenedor centrado dentro de la Card
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // Número mostrado en la Card
            Text(
                text = number,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

// Preview para ver la pantalla en Android Studio
@Preview(showBackground = true)
@Composable
fun PreviewMenuScreen() {
    MenuScreen()
}