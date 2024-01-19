package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TestDogList() {
    val dogs = getDogs()

    LazyColumn {
        item {
            Text(
                text = "Most popular doggos..",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
        items(dogs) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(4.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xDEF0F0F0))
            ) {
                val painterRes = painterResource(id = it.imgId)
                Image(
                    painter = painterRes,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                        .weight(2f)
                ) {
                    Text(text = it.name, fontWeight = FontWeight.Bold)
                    Text(text = it.desc, fontSize = 10.sp, lineHeight = 10.sp)
                }

            }
        }
    }
}