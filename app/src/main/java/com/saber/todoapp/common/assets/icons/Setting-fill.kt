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

val Iconly.`Setting-fill`: ImageVector
    get() {
        if (`_setting-fill` != null) {
            return `_setting-fill`!!
        }
        `_setting-fill` = Builder(name = "Setting-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 9.2199f)
                curveTo(18.29f, 9.2199f, 17.55f, 7.9399f, 18.45f, 6.3699f)
                curveTo(18.97f, 5.4599f, 18.66f, 4.2999f, 17.75f, 3.7799f)
                lineTo(16.02f, 2.7899f)
                curveTo(15.23f, 2.3199f, 14.21f, 2.5999f, 13.74f, 3.3899f)
                lineTo(13.63f, 3.5799f)
                curveTo(12.73f, 5.1499f, 11.25f, 5.1499f, 10.34f, 3.5799f)
                lineTo(10.23f, 3.3899f)
                curveTo(9.78f, 2.5999f, 8.76f, 2.3199f, 7.97f, 2.7899f)
                lineTo(6.24f, 3.7799f)
                curveTo(5.33f, 4.2999f, 5.02f, 5.4699f, 5.54f, 6.3799f)
                curveTo(6.45f, 7.9399f, 5.71f, 9.2199f, 3.9f, 9.2199f)
                curveTo(2.86f, 9.2199f, 2.0f, 10.0699f, 2.0f, 11.1199f)
                verticalLineTo(12.8799f)
                curveTo(2.0f, 13.9199f, 2.85f, 14.7799f, 3.9f, 14.7799f)
                curveTo(5.71f, 14.7799f, 6.45f, 16.0599f, 5.54f, 17.6299f)
                curveTo(5.02f, 18.5399f, 5.33f, 19.6999f, 6.24f, 20.2199f)
                lineTo(7.97f, 21.2099f)
                curveTo(8.76f, 21.6799f, 9.78f, 21.3999f, 10.25f, 20.6099f)
                lineTo(10.36f, 20.4199f)
                curveTo(11.26f, 18.8499f, 12.74f, 18.8499f, 13.65f, 20.4199f)
                lineTo(13.76f, 20.6099f)
                curveTo(14.23f, 21.3999f, 15.25f, 21.6799f, 16.04f, 21.2099f)
                lineTo(17.77f, 20.2199f)
                curveTo(18.68f, 19.6999f, 18.99f, 18.5299f, 18.47f, 17.6299f)
                curveTo(17.56f, 16.0599f, 18.3f, 14.7799f, 20.11f, 14.7799f)
                curveTo(21.15f, 14.7799f, 22.01f, 13.9299f, 22.01f, 12.8799f)
                verticalLineTo(11.1199f)
                curveTo(22.0f, 10.0799f, 21.15f, 9.2199f, 20.1f, 9.2199f)
                close()
                moveTo(12.0f, 15.2499f)
                curveTo(10.21f, 15.2499f, 8.75f, 13.7899f, 8.75f, 11.9999f)
                curveTo(8.75f, 10.2099f, 10.21f, 8.7499f, 12.0f, 8.7499f)
                curveTo(13.79f, 8.7499f, 15.25f, 10.2099f, 15.25f, 11.9999f)
                curveTo(15.25f, 13.7899f, 13.79f, 15.2499f, 12.0f, 15.2499f)
                close()
            }
        }
        .build()
        return `_setting-fill`!!
    }

private var `_setting-fill`: ImageVector? = null
