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

public val Iconly.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 25.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 21.829f)
                curveTo(8.436f, 21.829f, 5.178f, 21.252f, 5.178f, 18.942f)
                curveTo(5.178f, 16.632f, 8.415f, 14.531f, 12.25f, 14.531f)
                curveTo(16.064f, 14.531f, 19.322f, 16.612f, 19.322f, 18.921f)
                curveTo(19.322f, 20.547f, 17.716f, 21.325f, 15.427f, 21.643f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2496f, 2.171f)
                curveTo(9.7466f, 2.171f, 7.7166f, 4.2f, 7.7166f, 6.704f)
                curveTo(7.7076f, 9.198f, 9.7236f, 11.228f, 12.2176f, 11.237f)
                horizontalLineTo(12.2496f)
                curveTo(14.7526f, 11.237f, 16.7826f, 9.207f, 16.7826f, 6.704f)
                curveTo(16.7826f, 5.206f, 16.0566f, 3.878f, 14.9366f, 3.053f)
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
