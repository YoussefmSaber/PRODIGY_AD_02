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

val Iconly.`Arrow-down-outline`: ImageVector
    get() {
        if (`_arrow-down-outline` != null) {
            return `_arrow-down-outline`!!
        }
        `_arrow-down-outline` = Builder(name = "Arrow-down-outline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9201f, 8.95f)
                lineTo(13.4001f, 15.47f)
                curveTo(12.6301f, 16.24f, 11.3701f, 16.24f, 10.6001f, 15.47f)
                lineTo(4.0801f, 8.95f)
            }
        }
        .build()
        return `_arrow-down-outline`!!
    }

private var `_arrow-down-outline`: ImageVector? = null
