package com.example.zomato_clone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zomato_clone.congratsbottom
import com.example.zomato_clone.databinding.ActivityPayOutBinding

class PayOutActivity : AppCompatActivity() {
    lateinit var binding : ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.placemyorder.setOnClickListener{
            val bottomSheetDialog= congratsbottom()
            bottomSheetDialog.show(supportFragmentManager,"Test")
        }
    }
}