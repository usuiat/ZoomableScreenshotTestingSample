package net.engawapg.sample.ui

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class ScreenshotTests {
    @get: Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5
    )


    @Test
    fun ImageSampleScreenshot() {
        paparazzi.snapshot {
            ImageSample()
        }
    }
}
