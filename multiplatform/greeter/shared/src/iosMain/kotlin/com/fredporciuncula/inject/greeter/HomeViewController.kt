package com.fredporciuncula.inject.greeter

import androidx.compose.ui.window.ComposeUIViewController
import me.tatarka.inject.annotations.Inject

@Inject
fun HomeViewController(viewModelFactory: () -> HomeViewModel) = ComposeUIViewController(
  configure = { }
) {
  HomeScreen(viewModelFactory)
}
