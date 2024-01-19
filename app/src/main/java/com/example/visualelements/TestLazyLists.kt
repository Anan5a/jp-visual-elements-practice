package com.example.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TestLazyLists() {

    val imgList = listOf(
        R.drawable.d10_pointer,
        R.drawable.d11_boxer,
        R.drawable.d12_husky,
        R.drawable.d13_dachsund,
        R.drawable.d14_great_dane,
        R.drawable.d1_lab,
        R.drawable.d15_corgi,
        R.drawable.d16_doberman,
        R.drawable.d17_australian_shepherd,
        R.drawable.d18_schnauzer,
        R.drawable.d19_spaniel,
    )
    val gridImages = arrayListOf<Int>()
    for (i in 1..99) gridImages.add(imgList.random())

    LazyVerticalGrid(columns = GridCells.Adaptive(150.dp), content = {
        items(gridImages) {
            val painterRes = painterResource(id = it)
            Image(
                painter = painterRes,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    })


//    val names=  listOf("Sayem","Prodhan", "Ananta")
//
//    LazyColumn(content = {
//        item { Text(text = "Header of the list", modifier=Modifier.height(100.dp)) }
//        items(names){ Text(text = "Hello $it", modifier=Modifier.height(100.dp))}
//        items(10){ Text(text = "User number $it", modifier=Modifier.height(100.dp))}
//    })
}