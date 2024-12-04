package com.fredporciuncula.inject.greeter

import android.content.Context
import me.tatarka.inject.annotations.Inject

@Inject
actual class DbClient(appContext: Context)
