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

public val Iconly.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9028f, 8.8511f)
                lineTo(13.4596f, 12.4642f)
                curveTo(12.6201f, 13.1302f, 11.4389f, 13.1302f, 10.5994f, 12.4642f)
                lineTo(6.1186f, 8.8511f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                verticalLineTo(8.57f)
                curveTo(22.0f, 5.4988f, 19.9502f, 3.0f, 16.9089f, 3.0f)
                horizontalLineTo(7.0911f)
                curveTo(4.0498f, 3.0f, 2.0f, 5.4988f, 2.0f, 8.57f)
                verticalLineTo(15.4384f)
                curveTo(2.0f, 18.5095f, 4.0498f, 21.0084f, 7.0911f, 21.0f)
                horizontalLineTo(16.9089f)
                curveTo(19.9502f, 21.0084f, 22.0f, 18.5095f, 22.0f, 15.4384f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
