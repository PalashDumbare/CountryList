package com.example.cities.view

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cities.R
import com.example.cities.interfaces.ItemClickListener
import com.example.cities.model.Country
import kotlinx.android.synthetic.main.row_country.view.*

class CountryListAdapter(private val itemClickListener: ItemClickListener<Country>) : RecyclerView.Adapter<CountryListAdapter.ViewHolder>() {


    var data : List<Country>? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.row_country,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data?.count() ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        data?.get(position)?.let {
            holder.configureRow(it)
        }
        holder.itemView.setOnClickListener {
            data?.get(holder.adapterPosition)?.let { country -> itemClickListener.onClick(country) }
        }


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txtName = itemView.txtName
        val txtPopulation = itemView.txtpopulation
        val txtCurrency = itemView.txtCurrency
        val txtCapital = itemView.txtCapital

        fun configureRow(country : Country){
             txtName.text = country.name
            txtPopulation.text ="${country.population}"
            txtCapital.text = country.capital
            txtCurrency.text= country.currencies?.let { TextUtils.join(",", it) }


        }


    }
}