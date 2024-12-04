package com.fredporciuncula.inject.greeter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import me.tatarka.inject.annotations.Inject

typealias HomeScreen = @Composable () -> Unit

@Composable
@Inject
fun HomeScreen(factory: () -> HomeViewModel) {
  val homeViewModel = viewModel { factory() }
  val message by homeViewModel.observeGreeting().collectAsState(null)
  Column {

    message?.let {
      Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text(text = it, style = MaterialTheme.typography.h2)
      }
      Button(
        onClick = { homeViewModel.greet(it) }
      ) {
        Text(text = "Greet!")
      }
    }
  }
}
