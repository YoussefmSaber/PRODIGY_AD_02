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

val Iconly.`Profile-fill`: ImageVector
    get() {
        if (`_profile-fill` != null) {
            return `_profile-fill`!!
        }
        `_profile-fill` = Builder(name = "Profile-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.38f, 2.0f, 7.25f, 4.13f, 7.25f, 6.75f)
                curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                curveTo(16.75f, 4.13f, 14.62f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.08f, 14.1499f)
                curveTo(14.29f, 12.2899f, 9.74f, 12.2899f, 6.93f, 14.1499f)
                curveTo(5.66f, 14.9999f, 4.96f, 16.1499f, 4.96f, 17.3799f)
                curveTo(4.96f, 18.6099f, 5.66f, 19.7499f, 6.92f, 20.5899f)
                curveTo(8.32f, 21.5299f, 10.16f, 21.9999f, 12.0f, 21.9999f)
                curveTo(13.84f, 21.9999f, 15.68f, 21.5299f, 17.08f, 20.5899f)
                curveTo(18.34f, 19.7399f, 19.04f, 18.5999f, 19.04f, 17.3599f)
                curveTo(19.03f, 16.1299f, 18.34f, 14.9899f, 17.08f, 14.1499f)
                close()
            }
        }
        .build()
        return `_profile-fill`!!
    }

private var `_profile-fill`: ImageVector? = null
