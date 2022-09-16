package com.example.moneyretrofit.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moneyretrofit.R
import com.example.moneyretrofit.model.beznal.BeznalichkaItem
import com.example.moneyretrofit.model.nal.Nalichka
import com.example.moneyretrofit.model.nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartAdapterViewHolder>() {

    var listStart = emptyList<NalichkaItem>()

    class StartAdapterViewHolder(view:View):RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartAdapterViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)

        return StartAdapterViewHolder(view)

    }

    override fun onBindViewHolder(holder: StartAdapterViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_value.text = listStart[position].buy
        holder.itemView.item_previous.text = listStart[position].sale



    }



    override fun getItemCount(): Int {
        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList (list:List<NalichkaItem>){

        listStart = list

        notifyDataSetChanged()

    }


}