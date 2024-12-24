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

val Iconly.`Share-fill`: ImageVector
    get() {
        if (`_share-fill` != null) {
            return `_share-fill`!!
        }
        `_share-fill` = Builder(name = "Share-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7001f, 10.1999f)
                lineTo(15.1001f, 4.2f)
                curveTo(14.6001f, 3.6999f, 14.0001f, 4.2f, 14.0001f, 4.9999f)
                verticalLineTo(7.9999f)
                curveTo(9.3001f, 7.9999f, 5.3001f, 10.8999f, 3.4002f, 14.7999f)
                curveTo(2.7002f, 16.0999f, 2.3001f, 17.4999f, 2.0001f, 18.8999f)
                curveTo(1.8002f, 19.8999f, 3.3001f, 20.3999f, 3.9002f, 19.4999f)
                curveTo(6.1002f, 15.9999f, 9.8001f, 13.6999f, 14.0001f, 13.6999f)
                verticalLineTo(16.9999f)
                curveTo(14.0001f, 17.7999f, 14.6001f, 18.2999f, 15.1001f, 17.7999f)
                lineTo(21.7001f, 11.7999f)
                curveTo(22.1001f, 11.3999f, 22.1001f, 10.5999f, 21.7001f, 10.1999f)
                close()
            }
        }
        .build()
        return `_share-fill`!!
    }

private var `_share-fill`: ImageVector? = null
