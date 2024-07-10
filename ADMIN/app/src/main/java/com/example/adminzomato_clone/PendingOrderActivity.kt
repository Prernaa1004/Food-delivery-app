package com.example.adminzomato_clone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminzomato_clone.adapter.PendingOrderAdapter
import com.example.adminzomato_clone.databinding.ActivityPendingOrderBinding


class PendingOrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPendingOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendingOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        val orderedCustomerName = arrayListOf(
            "John Doe",
            "Jane Smith",
            "Mike Johnson"
        )

        val orderedQuantity = arrayListOf(
            "8",
            "6",
            "5"
        )
        val orderedFoodImage = arrayListOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3)
        val adapter = PendingOrderAdapter(orderedCustomerName, orderedQuantity, orderedFoodImage)

        binding.pendingOrderRecyclerView.adapter = adapter
        binding.pendingOrderRecyclerView.layoutManager = LinearLayoutManager( this)
    }

    private fun PendingOrderAdapter(orderedCustomerName: ArrayList<String>, orderedQuantity: ArrayList<String>, orderedFoodImage: ArrayList<Int>) {

    }
}
