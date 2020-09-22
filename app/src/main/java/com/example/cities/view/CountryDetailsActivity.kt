package com.example.cities.view

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.cities.R
import com.example.cities.data.network.region
import com.example.cities.model.Country
import kotlinx.android.synthetic.main.country_details.*

class CountryDetailsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_details)
        initializations()
        receiveData()
    }


    fun initializations(){
        supportActionBar?.title = region
    }


    fun receiveData(){
        val data = intent.getParcelableExtra<Country>("country")

        valueBorders.text =  TextUtils.join(",", data.borders)
        valueCoordinates.text = TextUtils.join(",", data.latlng)
        valueLang.text = TextUtils.join(",", data.languages)
        txtCityName.text = data.name
    }


}