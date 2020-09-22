package com.example.cities

import android.os.Build
import com.example.cities.di.AppComponent
import com.example.cities.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class ApplicationStartUp : DaggerApplication() {
    protected var applicationComponent: AppComponent? = null

    override fun applicationInjector(): AndroidInjector<out DaggerApplication?>? {
        applicationComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        applicationComponent?.inject(this)
        return applicationComponent
    }

}