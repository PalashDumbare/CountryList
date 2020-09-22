package com.example.cities.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.cities.data.network.CountryService
import com.example.cities.data.network.PREF_NAME
import com.example.cities.data.network.RetrofitInstance
import com.example.cities.data.repository.CountryRepository
import com.example.cities.data.sharedPref.Prefferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {


    @Provides
    @Singleton
    fun provideApplication(app: Application): Context = app

    @Provides
    @Singleton
    fun provideSharedPrefs(application: Application): SharedPreferences {
        return application.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }


    @Provides
    fun provideCityService() : CountryService{
        return RetrofitInstance.countryService
    }

    @Provides
    @Singleton
    fun providePrefference(sharedPreferences: SharedPreferences) : Prefferences = Prefferences(sharedPreferences)

    @Provides
    @Singleton
    fun provideCityRepository(service: CountryService, pref: Prefferences) = CountryRepository(service,sharedPreferences = pref)
}