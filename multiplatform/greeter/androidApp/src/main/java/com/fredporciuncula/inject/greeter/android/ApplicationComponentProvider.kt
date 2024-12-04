package com.fredporciuncula.inject.greeter.android

import android.content.Context
import com.fredporciuncula.inject.greeter.AndroidAppComponent

interface ApplicationComponentProvider {
  val component: AndroidAppComponent
}

val Context.applicationComponent get() = (applicationContext as ApplicationComponentProvider).component
