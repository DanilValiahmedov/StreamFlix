package com.valimade.streamflix.di

import android.app.Application
import com.valimade.streamflix.authorization.di.authorizationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                httpClientModule,
                authorizationModule,
            )
        }
    }
}