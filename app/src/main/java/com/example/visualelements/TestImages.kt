package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TestImage() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(100.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            val image = painterResource(id = R.drawable.wallpaper_zero_two)
            Image(
                painter = image,
                contentDescription = "Some description",
                contentScale = ContentScale.Crop
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(100.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            val image = painterResource(id = R.drawable.ic_celebration_round)

            Image(
                painter = image,
                contentDescription = "Vector icon",
                contentScale = ContentScale.None,
                colorFilter = ColorFilter.tint(Color.Red)
            )
        }

        AsyncImage(
            model = "https://fakeimg.pl/600x400/cccccc/cc2222?text=Hello+World&font=lobster",
            contentDescription = ""
        )


    }


}