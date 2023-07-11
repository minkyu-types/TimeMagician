package com.kyutypes.app.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kyutypes.app.domain.usecase.HistoryUseCases
import com.kyutypes.app.presentation.ui.TmScreen
import com.kyutypes.app.presentation.ui.theme.TimeMagicianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutHomePreview()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayoutHome(
) {
    val useCases = HistoryUseCases()
    val viewModel = HomeViewModel(useCases)
    val navController = rememberNavController()

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
        val uiState by viewModel.uiState.collectAsState(initial = 1)

        NavHost(
            navController = navController,
            startDestination = TmScreen.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = TmScreen.Home.name) {

            }
            composable(route = TmScreen.Convert.name) {

            }
            composable(route = TmScreen.Result.name) {

            }
        }
    }
}

fun doSomething() {
    Log.e("Do something ya", "H A L A")
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