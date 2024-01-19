package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TestProfile() {
    val profileImageRes = painterResource(id = R.drawable.profile_picture)
    val dogs = R.array.dogs

    Column(modifier = Modifier.background(Color.LightGray)) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(8.dp)
                .height(150.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
//                    .padding(10.dp)
//                    .width(120.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,

                ) {
                Image(
                    painter = profileImageRes, contentDescription = null, modifier = Modifier.clip(
                        CircleShape
                    )
                )


            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
//                    .padding(10.dp)
//                    .width(120.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
//                    .padding(5.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "120", fontWeight = FontWeight.Bold, color = Color.Black)
//                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Posts", color = Color.Black)
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
//                    .padding(10.dp)
//                    .width(120.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
//                    .padding(5.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "1234", fontWeight = FontWeight.Bold, color = Color.Black)
//                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Followers", color = Color.Black)
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
//                    .padding(10.dp)
//                    .width(120.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
//                    .padding(5.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "567", fontWeight = FontWeight.Bold, color = Color.Black)
//                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Following", color = Color.Black)
            }
        }
//        Row(
//            modifier = Modifier.padding(20.dp),
//            verticalAlignment = Alignment.Top,
////            horizontalArrangement = Arrangement.Center
//        ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = "Sayem Prodhan",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium,
//                    modifier = Modifier.
            )
            Text(text = "I like traveling\nGardening\nSleeping...")


        }
//        }
        Row(modifier = Modifier.padding(8.dp)) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(1f),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
//                    colors = ButtonColors(),
//                    enabled = false,
            ) {
                Text(text = "Edit Profile", modifier = Modifier.padding(4.dp))
            }
        }

        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.d10_pointer),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(id = R.drawable.d11_boxer),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d12_husky),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.d13_dachsund),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d14_great_dane),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d19_spaniel),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.d10_pointer),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d11_boxer),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d12_husky),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .weight(1f)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.d15_corgi),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d16_doberman),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.d17_australian_shepherd),
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )

            }
        }
    }
}