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

val Iconly.`Document-favorite-fill`: ImageVector
    get() {
        if (`_document-favorite-fill` != null) {
            return `_document-favorite-fill`!!
        }
        `_document-favorite-fill` = Builder(name = "Document-favorite-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3.0f)
                curveTo(13.31f, 2.45f, 12.86f, 2.0f, 12.31f, 2.0f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2.0f, 2.5f, 4.0f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20.0f, 4.99f, 22.0f, 8.07f, 22.0f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22.0f, 21.5f, 20.0f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
                moveTo(12.48f, 15.7f)
                curveTo(11.96f, 17.37f, 10.13f, 18.27f, 9.5f, 18.27f)
                curveTo(8.86f, 18.27f, 7.07f, 17.4f, 6.52f, 15.7f)
                curveTo(6.16f, 14.59f, 6.57f, 13.14f, 7.84f, 12.73f)
                curveTo(8.42f, 12.54f, 9.04f, 12.65f, 9.49f, 13.0f)
                curveTo(9.94f, 12.65f, 10.56f, 12.54f, 11.15f, 12.73f)
                curveTo(12.43f, 13.14f, 12.83f, 14.59f, 12.48f, 15.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4299f, 8.81f)
                curveTo(18.3799f, 8.82f, 19.6999f, 8.82f, 20.8299f, 8.82f)
                curveTo(21.3999f, 8.82f, 21.6999f, 8.15f, 21.2999f, 7.75f)
                curveTo(19.8599f, 6.3f, 17.2799f, 3.69f, 15.7999f, 2.21f)
                curveTo(15.3899f, 1.8f, 14.6799f, 2.08f, 14.6799f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.6799f, 7.6f, 15.9199f, 8.81f, 17.4299f, 8.81f)
                close()
            }
        }
        .build()
        return `_document-favorite-fill`!!
    }

private var `_document-favorite-fill`: ImageVector? = null
