package com.example.quotes.utilities

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class QuotesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // start Koin context
        startKoin {
            androidContext(this@QuotesApp)
            androidLogger()
            modules(appModule)
        }
    }
}