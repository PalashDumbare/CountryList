
package com.example.cities.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Country (

	val name : String,
	val region : String,
 	val population : Double,
	val latlng : List<Double>,
 	val area : Double,
  	val borders : List<String>,
	val languages : List<String>,
	val currencies : List<String>,
	val capital : String

	) : Parcelable