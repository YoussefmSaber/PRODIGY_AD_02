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

public val Iconly.`Home-fill`: ImageVector
    get() {
        if (`_home-fill` != null) {
            return `_home-fill`!!
        }
        `_home-fill` = Builder(name = "Home-fill", defaultWidth = 25.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.1581f, 16.885f)
                horizontalLineTo(9.3431f)
                curveTo(8.9291f, 16.885f, 8.5931f, 16.549f, 8.5931f, 16.135f)
                curveTo(8.5931f, 15.721f, 8.9291f, 15.385f, 9.3431f, 15.385f)
                horizontalLineTo(15.1581f)
                curveTo(15.5721f, 15.385f, 15.9081f, 15.721f, 15.9081f, 16.135f)
                curveTo(15.9081f, 16.549f, 15.5721f, 16.885f, 15.1581f, 16.885f)
                close()
                moveTo(19.4991f, 6.158f)
                curveTo(19.1361f, 5.838f, 18.7231f, 5.476f, 18.2311f, 5.021f)
                curveTo(18.0081f, 4.841f, 17.7641f, 4.635f, 17.5051f, 4.417f)
                curveTo(16.0451f, 3.186f, 14.0451f, 1.5f, 12.2221f, 1.5f)
                curveTo(10.4201f, 1.5f, 8.5491f, 3.092f, 7.0461f, 4.371f)
                curveTo(6.7681f, 4.607f, 6.5081f, 4.829f, 6.2431f, 5.044f)
                curveTo(5.7771f, 5.476f, 5.3641f, 5.839f, 5.0001f, 6.16f)
                curveTo(2.6131f, 8.261f, 2.1641f, 8.812f, 2.1641f, 13.713f)
                curveTo(2.1641f, 22.5f, 4.7051f, 22.5f, 12.2501f, 22.5f)
                curveTo(19.7941f, 22.5f, 22.3361f, 22.5f, 22.3361f, 13.713f)
                curveTo(22.3361f, 8.811f, 21.8871f, 8.26f, 19.4991f, 6.158f)
                close()
            }
        }
        .build()
        return `_home-fill`!!
    }

private var `_home-fill`: ImageVector? = null
