package com.example.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun TestProgressIndicator() {
    var linear by remember {
        mutableStateOf(false)
    }
    var circular by remember {
        mutableStateOf(false)
    }

    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Button(onClick = {
            linear = true
            circular = false
        }) {
            Text(text = "Linear progress bar")
        }
        Button(onClick = {
            linear = false
            circular = true
        }) {
            Text(text = "Circular progress bar")
        }
        Button(onClick = {
            linear = true
            circular = true
        }) {
            Text(text = "Both progress bar")
        }
        if (linear) LinearProgressIndicator()
        if (circular) CircularProgressIndicator()
    }
}