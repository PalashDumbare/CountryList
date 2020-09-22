package com.example.cities.di

import com.example.cities.view.CountryListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindCountryList(): CountryListActivity?

}