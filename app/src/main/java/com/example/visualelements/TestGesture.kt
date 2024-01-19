package com.example.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp

@Composable
fun TestGesture() {
    val gestureDetection = remember {
        mutableStateOf("no gesture")
    }
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var textState by remember {
            mutableStateOf(0)
        }
        Text(text = gestureDetection.value)
        Box(modifier = Modifier
            .background(Color.LightGray)
            .size(200.dp)
            .clickable { textState += 1 }
            .pointerInput(Unit) {
                detectTapGestures(
                    onTap = { gestureDetection.value = "on tap: (${it.x}, ${it.y})" },
                    onPress = { gestureDetection.value = "on press" },
                    onLongPress = { gestureDetection.value = "on long press" },
                    onDoubleTap = { gestureDetection.value = "on double tap" },
                )
            }) {
            Text(text = "Clicked $textState times", modifier = Modifier.align(Alignment.Center))
        }
    }
}