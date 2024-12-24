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

public val Iconly.Show: ImageVector
    get() {
        if (_show != null) {
            return _show!!
        }
        _show = Builder(name = "Show", defaultWidth = 25.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2504f, 8.8377f)
                curveTo(13.9964f, 8.8377f, 15.4124f, 10.2526f, 15.4124f, 11.9996f)
                curveTo(15.4124f, 13.7456f, 13.9964f, 15.1616f, 12.2504f, 15.1616f)
                curveTo(10.5044f, 15.1616f, 9.0884f, 13.7456f, 9.0884f, 11.9996f)
                curveTo(9.0884f, 11.4286f, 9.2394f, 10.8936f, 9.5044f, 10.4306f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.916f, 18.597f)
                curveTo(19.202f, 17.301f, 21.502f, 14.446f, 21.502f, 12.0f)
                curveTo(21.502f, 8.717f, 17.359f, 4.698f, 12.25f, 4.698f)
                curveTo(7.14f, 4.698f, 2.998f, 8.72f, 2.998f, 12.0f)
                curveTo(2.998f, 15.28f, 7.14f, 19.302f, 12.25f, 19.302f)
            }
        }
        .build()
        return _show!!
    }

private var _show: ImageVector? = null
