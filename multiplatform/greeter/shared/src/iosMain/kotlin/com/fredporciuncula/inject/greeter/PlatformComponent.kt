package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Provides
import platform.Foundation.NSBundle
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesTo

@ContributesTo(AppScope::class)
interface PlatformComponent {
  @Provides fun providePlatform(): Platform = Platform.Ios
  @Provides fun provideVersion(): Version = Version(
    NSBundle.mainBundle.objectForInfoDictionaryKey("CFBundleShortVersionString") as String
  )
}
