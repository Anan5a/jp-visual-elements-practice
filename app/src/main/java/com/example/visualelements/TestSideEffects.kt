package com.example.visualelements

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TestSideEffects() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        val showProgress = remember {
            mutableStateOf(false)
        }
        val launchEffect = remember {
            mutableStateOf(false)
        }
        Button(onClick = {
            showProgress.value = true
            launchEffect.value = true
        }) {
            Text(text = "Launch")
        }
        if (showProgress.value) CircularProgressIndicator()
        val context = LocalContext.current
        if (launchEffect.value) {
            val coroutineScope = rememberCoroutineScope()
            LaunchedEffect(key1 = Unit) {
                coroutineScope.launch {
                    delay(3000)
                    Toast.makeText(context, "A long process has finished", Toast.LENGTH_LONG).show()
                    showProgress.value = false
                    launchEffect.value = false
                }
            }
        }

    }
}