package com.fredporciuncula.inject.greeter.android

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fredporciuncula.inject.greeter.CommonGreeter
import com.fredporciuncula.inject.greeter.Version
import me.tatarka.inject.annotations.Provides
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.MergeComponent
import software.amazon.lastmile.kotlin.inject.anvil.SingleIn

//@MergeComponent(AppScope::class)
//@SingleIn(AppScope::class)
//abstract class MainActivityComponent(
//  @get:Provides val context: Context,
//  @get:Provides val version: Version,
//) {
//  abstract val greeter: CommonGreeter
//}

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val greeter = applicationComponent.greeter
    setContent {
      Box(
        modifier = Modifier
          .background(color = Color.White)
          .fillMaxSize(),
        contentAlignment = Alignment.Center,
      ) {
        Button(
          onClick = { greeter.greet() }
        ) {
          Text(text = "Greet!")
        }
      }
    }
  }
}
