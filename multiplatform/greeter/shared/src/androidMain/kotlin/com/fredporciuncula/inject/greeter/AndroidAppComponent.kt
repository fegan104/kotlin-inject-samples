package com.fredporciuncula.inject.greeter

import android.content.Context
import me.tatarka.inject.annotations.Provides
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.MergeComponent
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn

@MergeComponent(AppScope::class)
@SingleIn(AppScope::class)
abstract class AndroidAppComponent(
  @get:Provides val context: Context,
  @get:Provides val version: Version,
) {
  abstract val homeScreen: HomeScreen
}
