package com.kyutypes.app.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kyutypes.app.domain.repository.HistoryRepository
import com.kyutypes.app.presentation.ui.screen.LayoutHome
import com.kyutypes.app.presentation.ui.theme.TimeMagicianTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutHomePreview()
        }
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