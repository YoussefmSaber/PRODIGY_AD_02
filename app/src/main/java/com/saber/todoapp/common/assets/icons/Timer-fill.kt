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

val Iconly.`Timer-fill`: ImageVector
    get() {
        if (`_timer-fill` != null) {
            return `_timer-fill`!!
        }
        `_timer-fill` = Builder(name = "Timer-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 4.6499f)
                curveTo(7.2201f, 4.6499f, 3.3301f, 8.5399f, 3.3301f, 13.3199f)
                curveTo(3.3301f, 18.0999f, 7.2201f, 21.9999f, 12.0001f, 21.9999f)
                curveTo(16.7801f, 21.9999f, 20.6701f, 18.1099f, 20.6701f, 13.3299f)
                curveTo(20.6701f, 8.5499f, 16.7801f, 4.6499f, 12.0001f, 4.6499f)
                close()
                moveTo(12.7501f, 12.9999f)
                curveTo(12.7501f, 13.4099f, 12.4101f, 13.7499f, 12.0001f, 13.7499f)
                curveTo(11.5901f, 13.7499f, 11.2501f, 13.4099f, 11.2501f, 12.9999f)
                verticalLineTo(7.9999f)
                curveTo(11.2501f, 7.5899f, 11.5901f, 7.2499f, 12.0001f, 7.2499f)
                curveTo(12.4101f, 7.2499f, 12.7501f, 7.5899f, 12.7501f, 7.9999f)
                verticalLineTo(12.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8899f, 3.45f)
                horizontalLineTo(9.1099f)
                curveTo(8.7099f, 3.45f, 8.3899f, 3.13f, 8.3899f, 2.73f)
                curveTo(8.3899f, 2.33f, 8.7099f, 2.0f, 9.1099f, 2.0f)
                horizontalLineTo(14.8899f)
                curveTo(15.2899f, 2.0f, 15.6099f, 2.32f, 15.6099f, 2.72f)
                curveTo(15.6099f, 3.12f, 15.2899f, 3.45f, 14.8899f, 3.45f)
                close()
            }
        }
        .build()
        return `_timer-fill`!!
    }

private var `_timer-fill`: ImageVector? = null
