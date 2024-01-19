package com.example.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DrawLayout() {
    Column(
        modifier = Modifier
            .background(Color(0xE3FFFFFF))
            .padding(20.dp),
//        verticalArrangement = Arrangement.SpaceBetween
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
//            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(1f)
        ) {
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .background(Color(0xffff0000)),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0xffff0000")
            }
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .background(Color(0xff00ff00)),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0xff00ff00")

            }
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .background(Color(0xff0000ff)),
//                verticalArrangement = Arrangement.SpaceEvenly,
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "0xff0000ff")

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.SpaceEvenly,

            ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(100.dp)
                    .background(Color(0xffffaa00)),

                ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(100.dp)
                    .background(Color(0xffff00ff)),

                ) {}
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(100.dp)
                    .background(Color(0xffffff00)),

                ) {}
        }
        Box(
            modifier = Modifier
                .fillMaxSize(1f)
                .background(Color(0xff0055ff)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(0.8f)
                    .background(Color(0xff0099ff)),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(0.7f)
                        .background(Color(0xff00ccff)),
                    contentAlignment = Alignment.Center
                ) {}
            }
        }
    }


}