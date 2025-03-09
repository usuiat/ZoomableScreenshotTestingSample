package net.engawapg.sample.ui

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import net.engawapg.lib.zoomable.rememberZoomState
import net.engawapg.lib.zoomable.zoomable

@Composable
fun ImageSample(modifier: Modifier = Modifier) {
    val zoomState = rememberZoomState()
    AsyncImage(
        model = "https://github.com/usuiat.png",
        contentDescription = null,
        contentScale = ContentScale.Fit,
        error = painterResource(R.drawable.noimage),
        onSuccess = { zoomState.setContentSize(it.painter.intrinsicSize) },
        modifier = modifier.zoomable(zoomState)
    )
}

@Preview(name = "ImageSamplePreview", group = "ui", showBackground = true)
@Composable
fun ImageSamplePreview() {
    Surface {
        ImageSample()
    }
}
