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

val Iconly.`Location-fill`: ImageVector
    get() {
        if (`_location-fill` != null) {
            return `_location-fill`!!
        }
        `_location-fill` = Builder(name = "Location-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6201f, 8.45f)
                curveTo(19.5701f, 3.83f, 15.5401f, 1.75f, 12.0001f, 1.75f)
                curveTo(12.0001f, 1.75f, 12.0001f, 1.75f, 11.9901f, 1.75f)
                curveTo(8.4601f, 1.75f, 4.4201f, 3.82f, 3.3701f, 8.44f)
                curveTo(2.2001f, 13.6f, 5.3601f, 17.97f, 8.2201f, 20.72f)
                curveTo(9.2801f, 21.74f, 10.6401f, 22.25f, 12.0001f, 22.25f)
                curveTo(13.3601f, 22.25f, 14.7201f, 21.74f, 15.7701f, 20.72f)
                curveTo(18.6301f, 17.97f, 21.7901f, 13.61f, 20.6201f, 8.45f)
                close()
                moveTo(12.0001f, 13.46f)
                curveTo(10.2601f, 13.46f, 8.8501f, 12.05f, 8.8501f, 10.31f)
                curveTo(8.8501f, 8.57f, 10.2601f, 7.16f, 12.0001f, 7.16f)
                curveTo(13.7401f, 7.16f, 15.1501f, 8.57f, 15.1501f, 10.31f)
                curveTo(15.1501f, 12.05f, 13.7401f, 13.46f, 12.0001f, 13.46f)
                close()
            }
        }
        .build()
        return `_location-fill`!!
    }

private var `_location-fill`: ImageVector? = null
