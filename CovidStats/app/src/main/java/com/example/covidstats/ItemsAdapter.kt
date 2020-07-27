package com.example.covidstats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val clickListener: (infox, infoy) -> Unit) : RecyclerView.Adapter<ItemViewHolder>() {

    private val itemsList = mutableListOf<Items>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemsList[position]
        holder.bind(item.product, item.quantity)
    }

    override fun getItemCount(): Int = itemsList.size
}

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //private val info1: TextView = itemView.findViewById(R.id.*insertIDhere*)


   // fun bind() {

    }