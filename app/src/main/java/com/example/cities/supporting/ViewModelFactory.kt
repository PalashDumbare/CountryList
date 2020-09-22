package com.example.cities.supporting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cities.data.repository.CountryRepository
import com.example.cities.viewmodel.CountryViewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val repository: CountryRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CountryViewModel::class.java)) {
            return CountryViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}