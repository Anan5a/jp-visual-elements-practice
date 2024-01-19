package com.example.visualelements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.visualelements.ui.theme.VisualElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    TestModifiers()
//                    TestSizing()
//                    DrawLayout()
//                    TestText()
//                    TestTheme()
//                    TestImage()
//                    TestButton()
//                    TestProfile()
//                    TestLazyLists()
//                    TestLongPageScroll()
//                    TestGesture()
//                    TestDragging()
//                    TestProgressIndicator()
//                    TestAlertDialog()
//                    TestSideEffects()
                    TestDogList()
//                    Toast.makeText(LocalContext.current, "Hi there genius!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
