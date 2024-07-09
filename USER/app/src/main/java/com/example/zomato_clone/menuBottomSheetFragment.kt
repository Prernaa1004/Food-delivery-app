package com.example.zomato_clone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zomato_clone.adapter.CartAdapter
import com.example.zomato_clone.adapter.MenuAdapter
import com.example.zomato_clone.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class menuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.buttonBack.setOnClickListener{
            dismiss()
        }
        binding = FragmentMenuBottomSheetBinding.inflate(inflater,container,false)
        val menuFoodName = listOf( "Burger","sandwich", "momo","item","sandwich","momo")
        val menuItemPrice = listOf("$5", "$6", "$8", "$9", "$10", "$10")
        val menuImage = listOf(
            R. drawable.menu1,
            R. drawable. menu2,
            R.drawable.menu3,
            R. drawable.menu4,
            R. drawable. menu5,
            R. drawable.menu6,
        )
        val adapter = MenuAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPrice),
            ArrayList (menuImage)
        )

        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter =adapter
        return binding.root
    }

    companion object {

    }
}