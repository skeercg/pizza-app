package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizzaService = PizzaService()
        val pizzaAdapter = PizzaAdapter(pizzaService.getPizzas())

        val manager = LinearLayoutManager(this)

        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = pizzaAdapter

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                pizzaAdapter.filter.filter(newText)
                return false
            }
        })
    }
}