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

val Iconly.`Location-outline`: ImageVector
    get() {
        if (`_location-outline` != null) {
            return `_location-outline`!!
        }
        `_location-outline` = Builder(name = "Location-outline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9999f, 13.4299f)
                curveTo(13.723f, 13.4299f, 15.1199f, 12.0331f, 15.1199f, 10.3099f)
                curveTo(15.1199f, 8.5868f, 13.723f, 7.1899f, 11.9999f, 7.1899f)
                curveTo(10.2768f, 7.1899f, 8.8799f, 8.5868f, 8.8799f, 10.3099f)
                curveTo(8.8799f, 12.0331f, 10.2768f, 13.4299f, 11.9999f, 13.4299f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.62f, 8.49f)
                curveTo(5.59f, -0.17f, 18.42f, -0.16f, 20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.3899f, 20.54f)
                curveTo(5.63f, 17.88f, 2.4699f, 13.57f, 3.62f, 8.49f)
                close()
            }
        }
        .build()
        return `_location-outline`!!
    }

private var `_location-outline`: ImageVector? = null
