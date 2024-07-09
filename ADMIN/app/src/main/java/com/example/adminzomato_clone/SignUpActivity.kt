package com.example.adminzomato_clone

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adminzomato_clone.databinding.ActivitySignUpBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.database

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth
    private lateinit var email : String
    private lateinit var password : String
    private lateinit var userName : String
    private lateinit var nameOfRestaurant : String
    private lateinit var database : DatabaseReference

    private val binding: ActivitySignUpBinding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        initialisation firebase auth
        auth = Firebase.auth
        database = Firebase.database.reference

        binding.createUserButton.setOnClickListener{
            email = binding.emailOrPhone.text.toString().trim()
            userName = binding.name.text.toString().trim()
            nameOfRestaurant = binding.restaurantName.text.toString().trim()
            password = binding.password.text.toString().trim()

            if(userName.isBlank() || nameOfRestaurant.isBlank() || email.isBlank() || password.isBlank() ){
                Toast.makeText(this, "Please fill all details", Toast.LENGTH_SHORT).show()
            } else{
                createAccount(email,password)
            }

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.alreadyhaveAccountButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val locationList = arrayOf(
            "Jaipur",
            "Odisha",
            "Pune",
            "Sikar",
            "Delhi",
            "Mumbai",
            "Bangalore",
            "Chennai",
            "Kolkata",
            "Hyderabad")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }

    private fun createAccount(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(this, "Account created Successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}