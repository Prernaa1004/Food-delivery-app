package com.example.fooddeliveryapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddeliveryapp.databinding.FragmentCongratsbottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class congratsbottom : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentCongratsbottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCongratsbottomBinding.inflate(layoutInflater,container,false)
        binding.gohome.setOnClickListener{
            val intent= Intent(requireContext(),LoginActivity::class.java)
        startActivity(intent)}

    return binding.root}

    companion object {

                }
            }
