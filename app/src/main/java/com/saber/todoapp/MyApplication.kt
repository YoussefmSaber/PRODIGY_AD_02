package com.saber.todoapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Annotation to trigger Hilt's code generation
@HiltAndroidApp
// Custom Application class for the ToDo app
class MyApplication : Application() 