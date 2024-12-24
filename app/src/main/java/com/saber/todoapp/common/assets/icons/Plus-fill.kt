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

public val Iconly.`Plus-fill`: ImageVector
    get() {
        if (`_plus-fill` != null) {
            return `_plus-fill`!!
        }
        `_plus-fill` = Builder(name = "Plus-fill", defaultWidth = 25.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 25.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.8279f, 13.2847f)
                horizontalLineTo(12.9999f)
                verticalLineTo(16.1087f)
                curveTo(12.9999f, 16.5227f, 12.6639f, 16.8587f, 12.2499f, 16.8587f)
                curveTo(11.8359f, 16.8587f, 11.4999f, 16.5227f, 11.4999f, 16.1087f)
                verticalLineTo(13.2847f)
                horizontalLineTo(8.6719f)
                curveTo(8.2579f, 13.2847f, 7.9219f, 12.9487f, 7.9219f, 12.5347f)
                curveTo(7.9219f, 12.1207f, 8.2579f, 11.7847f, 8.6719f, 11.7847f)
                horizontalLineTo(11.4999f)
                verticalLineTo(8.9607f)
                curveTo(11.4999f, 8.5467f, 11.8359f, 8.2107f, 12.2499f, 8.2107f)
                curveTo(12.6639f, 8.2107f, 12.9999f, 8.5467f, 12.9999f, 8.9607f)
                verticalLineTo(11.7847f)
                horizontalLineTo(15.8279f)
                curveTo(16.2419f, 11.7847f, 16.5779f, 12.1207f, 16.5779f, 12.5347f)
                curveTo(16.5779f, 12.9487f, 16.2419f, 13.2847f, 15.8279f, 13.2847f)
                close()
                moveTo(12.2499f, 2.2977f)
                curveTo(4.6909f, 2.2977f, 2.0129f, 4.9757f, 2.0129f, 12.5347f)
                curveTo(2.0129f, 20.0937f, 4.6909f, 22.7717f, 12.2499f, 22.7717f)
                curveTo(19.8079f, 22.7717f, 22.4869f, 20.0937f, 22.4869f, 12.5347f)
                curveTo(22.4869f, 4.9757f, 19.8079f, 2.2977f, 12.2499f, 2.2977f)
                close()
            }
        }
        .build()
        return `_plus-fill`!!
    }

private var `_plus-fill`: ImageVector? = null
