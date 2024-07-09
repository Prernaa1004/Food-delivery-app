package com.example.zomato_clone

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zomato_clone.databinding.ActivityLoginBinding
import kotlin.reflect.KProperty

class LoginActivity : AppCompatActivity() {
    private val binding : ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginbutton3.setOnClickListener{
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

        binding.donthaveaccbutton.setOnClickListener{
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }
    }
}


