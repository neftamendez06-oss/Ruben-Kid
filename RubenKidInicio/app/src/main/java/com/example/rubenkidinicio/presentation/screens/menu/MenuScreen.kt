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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rubenkidinicio.R
import com.example.rubenkidinicio.ui.theme.fleurdeleah //< Importa Fuente de texto principal desde donde la declaraste
import com.example.rubenkidinicio.ui.theme.botones //Importa color de el botón
import com.example.rubenkidinicio.ui.theme.fondoprincipal
import com.example.rubenkidinicio.ui.theme.poppinsextrabold
// Composable principal de la pantalla de menú
@Composable
fun MenuScreen(
               onNavigateToStory1: () -> Unit = {},
               onNavigateToStory2: () -> Unit = {},
               onNavigateToStory3: () -> Unit = {}
) {

    // Contenedor principal que ocupa toda la pantalla
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(fondoprincipal),
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
                        text = "RubénKid",
                        fontSize = 50.sp,
                        fontFamily = fleurdeleah,
                        color = botones // dorado
                    )
                }
            }

            Spacer(modifier = Modifier.height(85.dp)) // espacio antes de las cards

            // Lista de tarjetas (Cards) con números de ejemplo
            MenuCard("El NACIMIENTO DE LA COL", R.drawable.col, onClick = onNavigateToStory1)
            Spacer(modifier = Modifier.height(25.dp))
            MenuCard("El LINCHAMIENTO DE PUCK",R.drawable.puck, onClick = onNavigateToStory2)
            Spacer(modifier = Modifier.height(25.dp))
            MenuCard("EL PALACIO DE EL SOL", R.drawable.palacio, onClick = onNavigateToStory3)
        }
    }
}

// Composable para cada Card del menú
@Composable
fun MenuCard(title: String, imageRes: Int, onClick: () -> Unit = {}) {
    Card(
        onClick = onClick,
        colors = CardDefaults.cardColors(containerColor = botones),
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(180.dp)
    ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment =  Alignment.CenterVertically
            )   {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = title,
                    modifier = Modifier
                        .clip( shape = RoundedCornerShape(20.dp))
                        .fillMaxHeight()
                )
                //Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = title,
                    fontSize = 22.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    fontFamily = poppinsextrabold,
                    modifier = Modifier
                        .padding(8.dp)
                        . weight (0.5f)


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