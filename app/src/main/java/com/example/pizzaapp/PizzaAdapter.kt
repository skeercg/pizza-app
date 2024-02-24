package com.example.pizzaapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pizzaapp.databinding.PizzaCardBinding

class PizzaAdapter(private val pizzas: List<PizzaModel>) :
    RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    class PizzaViewHolder(val binding: PizzaCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PizzaCardBinding.inflate(inflater, parent, false)

        return PizzaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pizzas.size
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        val pizza = pizzas[position]
        val context = holder.itemView.context

        with(holder.binding) {
            textViewPizzaName.text = pizza.name
            textViewPizzaDescription.text = pizza.description
            textViewPizzaPrice.text = "${pizza.price} \$"
            Glide.with(context).load(pizza.imageUrl).into(imageViewPizzaImage)
        }
    }
}