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

public val Iconly.`Bookmark-outline`: ImageVector
    get() {
        if (`_bookmark-outline` != null) {
            return `_bookmark-outline`!!
        }
        `_bookmark-outline` = Builder(name = "Bookmark-outline", defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.822f, 9.2174f)
                horizontalLineTo(15.677f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.699f, 9.461f)
                curveTo(19.541f, 3.307f, 18.194f, 2.5f, 12.25f, 2.5f)
                curveTo(5.863f, 2.5f, 4.784f, 3.432f, 4.784f, 10.929f)
                curveTo(4.784f, 19.322f, 4.627f, 21.5f, 6.223f, 21.5f)
                curveTo(7.818f, 21.5f, 10.423f, 17.816f, 12.25f, 17.816f)
                curveTo(14.077f, 17.816f, 16.682f, 21.5f, 18.277f, 21.5f)
                curveTo(19.633f, 21.5f, 19.724f, 19.928f, 19.72f, 14.311f)
            }
        }
        .build()
        return `_bookmark-outline`!!
    }

private var `_bookmark-outline`: ImageVector? = null
