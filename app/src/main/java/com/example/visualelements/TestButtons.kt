package com.example.visualelements

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun TestButton() {
    val context = LocalContext.current
    val image = painterResource(id = R.drawable.ic_celebration_round)



    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            Toast.makeText(context, "You clicked da button!", Toast.LENGTH_SHORT).show()
        }, shape = MaterialTheme.shapes.medium) {
            Image(
                painter = image,
                contentDescription = "Vector icon",
                contentScale = ContentScale.None,
                colorFilter = ColorFilter.tint(Color.White)
            )
            Text(text = "Click me!")
        }

    }
}