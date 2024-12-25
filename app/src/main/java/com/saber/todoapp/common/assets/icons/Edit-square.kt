package com.saber.todoapp.common.assets.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly

public val Iconly.`Edit-square`: ImageVector
    get() {
        if (`_edit-square` != null) {
            return `_edit-square`!!
        }
        `_edit-square` = Builder(name = "Edit square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.7505f, 16.362f)
                curveTo(2.7505f, 19.444f, 4.6695f, 21.621f, 7.7535f, 21.621f)
                horizontalLineTo(16.5775f)
                curveTo(19.6625f, 21.621f, 21.5815f, 19.444f, 21.5815f, 16.362f)
                verticalLineTo(12.334f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4925f, 2.789f)
                horizontalLineTo(7.7535f)
                curveTo(4.6785f, 2.789f, 2.7505f, 4.966f, 2.7505f, 8.048f)
                verticalLineTo(12.205f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.8281f, 10.9209f)
                lineTo(16.3011f, 3.4479f)
                curveTo(17.2321f, 2.5179f, 18.7411f, 2.5179f, 19.6721f, 3.4479f)
                lineTo(20.8891f, 4.6649f)
                curveTo(21.8201f, 5.5959f, 21.8201f, 7.1059f, 20.8891f, 8.0359f)
                lineTo(13.3801f, 15.5449f)
                curveTo(12.9731f, 15.9519f, 12.4211f, 16.1809f, 11.8451f, 16.1809f)
                horizontalLineTo(8.0991f)
                lineTo(8.1931f, 12.4009f)
                curveTo(8.2071f, 11.8449f, 8.4341f, 11.3149f, 8.8281f, 10.9209f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.1655f, 4.6025f)
                lineTo(17.4485f, 6.8855f)
            }
        }
        .build()
        return `_edit-square`!!
    }

private var `_edit-square`: ImageVector? = null
