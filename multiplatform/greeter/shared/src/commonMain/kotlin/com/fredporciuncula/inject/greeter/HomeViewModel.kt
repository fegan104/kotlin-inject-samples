package com.fredporciuncula.inject.greeter

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.flow
import me.tatarka.inject.annotations.Inject

@Inject
class HomeViewModel(
    private val repo: HelloRepository,
    private val greeting: Greeter,
) : ViewModel() {

    fun observeGreeting() = flow {
        emit(repo.helloWorld())
    }

    fun greet(message: String) {
        greeting.greet(message)
    }
}
