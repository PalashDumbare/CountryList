package com.example.cities.data.repository

  import com.example.cities.BuildConfig
  import com.example.cities.data.network.CountryService
 import com.example.cities.data.network.region
 import com.example.cities.data.sharedPref.Prefferences
 import com.example.cities.model.Country
 import javax.inject.Inject

class CountryRepository @Inject constructor(private val countryService: CountryService, val sharedPreferences: Prefferences) {


    suspend fun getCountries() : List<Country>{
        val data = countryService.getAllCities(key = BuildConfig.API_KEY).filter {
            it.region == region
        }
        return data
    }

    fun getOfflineData() : List<Country>{
        return sharedPreferences.getCachedResponse()
    }

    fun cacheData( data : List<Country>){
        sharedPreferences.cacheResponse(data)
    }

}