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

public val Iconly.`Plus-outline`: ImageVector
    get() {
        if (`_plus-outline` != null) {
            return `_plus-outline`!!
        }
        `_plus-outline` = Builder(name = "Plus-outline", defaultWidth = 25.0.dp, defaultHeight =
                25.0.dp, viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 8.9602f)
                verticalLineTo(16.1082f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8279f, 12.5344f)
                horizontalLineTo(8.6719f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2499f, 2.7976f)
                curveTo(19.5519f, 2.7976f, 21.9869f, 5.2326f, 21.9869f, 12.5346f)
                curveTo(21.9869f, 19.8366f, 19.5519f, 22.2716f, 12.2499f, 22.2716f)
                curveTo(4.9479f, 22.2716f, 2.5129f, 19.8366f, 2.5129f, 12.5346f)
                curveTo(2.5129f, 6.5646f, 4.1409f, 3.8476f, 8.7249f, 3.0556f)
            }
        }
        .build()
        return `_plus-outline`!!
    }

private var `_plus-outline`: ImageVector? = null
