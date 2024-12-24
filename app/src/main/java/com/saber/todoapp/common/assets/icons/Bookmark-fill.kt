package com.saber.todoapp.common.assets.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly

public val Iconly.`Bookmark-fill`: ImageVector
    get() {
        if (`_bookmark-fill` != null) {
            return `_bookmark-fill`!!
        }
        `_bookmark-fill` = Builder(name = "Bookmark-fill", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.677f, 9.968f)
                horizontalLineTo(8.822f)
                curveTo(8.408f, 9.968f, 8.072f, 9.632f, 8.072f, 9.218f)
                curveTo(8.072f, 8.804f, 8.408f, 8.468f, 8.822f, 8.468f)
                horizontalLineTo(15.677f)
                curveTo(16.091f, 8.468f, 16.427f, 8.804f, 16.427f, 9.218f)
                curveTo(16.427f, 9.632f, 16.091f, 9.968f, 15.677f, 9.968f)
                close()
                moveTo(20.219f, 12.99f)
                lineTo(20.216f, 10.929f)
                curveTo(20.216f, 3.335f, 19.025f, 2.0f, 12.25f, 2.0f)
                curveTo(5.475f, 2.0f, 4.284f, 3.335f, 4.284f, 10.929f)
                lineTo(4.281f, 12.99f)
                curveTo(4.272f, 18.615f, 4.268f, 20.721f, 5.127f, 21.58f)
                curveTo(5.405f, 21.859f, 5.774f, 22.0f, 6.223f, 22.0f)
                curveTo(7.178f, 22.0f, 8.24f, 21.093f, 9.365f, 20.132f)
                curveTo(10.361f, 19.281f, 11.49f, 18.317f, 12.25f, 18.317f)
                curveTo(13.01f, 18.317f, 14.139f, 19.281f, 15.135f, 20.132f)
                curveTo(16.26f, 21.093f, 17.322f, 22.0f, 18.277f, 22.0f)
                curveTo(18.726f, 22.0f, 19.095f, 21.859f, 19.373f, 21.58f)
                curveTo(20.232f, 20.721f, 20.228f, 18.615f, 20.219f, 12.99f)
                close()
            }
        }
        .build()
        return `_bookmark-fill`!!
    }

private var `_bookmark-fill`: ImageVector? = null
