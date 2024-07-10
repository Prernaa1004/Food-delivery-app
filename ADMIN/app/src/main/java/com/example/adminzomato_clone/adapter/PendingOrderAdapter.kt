package com.example.adminzomato_clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.adminzomato_clone.databinding.PendingOrdersItemBinding

class PendingOrderAdapter(private val coustomerNames:ArrayList<String>, private val quantity:ArrayList<String>, private val foodImage:ArrayList<Int>) {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PendingOrderViewHolder{
        val binding = PendingOrdersItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PendingOrderViewHolder(binding)
    }
    fun onBindViewHolder(holder: PendingOrderViewHolder, position: Int) {
        holder.bind(position)
    }

    fun getItemCount(): Int = customerNames.size

    inner class PendingOrderViewHolder(private val binding: PendingOrdersItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                customerName.text = customerNames[position]
                pendingOrderQuantity.text = quantity[position]
                orderdFoodImage.setImageResource(foodImage[position])
            }
        }
    }

}