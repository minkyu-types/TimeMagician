package com.kyutypes.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.kyutypes.app.presentation.ui.theme.Convert
import com.kyutypes.app.presentation.ui.theme.Home
import com.kyutypes.app.presentation.ui.theme.Result
import com.kyutypes.app.presentation.ui.theme.Screen
import com.kyutypes.app.presentation.ui.theme.TimeMagicianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutHomePreview()
            val navController = rememberNavController()
            val home = Home
            val convert = Convert
            val result = Result
        }
    }
}

@Composable
fun LayoutHome() {

}

@Preview
@Composable
fun LayoutHomePreview() {
    TimeMagicianTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LayoutHome()
        }
    }
}