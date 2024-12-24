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

public val Iconly.`Search-outline`: ImageVector
    get() {
        if (`_search-outline` != null) {
            return `_search-outline`!!
        }
        `_search-outline` = Builder(name = "Search-outline", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0746f, 11.2636f)
                curveTo(20.0746f, 15.9926f, 16.2416f, 19.8246f, 11.5136f, 19.8246f)
                curveTo(6.7846f, 19.8246f, 2.9526f, 15.9926f, 2.9526f, 11.2636f)
                curveTo(2.9526f, 6.5346f, 6.7846f, 2.7026f, 11.5136f, 2.7026f)
                curveTo(14.6436f, 2.7026f, 17.3816f, 4.3826f, 18.8746f, 6.8896f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7258f, 19.8863f)
                curveTo(18.7258f, 19.1083f, 19.3578f, 18.4763f, 20.1368f, 18.4763f)
                curveTo(20.9168f, 18.4763f, 21.5478f, 19.1083f, 21.5478f, 19.8863f)
                curveTo(21.5478f, 20.6663f, 20.9168f, 21.2973f, 20.1368f, 21.2973f)
            }
        }
        .build()
        return `_search-outline`!!
    }

private var `_search-outline`: ImageVector? = null
