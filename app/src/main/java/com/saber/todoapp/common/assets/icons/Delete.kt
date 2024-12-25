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

public val Iconly.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }
        _delete = Builder(name = "Delete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3245f, 9.4682f)
                curveTo(19.3245f, 9.4682f, 18.7815f, 16.2032f, 18.4665f, 19.0402f)
                curveTo(18.3165f, 20.3952f, 17.4795f, 21.1892f, 16.1085f, 21.2142f)
                curveTo(14.8215f, 21.2374f, 13.7872f, 21.2499f, 12.4995f, 21.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1338f, 9.4682f)
                curveTo(5.1338f, 9.4682f, 5.6738f, 16.1852f, 5.9908f, 19.0472f)
                curveTo(6.1378f, 20.3782f, 6.9608f, 21.1822f, 8.2798f, 21.2092f)
                curveTo(8.8529f, 21.2213f, 8.4263f, 21.2306f, 8.9998f, 21.2372f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.708f, 6.2397f)
                horizontalLineTo(17.4998f)
                moveTo(3.75f, 6.2397f)
                horizontalLineTo(12.229f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4406f, 6.2397f)
                curveTo(16.6556f, 6.2397f, 15.9796f, 5.6847f, 15.8256f, 4.9157f)
                lineTo(15.5826f, 3.6997f)
                curveTo(15.4326f, 3.1387f, 14.9246f, 2.7507f, 14.3456f, 2.7507f)
                horizontalLineTo(10.1126f)
                curveTo(9.5336f, 2.7507f, 9.0256f, 3.1387f, 8.8756f, 3.6997f)
                lineTo(8.6326f, 4.9157f)
                curveTo(8.4786f, 5.6847f, 7.8026f, 6.2397f, 7.0176f, 6.2397f)
            }
        }
        .build()
        return _delete!!
    }

private var _delete: ImageVector? = null
