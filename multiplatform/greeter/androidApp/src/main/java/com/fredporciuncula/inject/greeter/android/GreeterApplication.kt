package com.fredporciuncula.inject.greeter.android

import android.app.Application
import com.fredporciuncula.inject.greeter.AndroidAppComponent
import com.fredporciuncula.inject.greeter.Version
import com.fredporciuncula.inject.greeter.create

class GreeterApplication : Application(), ApplicationComponentProvider {
  override val component: AndroidAppComponent by lazy(LazyThreadSafetyMode.NONE) {
    AndroidAppComponent::class.create(applicationContext, Version(BuildConfig.VERSION_NAME))
  }
}
