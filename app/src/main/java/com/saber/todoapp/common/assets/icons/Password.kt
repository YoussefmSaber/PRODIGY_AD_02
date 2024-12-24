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

public val Iconly.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.999f, 21.2501f)
                horizontalLineTo(7.665f)
                curveTo(4.635f, 21.2501f, 2.75f, 19.1111f, 2.75f, 16.0841f)
                verticalLineTo(7.9161f)
                curveTo(2.75f, 4.8891f, 4.644f, 2.7501f, 7.665f, 2.7501f)
                horizontalLineTo(16.334f)
                curveTo(19.364f, 2.7501f, 21.25f, 4.8891f, 21.25f, 7.9161f)
                verticalLineTo(16.0841f)
                curveTo(21.25f, 19.1111f, 19.364f, 21.2501f, 16.333f, 21.2501f)
                horizontalLineTo(15.4999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9849f, 12.0001f)
                curveTo(6.9849f, 13.0231f, 7.8139f, 13.8521f, 8.8369f, 13.8521f)
                curveTo(9.8599f, 13.8521f, 10.6889f, 13.0231f, 10.6889f, 12.0001f)
                curveTo(10.6889f, 10.9781f, 9.8609f, 10.1491f, 8.8399f, 10.1481f)
                horizontalLineTo(8.8369f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.6919f, 12.0001f)
                horizontalLineTo(17.0099f)
                verticalLineTo(13.8521f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.1816f, 13.8522f)
                verticalLineTo(12.0002f)
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
