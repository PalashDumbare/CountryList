package com.example.cities.view

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cities.R
import com.example.cities.data.network.region
import com.example.cities.interfaces.ItemClickListener
import com.example.cities.model.Country
import com.example.cities.supporting.Status
import com.example.cities.supporting.ViewModelFactory
import com.example.cities.viewmodel.CountryViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class CountryListActivity : BaseActivity() , ItemClickListener<Country>{



    @Inject lateinit var viewModelFactory: ViewModelFactory

    private lateinit var  cityViewModel : CountryViewModel

    private var countryAdapter : CountryListAdapter?= null

    private val TAG = CountryListActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialiazations()
        swipeToRefresh()
        getCities()
    }

    fun initialiazations(){
        supportActionBar?.title = region

        cityViewModel = ViewModelProviders.of(this,viewModelFactory).get(CountryViewModel::class.java)
        cityList.layoutManager = LinearLayoutManager(this)
        countryAdapter = CountryListAdapter(this)
        cityList.adapter = countryAdapter
     }

    fun swipeToRefresh(){
        refresh.setOnRefreshListener {
            getCities()
        }
    }


    fun getCities(){
        cityViewModel.getCities().observe(this, Observer {
            it.let { resource ->
                when (resource.status){
                    Status.Loading -> {
                        showLoading()
                      }
                    Status.Success ->{
                        countryAdapter?.data = resource.data
                        countryAdapter?.notifyDataSetChanged()
                        hideLoading()
                    }
                    Status.Error ->{
                        hideLoading()
                        showMessage(resource.message!!)
                    }
                }
            }
        })
    }


    override fun showLoading() {
        refresh.isRefreshing = true
    }


    override fun hideLoading() {
        refresh.isRefreshing = false
     }

    override fun onClick(country: Country) {
        val intent = Intent(this,CountryDetailsActivity::class.java)
        intent.putExtra("country",country)
        startActivity(intent)
    }


}
