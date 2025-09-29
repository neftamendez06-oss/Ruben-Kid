package com.example.rubenkidinicio.presentation.screens.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.rubenkidinicio.R

@Composable
fun Story1() {
    // Lista de páginas del cuento (imágenes JPG en res/drawable)
    val pages = listOf(
        R.drawable.c1p1,
        R.drawable.c1p2,
        R.drawable.c1p3,
        R.drawable.c1p4,
        R.drawable.c1p5,
        R.drawable.c1p6,
        R.drawable.c1p7
    )

    // Estado del pager
    val pagerState = rememberPagerState(pageCount = { pages.size })

    // Slider horizontal con efecto de paginación
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        Image(
            painter = painterResource(id = pages[page]),
            contentDescription = "Página ${page + 1}",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds // La imagen ocupa toda la pantalla
        )
    }
}