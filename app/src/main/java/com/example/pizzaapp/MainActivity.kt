package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizzaService = PizzaService()
        val pizzaAdapter = PizzaAdapter(pizzaService.getPizzas())

        val manager = LinearLayoutManager(this)

        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = pizzaAdapter
    }
}