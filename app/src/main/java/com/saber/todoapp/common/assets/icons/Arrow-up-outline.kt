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

val Iconly.`Arrow-up-outline`: ImageVector
    get() {
        if (`_arrow-up-outline` != null) {
            return `_arrow-up-outline`!!
        }
        `_arrow-up-outline` = Builder(name = "Arrow-up-outline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0799f, 15.05f)
                lineTo(10.5999f, 8.5301f)
                curveTo(11.3699f, 7.76f, 12.6299f, 7.76f, 13.3999f, 8.5301f)
                lineTo(19.9199f, 15.05f)
            }
        }
        .build()
        return `_arrow-up-outline`!!
    }

private var `_arrow-up-outline`: ImageVector? = null
