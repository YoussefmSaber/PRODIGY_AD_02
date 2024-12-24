package com.saber.todoapp.common.assets.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly

val Iconly.`More-outline`: ImageVector
    get() {
        if (`_more-outline` != null) {
            return `_more-outline`!!
        }
        `_more-outline` = Builder(name = "More-outline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF797979)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.0f, 10.0f)
                    curveTo(3.8954f, 10.0f, 3.0f, 10.8954f, 3.0f, 12.0f)
                    curveTo(3.0f, 13.1046f, 3.8954f, 14.0f, 5.0f, 14.0f)
                    curveTo(6.1046f, 14.0f, 7.0f, 13.1046f, 7.0f, 12.0f)
                    curveTo(7.0f, 10.8954f, 6.1046f, 10.0f, 5.0f, 10.0f)
                    close()
                    moveTo(10.0f, 12.0f)
                    curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                    curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                    curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                    curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                    close()
                    moveTo(17.0f, 12.0f)
                    curveTo(17.0f, 10.8954f, 17.8954f, 10.0f, 19.0f, 10.0f)
                    curveTo(20.1046f, 10.0f, 21.0f, 10.8954f, 21.0f, 12.0f)
                    curveTo(21.0f, 13.1046f, 20.1046f, 14.0f, 19.0f, 14.0f)
                    curveTo(17.8954f, 14.0f, 17.0f, 13.1046f, 17.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return `_more-outline`!!
    }

private var `_more-outline`: ImageVector? = null
