package com.example.convoandroidengieertask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.camera.core.ExperimentalGetImage
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.convoandroidengieertask.scanner.QrScanningScreen
import com.example.convoandroidengieertask.ui.theme.ConvoAndroidEngieerTaskTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalGetImage
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConvoAndroidEngieerTaskTheme {
                // A surface container using the 'background' color from the theme
                QrScanningScreen(
                    viewModel = hiltViewModel()
                )
            }
        }
    }
}