package com.homedev.android_advanced

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

/**
 * Created by Alexandr Zheleznyakov on 2019-10-22.
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }
}