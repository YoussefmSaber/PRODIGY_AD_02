package com.saber.todoapp.common.assets.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly


val Iconly.`Arrow-right-outline`: ImageVector
    get() {
        if (`_arrow-right-outline` != null) {
            return `_arrow-right-outline`!!
        }
        `_arrow-right-outline` = Builder(name = "Arrow-right-outline", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF797979)),
                strokeLineWidth = 1.5f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.43f, 5.93f) // Starting point of the arrowhead
                lineTo(20.5f, 12.0f)  // Top-right corner of the arrowhead
                lineTo(14.43f, 18.07f) // Bottom-right corner of the arrowhead
            }
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF797979)),
                strokeLineWidth = 1.5f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5f, 12.0f) // Starting point of the horizontal line
                horizontalLineTo(20.33f) // Ending point of the horizontal line
            }
        }
            .build()
        return `_arrow-right-outline`!!
    }

private var `_arrow-right-outline`: ImageVector? = null
