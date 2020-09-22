package com.example.cities.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cities.data.repository.CountryRepository
import com.example.cities.supporting.Resource
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.net.UnknownHostException

class CountryViewModel(private val repository : CountryRepository) : ViewModel() {


    /****
     * if internet not connected it will fetch data from shared prefference
     * if data in shared pref is empty and the exception in for connectivity it
     * will throw "Please check network connection" error
     * **/
    fun getCities() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            val data = repository.getCountries()
            repository.cacheData(data)
            emit(Resource.success(data = data))
        }catch (exception : UnknownHostException){
            val data  = repository.getOfflineData()
            if (data.isNullOrEmpty()){
                emit(Resource.error(data = null,message = "Please check network connection"))
            }else{
                emit(Resource.success(data = data))
            }
        }catch (exception : Exception){
            emit(Resource.error(data = null,message = exception.localizedMessage))
        }
    }


}