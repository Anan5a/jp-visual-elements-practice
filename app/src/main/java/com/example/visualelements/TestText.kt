package com.example.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp

@Composable
fun TestText() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
//        Text(text = "This is a text!")
        Text(text = stringResource(R.string.hello_text))
        Text(
            text = "Formatted text!",
            color = Color.Red,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "First name") },
            placeholder = { Text("A hint..") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        var surname by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = surname,
            onValueChange = { surname = it },
            label = { Text(text = "Surname") },
            placeholder = { Text("A hint..") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
    }
}