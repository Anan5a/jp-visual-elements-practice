package com.example.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestAlertDialog() {
    val openDialog = remember {
        mutableStateOf(false)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "Open Dialog")
        }
        if (openDialog.value)
            AlertDialog(
                onDismissRequest = { openDialog.value = false },
                title = { Text(text = "Hello") },
                text = { Text(text = "Some description of the alert...") },
                confirmButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "Good")
                    }
                },
                dismissButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "No!")
                    }
                }
            )
//            AlertDialog(onDismissRequest = { openDialog.value=false }) {
//
//            }
    }
}