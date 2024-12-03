package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.KmpComponentCreate
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.MergeComponent
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn
import kotlin.reflect.KClass

@MergeComponent(AppScope::class)
@SingleIn(AppScope::class)
abstract class ApplicationComponent : PlatformComponent {
  abstract val greeter: CommonGreeter

  companion object {
    fun from(): ApplicationComponent {
      return ApplicationComponent::class.createComponent()
    }
  }
}

@MergeComponent.CreateComponent
expect fun KClass<ApplicationComponent>.createComponent(): ApplicationComponent
