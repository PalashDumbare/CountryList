package com.example.cities.data.sharedPref

 import android.content.SharedPreferences
 import com.example.cities.model.Country
 import com.google.gson.Gson
import com.google.gson.GsonBuilder


class Prefferences(private val sharedPreferences: SharedPreferences) {

    fun cacheResponse(response : List<Country>){
        sharedPreferences.edit().putString("response", Gson().toJson(response)).apply()
    }

    fun getCachedResponse() : List<Country>{
        val resp =  sharedPreferences.getString("response","")
        val gson =  GsonBuilder().create()
        val array = gson.fromJson(resp , Array<Country>::class.java).toList()
        return array
    }

    fun clearAllData(){
        sharedPreferences.edit().clear()
    }
}