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

public val Iconly.`Search-fill`: ImageVector
    get() {
        if (`_search-fill` != null) {
            return `_search-fill`!!
        }
        `_search-fill` = Builder(name = "Search-fill", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5136f, 2.2023f)
                curveTo(6.5176f, 2.2023f, 2.4526f, 6.2673f, 2.4526f, 11.2643f)
                curveTo(2.4526f, 16.2603f, 6.5176f, 20.3243f, 11.5136f, 20.3243f)
                curveTo(16.5096f, 20.3243f, 20.5746f, 16.2603f, 20.5746f, 11.2643f)
                curveTo(20.5746f, 6.2673f, 16.5096f, 2.2023f, 11.5136f, 2.2023f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.1371f, 17.9767f)
                curveTo(19.0831f, 17.9767f, 18.2251f, 18.8327f, 18.2251f, 19.8867f)
                curveTo(18.2251f, 20.9407f, 19.0831f, 21.7977f, 20.1371f, 21.7977f)
                curveTo(21.1901f, 21.7977f, 22.0471f, 20.9407f, 22.0471f, 19.8867f)
                curveTo(22.0471f, 18.8327f, 21.1901f, 17.9767f, 20.1371f, 17.9767f)
                close()
            }
        }
        .build()
        return `_search-fill`!!
    }

private var `_search-fill`: ImageVector? = null
