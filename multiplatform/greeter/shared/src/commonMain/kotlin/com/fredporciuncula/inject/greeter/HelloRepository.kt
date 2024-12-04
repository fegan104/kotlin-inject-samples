package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Inject
import software.amazon.lastmile.kotlin.inject.anvil.AppScope
import software.amazon.lastmile.kotlin.inject.anvil.ContributesBinding

interface HelloRepository {
    fun helloWorld(): String
}

@Inject
@ContributesBinding(AppScope::class)
class MyRepositoryImpl(
    private val dbClient: DbClient
) : HelloRepository {
    override fun helloWorld(): String {
        return "Hello World!"
    }
}
