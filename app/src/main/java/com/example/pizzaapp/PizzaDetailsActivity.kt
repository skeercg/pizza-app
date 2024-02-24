package com.example.pizzaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.pizzaapp.databinding.ActivityPizzaDetailsBinding

class PizzaDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPizzaDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPizzaDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = ""

        Glide.with(this).load(intent?.extras?.getString("pizza_image_url"))
            .into(binding.imageViewPizzaImage)

        binding.textViewPizzaName.text = intent?.extras?.getString("pizza_name")
        binding.textViewPizzaDescription.text = intent?.extras?.getString("pizza_description")
        binding.purchaseButton.text = "Add for ${intent?.extras?.getString("pizza_price")}"

        binding.optionSizes.check(binding.optionSmall.id)
    }

}