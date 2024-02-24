package com.example.pizzaapp

class PizzaService {
    private val pizzas = listOf(
        PizzaModel(
            "Margherita",
            "Classic Italian pizza with tomato sauce, mozzarella cheese, and basil",
            10,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/CRU5100_PeriPeriChick_600x600_tiny.png"
        ),
        PizzaModel(
            "Pepperoni",
            "Traditional pizza with tomato sauce, pepperoni slices, and mozzarella cheese",
            12,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/Meat-Deluxe_600x600.png"
        ),
        PizzaModel(
            "Vegetarian",
            "Pizza topped with various vegetables like bell peppers, onions, olives, and mushrooms",
            11,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/CRU5100_CrustSupreme_600x600_tiny.png"
        ),
        PizzaModel(
            "Hawaiian",
            "Pizza with tomato sauce, ham, pineapple, and mozzarella cheese",
            13,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/CRU5100_VegSupreme_600x600_tiny.png"
        ),
        PizzaModel(
            "BBQ Chicken",
            "Pizza with BBQ sauce, grilled chicken, red onions, and mozzarella cheese",
            14,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/Smokey-BBQ-Pulled-Jackfruit_600x600.png"
        ),
        PizzaModel(
            "Supreme",
            "Pizza with pepperoni, sausage, bell peppers, onions, olives, and mushrooms",
            15,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/BBQ_600x600.png"
        ),
        PizzaModel(
            "Four Cheese",
            "Pizza with tomato sauce and a blend of four cheeses: mozzarella, parmesan, asiago, and gorgonzola",
            13,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/Vietnamese-Chilli-Chicken_600x600.png"
        ),
        PizzaModel(
            "Meat Lovers",
            "Pizza with tomato sauce, pepperoni, sausage, ham, bacon, and mozzarella cheese",
            16,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/CRU5076_Web_Images_600x600_5_Shepards_Lie_tiny.png"
        ),
        PizzaModel(
            "Mushroom Lovers",
            "Pizza with tomato sauce, mushrooms, caramelized onions, and a blend of mozzarella and fontina cheese",
            14,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/Smokey-BBQ-Pulled-Jackfruit_600x600.png"
        ),
        PizzaModel(
            "Spinach and Feta",
            "Pizza with garlic olive oil sauce, spinach, red onions, feta cheese, and mozzarella cheese",
            12,
            "https://d2mekbzx20fc11.cloudfront.net/uploads/Truffle_Beef_Rosini_600x600.png"
        )
    )


    fun getPizzas(): List<PizzaModel> {
        return pizzas
    }
}
