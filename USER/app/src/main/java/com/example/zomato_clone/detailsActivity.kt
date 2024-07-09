package com.example.fooddeliveryapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fooddeliveryapp.databinding.ActivityDetailsBinding



class detailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName =intent.getStringExtra("")
        val foodImage =intent.getIntExtra("",0)
        //binding.detailfoodname.text=foodName
        binding.imagedetails.setImageResource(foodImage)

        binding.backbutton.setOnClickListener {
            finish()
        }


    }
}