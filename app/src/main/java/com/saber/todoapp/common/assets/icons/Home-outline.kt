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

public val Iconly.`Home-outline`: ImageVector
    get() {
        if (`_home-outline` != null) {
            return `_home-outline`!!
        }
        `_home-outline` = Builder(name = "Home-outline", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.343f, 16.1354f)
                horizontalLineTo(15.158f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2501f, 22.0f)
                curveTo(4.6231f, 22.0f, 2.6641f, 22.0f, 2.6641f, 13.713f)
                curveTo(2.6641f, 8.082f, 3.2781f, 8.475f, 6.5831f, 5.41f)
                curveTo(8.0291f, 4.246f, 10.2791f, 2.0f, 12.2221f, 2.0f)
                curveTo(14.1641f, 2.0f, 16.4591f, 4.235f, 17.9181f, 5.41f)
                curveTo(21.2231f, 8.475f, 21.8361f, 8.082f, 21.8361f, 13.713f)
                curveTo(21.8361f, 20.228f, 20.6251f, 21.621f, 16.4021f, 21.919f)
            }
        }
        .build()
        return `_home-outline`!!
    }

private var `_home-outline`: ImageVector? = null
