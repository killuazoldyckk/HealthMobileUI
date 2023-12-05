package com.cc.utslabmp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.cc.utslabmp3.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerViewAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = CategoryAdapter(createCategories())
        recyclerView.adapter = recyclerViewAdapter
    }
    private fun createCategories(): List<Category> {
        val categories = mutableListOf<Category>()
        categories.add(Category(R.drawable.cat_1, "Yoga"))
        categories.add(Category(R.drawable.cat_2, "Gym"))
        categories.add(Category(R.drawable.cat_3, "Cardio"))
        categories.add(Category(R.drawable.cat_4, "Stretch"))
        categories.add(Category(R.drawable.cat_1, "Full Body"))

        // Add more categories as needed
        return categories
    }
    
}