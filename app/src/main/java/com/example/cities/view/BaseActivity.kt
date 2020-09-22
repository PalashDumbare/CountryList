package com.example.cities.view

import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity

open class BaseActivity : DaggerAppCompatActivity() {


    open fun showLoading(){}

    open fun hideLoading(){}

    fun showMessage(message : String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

}