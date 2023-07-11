package com.kyutypes.app.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.kyutypes.app.presentation.ui.theme.Convert
import com.kyutypes.app.presentation.ui.theme.Home
import com.kyutypes.app.presentation.ui.theme.Result
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayoutHome() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Time Magician")
                },
                actions = {
                    IconButton(onClick = { doSomething() }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

fun doSomething() {
    Log.e("Do something ya", "H A L A")
}

@Composable
fun BodyContent(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hi there!")
        Text(text = "Thanks!")
    }
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