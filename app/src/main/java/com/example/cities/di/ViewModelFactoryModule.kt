package com.example.cities.di

import androidx.lifecycle.ViewModelProvider
import com.example.cities.supporting.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}