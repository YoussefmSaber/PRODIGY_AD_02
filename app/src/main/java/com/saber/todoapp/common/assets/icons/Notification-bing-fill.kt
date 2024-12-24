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

val Iconly.`Notification-bing-fill`: ImageVector
    get() {
        if (`_notification-bing-fill` != null) {
            return `_notification-bing-fill`!!
        }
        `_notification-bing-fill` = Builder(name = "Notification-bing-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 14.06f)
                lineTo(19.06f, 12.18f)
                curveTo(18.81f, 11.77f, 18.59f, 10.98f, 18.59f, 10.5f)
                verticalLineTo(8.63f)
                curveTo(18.59f, 5.0001f, 15.64f, 2.0501f, 12.02f, 2.0501f)
                curveTo(8.39f, 2.0601f, 5.44f, 5.0001f, 5.44f, 8.63f)
                verticalLineTo(10.49f)
                curveTo(5.44f, 10.97f, 5.22f, 11.76f, 4.98f, 12.17f)
                lineTo(3.85f, 14.05f)
                curveTo(3.42f, 14.78f, 3.32f, 15.61f, 3.59f, 16.33f)
                curveTo(3.86f, 17.06f, 4.47f, 17.64f, 5.27f, 17.9f)
                curveTo(6.35f, 18.26f, 7.44f, 18.52f, 8.55f, 18.71f)
                curveTo(8.66f, 18.73f, 8.77f, 18.74f, 8.88f, 18.76f)
                curveTo(9.02f, 18.7801f, 9.17f, 18.8f, 9.32f, 18.82f)
                curveTo(9.58f, 18.8601f, 9.84f, 18.89f, 10.11f, 18.91f)
                curveTo(10.74f, 18.97f, 11.38f, 19.0f, 12.02f, 19.0f)
                curveTo(12.65f, 19.0f, 13.28f, 18.97f, 13.9f, 18.91f)
                curveTo(14.13f, 18.89f, 14.36f, 18.8701f, 14.58f, 18.84f)
                curveTo(14.76f, 18.82f, 14.94f, 18.8001f, 15.12f, 18.7701f)
                curveTo(15.23f, 18.76f, 15.34f, 18.74f, 15.45f, 18.72f)
                curveTo(16.57f, 18.54f, 17.68f, 18.26f, 18.76f, 17.9f)
                curveTo(19.53f, 17.64f, 20.12f, 17.06f, 20.4f, 16.32f)
                curveTo(20.68f, 15.57f, 20.6f, 14.75f, 20.19f, 14.06f)
                close()
                moveTo(12.75f, 10.0f)
                curveTo(12.75f, 10.42f, 12.41f, 10.76f, 11.99f, 10.76f)
                curveTo(11.57f, 10.76f, 11.23f, 10.42f, 11.23f, 10.0f)
                verticalLineTo(6.9001f)
                curveTo(11.23f, 6.4801f, 11.57f, 6.14f, 11.99f, 6.14f)
                curveTo(12.41f, 6.14f, 12.75f, 6.4801f, 12.75f, 6.9001f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8299f, 20.01f)
                curveTo(14.4099f, 21.17f, 13.2999f, 22.0f, 11.9999f, 22.0f)
                curveTo(11.2099f, 22.0f, 10.4299f, 21.68f, 9.8799f, 21.11f)
                curveTo(9.5599f, 20.81f, 9.3199f, 20.41f, 9.1799f, 20.0f)
                curveTo(9.3099f, 20.02f, 9.4399f, 20.03f, 9.5799f, 20.05f)
                curveTo(9.8099f, 20.08f, 10.0499f, 20.11f, 10.2899f, 20.13f)
                curveTo(10.8599f, 20.18f, 11.4399f, 20.21f, 12.0199f, 20.21f)
                curveTo(12.5899f, 20.21f, 13.1599f, 20.18f, 13.7199f, 20.13f)
                curveTo(13.9299f, 20.11f, 14.1399f, 20.1f, 14.3399f, 20.07f)
                curveTo(14.4999f, 20.05f, 14.6599f, 20.03f, 14.8299f, 20.01f)
                close()
            }
        }
        .build()
        return `_notification-bing-fill`!!
    }

private var `_notification-bing-fill`: ImageVector? = null
