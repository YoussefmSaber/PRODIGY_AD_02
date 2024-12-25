package com.saber.todoapp.common.assets

import androidx.compose.ui.graphics.vector.ImageVector
import com.saber.todoapp.common.assets.icons.Delete
import com.saber.todoapp.common.assets.icons.`Edit-square`
import com.saber.todoapp.common.assets.icons.`Plus-outline`
import kotlin.collections.List as ____KtList

object Iconly

private var __AllIcons: ____KtList<ImageVector>? = null

val Iconly.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons = listOf(`Plus-outline`, Delete, `Edit-square`)
    return __AllIcons!!
  }
