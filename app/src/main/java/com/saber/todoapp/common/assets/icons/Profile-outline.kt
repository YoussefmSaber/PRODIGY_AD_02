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

val Iconly.`Profile-outline`: ImageVector
    get() {
        if (`_profile-outline` != null) {
            return `_profile-outline`!!
        }
        `_profile-outline` = Builder(name = "Profile-outline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1601f, 10.87f)
                curveTo(12.0601f, 10.86f, 11.9401f, 10.86f, 11.8301f, 10.87f)
                curveTo(9.4501f, 10.79f, 7.5601f, 8.84f, 7.5601f, 6.44f)
                curveTo(7.5601f, 3.99f, 9.5401f, 2.0f, 12.0001f, 2.0f)
                curveTo(14.4501f, 2.0f, 16.4401f, 3.99f, 16.4401f, 6.44f)
                curveTo(16.4301f, 8.84f, 14.5401f, 10.79f, 12.1601f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1602f, 14.56f)
                curveTo(4.7402f, 16.18f, 4.7402f, 18.82f, 7.1602f, 20.43f)
                curveTo(9.9102f, 22.27f, 14.4202f, 22.27f, 17.1702f, 20.43f)
                curveTo(19.5902f, 18.81f, 19.5902f, 16.17f, 17.1702f, 14.56f)
                curveTo(14.4302f, 12.73f, 9.9202f, 12.73f, 7.1602f, 14.56f)
                close()
            }
        }
        .build()
        return `_profile-outline`!!
    }

private var `_profile-outline`: ImageVector? = null
