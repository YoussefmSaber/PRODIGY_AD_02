package com.saber.todoapp.common.assets.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly

val Iconly.`Star-outline`: ImageVector
    get() {
        if (`_star-outline` != null) {
            return `_star-outline`!!
        }
        `_star-outline` = Builder(name = "Star-outline", defaultWidth = 24.0.dp, defaultHeight =
                25.0.dp, viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1888f, 2.2318f)
                curveTo(12.8146f, 1.0801f, 11.1854f, 1.0801f, 10.8112f, 2.2318f)
                lineTo(8.7609f, 8.5418f)
                horizontalLineTo(2.1262f)
                curveTo(0.9153f, 8.5418f, 0.4118f, 10.0913f, 1.3914f, 10.8031f)
                lineTo(6.7591f, 14.7029f)
                lineTo(4.7088f, 21.0129f)
                curveTo(4.3346f, 22.1646f, 5.6527f, 23.1222f, 6.6324f, 22.4105f)
                lineTo(12.0f, 18.5106f)
                lineTo(17.3676f, 22.4105f)
                curveTo(18.3473f, 23.1222f, 19.6654f, 22.1646f, 19.2912f, 21.0129f)
                lineTo(17.2409f, 14.7029f)
                lineTo(22.6086f, 10.8031f)
                curveTo(23.5882f, 10.0913f, 23.0847f, 8.5418f, 21.8738f, 8.5418f)
                horizontalLineTo(15.2391f)
                lineTo(13.1888f, 2.2318f)
                close()
                moveTo(12.1469f, 18.4039f)
                curveTo(12.1467f, 18.404f, 12.1465f, 18.4042f, 12.1463f, 18.4043f)
                lineTo(12.1469f, 18.4039f)
                close()
            }
        }
        .build()
        return `_star-outline`!!
    }

private var `_star-outline`: ImageVector? = null
