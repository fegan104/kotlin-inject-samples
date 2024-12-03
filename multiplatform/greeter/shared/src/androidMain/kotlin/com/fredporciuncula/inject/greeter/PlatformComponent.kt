package com.fredporciuncula.inject.greeter

import com.fredporciuncula.inject.greeter.AndroidGreeter
import com.fredporciuncula.inject.greeter.Greeter
import com.fredporciuncula.inject.greeter.Platform
import com.fredporciuncula.inject.greeter.Version
import me.tatarka.inject.annotations.Provides
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesTo

@ContributesTo(AppScope::class)
interface PlatformComponent {
  @Provides fun providePlatform(): Platform = Platform.Android
}
