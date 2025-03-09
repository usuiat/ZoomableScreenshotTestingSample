package net.engawapg.sample.zoomablescreenshottestingsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import net.engawapg.sample.ui.ImageSample
import net.engawapg.sample.zoomablescreenshottestingsample.ui.theme.ZoomableScreenshotTestingSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ZoomableScreenshotTestingSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ImageSample(modifier = Modifier.padding(innerPadding).fillMaxSize())
                }
            }
        }
    }
}
