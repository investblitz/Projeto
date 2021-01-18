package com.example.weatherapp
import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "e378131b-d0d0-42d7-b568-edf70952bcc0"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}