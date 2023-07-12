package com.kyutypes.app.presentation.ui

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kyutypes.app.domain.usecase.HistoryUseCases
import com.kyutypes.app.presentation.viewmodel.HomeViewModel

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

        NavHost(navController = navController,
            startDestination = Screens.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screens.Home.name) {

            }
            composable(route = Screens.Convert.name) {

            }
            composable(route = Screens.Result.name) {

            }
        }
    }
}

fun doSomething() {
    Log.e("Do something ya", "H A L A")
}