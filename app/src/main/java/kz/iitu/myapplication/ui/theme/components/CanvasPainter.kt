package kz.iitu.myapplication.ui.theme.components

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun CanvasPainter() {
    Canvas(modifier = Modifier) {
        drawCircle(color = Color.Red, radius = 100f, style = Stroke(width = 4f))
        drawLine(
            start = center,
            end = center.copy(x = size.width),
            color = Color.Blue,
            strokeWidth = 4f
        )
    }
}