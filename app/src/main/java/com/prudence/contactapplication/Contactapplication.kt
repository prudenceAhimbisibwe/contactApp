package com.prudence.contactapplication

import android.app.Application
import android.content.Context

class Contactapplication: Application() {
    companion object{
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext
    }
}