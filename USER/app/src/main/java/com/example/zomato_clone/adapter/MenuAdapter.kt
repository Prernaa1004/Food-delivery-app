package com.example.zomato_clone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zomato_clone.databinding.FragmentMenuBottomSheetBinding
import com.example.zomato_clone.databinding.MenuItemsBinding

class MenuAdapter(private var menuItemsName: MutableList<String>, private val menuItemPrice : MutableList<String>, private val menuImage:MutableList<Int>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = MenuItemsBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MenuViewHolder(binding)
    }



    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int = menuItemsName.size
    inner class MenuViewHolder(private val binding: MenuItemsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                menuFoodName.text = menuItemsName[position]
                menuFoodPrice.text = menuItemPrice[position]
                menuImage1.setImageResource(menuImage[position])
            }
        }

    }
}