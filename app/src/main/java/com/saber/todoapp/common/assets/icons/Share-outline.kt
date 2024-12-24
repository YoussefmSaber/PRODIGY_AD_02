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

val Iconly.`Share-outline`: ImageVector
    get() {
        if (`_share-outline` != null) {
            return `_share-outline`!!
        }
        `_share-outline` = Builder(name = "Share-outline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF797979)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.7466f, 4.5535f)
                lineTo(14.755f, 4.5619f)
                lineTo(14.7638f, 4.5699f)
                lineTo(21.353f, 10.5601f)
                curveTo(21.435f, 10.6467f, 21.5001f, 10.8043f, 21.5001f, 10.9999f)
                curveTo(21.5001f, 11.1956f, 21.435f, 11.3532f, 21.353f, 11.4398f)
                lineTo(14.7638f, 17.43f)
                lineTo(14.755f, 17.438f)
                lineTo(14.7466f, 17.4464f)
                curveTo(14.7125f, 17.4805f, 14.6893f, 17.4936f, 14.6782f, 17.4983f)
                curveTo(14.6754f, 17.4967f, 14.6714f, 17.4941f, 14.6664f, 17.4903f)
                curveTo(14.6104f, 17.4474f, 14.5001f, 17.2907f, 14.5001f, 16.9999f)
                verticalLineTo(13.6999f)
                verticalLineTo(13.1999f)
                horizontalLineTo(14.0001f)
                curveTo(9.6116f, 13.1999f, 5.7622f, 15.6025f, 3.481f, 19.2273f)
                curveTo(3.3286f, 19.4512f, 3.0587f, 19.5191f, 2.8041f, 19.4367f)
                curveTo(2.5488f, 19.3541f, 2.4549f, 19.1822f, 2.4899f, 19.0007f)
                curveTo(2.7857f, 17.6214f, 3.1735f, 16.2755f, 3.8404f, 15.037f)
                lineTo(3.8452f, 15.0281f)
                lineTo(3.8496f, 15.0189f)
                curveTo(5.6756f, 11.2709f, 9.5127f, 8.5f, 14.0001f, 8.5f)
                horizontalLineTo(14.5001f)
                verticalLineTo(7.9999f)
                verticalLineTo(4.9999f)
                curveTo(14.5001f, 4.7092f, 14.6104f, 4.5525f, 14.6664f, 4.5096f)
                curveTo(14.6714f, 4.5058f, 14.6754f, 4.5032f, 14.6782f, 4.5016f)
                curveTo(14.6893f, 4.5063f, 14.7125f, 4.5194f, 14.7466f, 4.5535f)
                close()
                moveTo(14.6708f, 17.5008f)
                curveTo(14.6708f, 17.5007f, 14.6714f, 17.5006f, 14.6724f, 17.5005f)
                lineTo(14.6708f, 17.5008f)
                close()
                moveTo(14.6827f, 17.5006f)
                curveTo(14.6836f, 17.5008f, 14.6841f, 17.501f, 14.6841f, 17.501f)
                lineTo(14.6827f, 17.5006f)
                close()
                moveTo(14.6841f, 4.4989f)
                curveTo(14.6841f, 4.4989f, 14.6836f, 4.4991f, 14.6827f, 4.4993f)
                lineTo(14.6841f, 4.4989f)
                close()
                moveTo(14.6724f, 4.4994f)
                curveTo(14.6713f, 4.4993f, 14.6708f, 4.4991f, 14.6708f, 4.4991f)
                lineTo(14.6724f, 4.4994f)
                close()
            }
        }
        .build()
        return `_share-outline`!!
    }

private var `_share-outline`: ImageVector? = null
