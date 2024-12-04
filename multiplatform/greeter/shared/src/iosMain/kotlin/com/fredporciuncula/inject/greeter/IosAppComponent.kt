package com.fredporciuncula.inject.greeter

import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.MergeComponent
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn
import kotlin.reflect.KClass

@MergeComponent(AppScope::class)
@SingleIn(AppScope::class)
abstract class IosAppComponent {
//  abstract val homeViewModel: HomeViewModel
//  abstract val homeScreen: HomeScreen
  abstract val viewModelFactory: () -> HomeViewModel

  companion object {
    fun from(): IosAppComponent {
      return IosAppComponent::class.createComponent()
    }
  }
}

@MergeComponent.CreateComponent
expect fun KClass<IosAppComponent>.createComponent(): IosAppComponent
