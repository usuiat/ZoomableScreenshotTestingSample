This is a sample project that confirms that zoomable and screenshot testing can be used together.

The [ImageSample](https://github.com/usuiat/ZoomableScreenshotTestingSample/blob/0c461e7e67f0f124ed3646071d2cf63d1b9050aa/ui/src/main/java/net/engawapg/sample/ui/ImageComposable.kt#L17) Composable function applies zoomable to Coil's AsyncImage.
A preview is also defined.

The project is set up to run the screenshot test with Showkase and Paparazzi.
Both recording screenshots with the recordPaparazziDebug task and verifying differences with the verifyPaparazziDebug task are working fine.

The differences when [adding a border](https://github.com/usuiat/ZoomableScreenshotTestingSample/commit/0c461e7e67f0f124ed3646071d2cf63d1b9050aa) are shown in the image below.
You can see that the differences are recorded as expected.

![image](https://github.com/user-attachments/assets/0898cdbc-4d49-4b81-9ea0-a4c5efe87054)

[Using only Paparazzi without Showkase](https://github.com/usuiat/ZoomableScreenshotTestingSample/tree/paparazzi-only) had no problems as well.
