package com.example.cities.data.network

 import com.example.cities.model.Country
 import retrofit2.http.GET
import retrofit2.http.Header

interface CountryService {
    @GET("all")
    suspend fun getAllCities(@Header("x-rapidapi-host")host : String = "restcountries-v1.p.rapidapi.com",
                     @Header("x-rapidapi-key") key : String,
                     @Header("useQueryString")useQueryString : Boolean = true)
              :  List<Country>
}