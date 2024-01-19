package com.example.visualelements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TestLongPageScroll() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(text = "Terms and conditions", fontWeight = FontWeight.Bold)
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))

        Text(text = stringResource(id = R.string.lorem_ipsum))

    }
}