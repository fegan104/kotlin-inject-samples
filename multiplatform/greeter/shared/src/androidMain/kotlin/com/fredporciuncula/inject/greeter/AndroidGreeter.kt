package com.fredporciuncula.inject.greeter

import android.content.Context
import android.widget.Toast
import me.tatarka.inject.annotations.Inject
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesBinding

@Inject
@ContributesBinding(AppScope::class)
class AndroidGreeter(
  private val context: Context,
) : Greeter {
  override fun greet(greeting: String) {
    Toast.makeText(context, greeting, Toast.LENGTH_SHORT).show()
  }
}
