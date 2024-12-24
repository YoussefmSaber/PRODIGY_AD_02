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

val Iconly.`Star-fill`: ImageVector
    get() {
        if (`_star-fill` != null) {
            return `_star-fill`!!
        }
        `_star-fill` = Builder(name = "Star-fill", defaultWidth = 26.0.dp, defaultHeight = 26.0.dp,
                viewportWidth = 26.0f, viewportHeight = 26.0f).apply {
            path(fill = SolidColor(Color(0xFF797979)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1916f, 2.0609f)
                curveTo(12.4461f, 1.2778f, 13.5539f, 1.2778f, 13.8084f, 2.0609f)
                lineTo(16.2391f, 9.5418f)
                horizontalLineTo(24.1049f)
                curveTo(24.9283f, 9.5418f, 25.2707f, 10.5955f, 24.6045f, 11.0795f)
                lineTo(18.2409f, 15.7029f)
                lineTo(20.6716f, 23.1837f)
                curveTo(20.9261f, 23.9669f, 20.0297f, 24.6181f, 19.3636f, 24.1341f)
                lineTo(13.0f, 19.5106f)
                lineTo(6.6364f, 24.1341f)
                curveTo(5.9703f, 24.618f, 5.0739f, 23.9669f, 5.3284f, 23.1837f)
                lineTo(7.7591f, 15.7029f)
                lineTo(1.3955f, 11.0795f)
                curveTo(0.7293f, 10.5955f, 1.0717f, 9.5418f, 1.8951f, 9.5418f)
                horizontalLineTo(9.7609f)
                lineTo(12.1916f, 2.0609f)
                close()
                moveTo(12.1916f, 2.0609f)
                lineTo(12.1916f, 2.0609f)
                lineTo(12.9049f, 2.2927f)
                lineTo(12.1916f, 2.0609f)
                close()
                moveTo(13.6182f, 2.5245f)
                curveTo(13.6181f, 2.5246f, 13.6181f, 2.5248f, 13.618f, 2.525f)
                lineTo(13.6182f, 2.5245f)
                lineTo(13.1176f, 2.3618f)
                lineTo(13.6182f, 2.5245f)
                close()
                moveTo(5.7547f, 22.9205f)
                curveTo(5.755f, 22.9204f, 5.7552f, 22.9202f, 5.7555f, 22.92f)
                lineTo(5.7547f, 22.9205f)
                close()
                moveTo(6.755f, 23.6473f)
                lineTo(6.7552f, 23.6467f)
                curveTo(6.7551f, 23.6469f, 6.755f, 23.6471f, 6.755f, 23.6473f)
                lineTo(6.2543f, 23.4846f)
                lineTo(6.755f, 23.6473f)
                close()
                moveTo(13.3821f, 19.2331f)
                curveTo(13.3818f, 19.2332f, 13.3816f, 19.2334f, 13.3814f, 19.2336f)
                lineTo(13.3821f, 19.2331f)
                close()
                moveTo(12.6189f, 19.2337f)
                curveTo(12.6185f, 19.2335f, 12.6182f, 19.2333f, 12.6179f, 19.2331f)
                lineTo(13.0f, 18.7072f)
                lineTo(12.6179f, 19.2331f)
                lineTo(12.6189f, 19.2337f)
                close()
            }
        }
        .build()
        return `_star-fill`!!
    }

private var `_star-fill`: ImageVector? = null
