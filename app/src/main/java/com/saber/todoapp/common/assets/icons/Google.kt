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

val Iconly.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFFFC107)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8055f, 10.0415f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.6515f)
                curveTo(16.827f, 16.3285f, 14.6115f, 18.0f, 12.0f, 18.0f)
                curveTo(8.6865f, 18.0f, 6.0f, 15.3135f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6865f, 8.6865f, 6.0f, 12.0f, 6.0f)
                curveTo(13.5295f, 6.0f, 14.921f, 6.577f, 15.9805f, 7.5195f)
                lineTo(18.809f, 4.691f)
                curveTo(17.023f, 3.0265f, 14.634f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4775f, 2.0f, 2.0f, 6.4775f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5225f, 6.4775f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5225f, 22.0f, 22.0f, 17.5225f, 22.0f, 12.0f)
                curveTo(22.0f, 11.3295f, 21.931f, 10.675f, 21.8055f, 10.0415f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF3D00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1531f, 7.3455f)
                lineTo(6.4386f, 9.755f)
                curveTo(7.3276f, 7.554f, 9.4806f, 6.0f, 12.0001f, 6.0f)
                curveTo(13.5296f, 6.0f, 14.9211f, 6.577f, 15.9806f, 7.5195f)
                lineTo(18.8091f, 4.691f)
                curveTo(17.0231f, 3.0265f, 14.6341f, 2.0f, 12.0001f, 2.0f)
                curveTo(8.1591f, 2.0f, 4.8281f, 4.1685f, 3.1531f, 7.3455f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4CAF50)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 22.0001f)
                curveTo(14.5829f, 22.0001f, 16.9299f, 21.0116f, 18.7044f, 19.4041f)
                lineTo(15.6094f, 16.7851f)
                curveTo(14.6054f, 17.5456f, 13.3574f, 18.0001f, 11.9999f, 18.0001f)
                curveTo(9.3989f, 18.0001f, 7.1904f, 16.3416f, 6.3584f, 14.0271f)
                lineTo(3.0974f, 16.5396f)
                curveTo(4.7524f, 19.7781f, 8.1134f, 22.0001f, 11.9999f, 22.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1976D2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8055f, 10.0415f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.6515f)
                curveTo(17.2555f, 15.1185f, 16.536f, 16.083f, 15.608f, 16.7855f)
                curveTo(15.6085f, 16.785f, 15.609f, 16.785f, 15.6095f, 16.7845f)
                lineTo(18.7045f, 19.4035f)
                curveTo(18.4855f, 19.6025f, 22.0f, 17.0f, 22.0f, 12.0f)
                curveTo(22.0f, 11.3295f, 21.931f, 10.675f, 21.8055f, 10.0415f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
