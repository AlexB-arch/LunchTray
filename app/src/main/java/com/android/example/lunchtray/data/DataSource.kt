package com.android.example.lunchtray.data

import com.android.example.lunchtray.model.MenuItem.Entree
import com.android.example.lunchtray.model.MenuItem.Side
import com.android.example.lunchtray.model.MenuItem.Accompaniment

object DataSource {

    val entreeMenuItems = listOf(
        Entree(
            name = "Cauliflower Tacos",
            description = "Three tacos with roasted cauliflower, salsa, and avocado crema.",
            price = 12.99,
        ),
        Entree(
            name = "Pasta Primavera",
            description = "Pasta with fresh vegetables and herbs.",
            price = 14.99,
        ),
        Entree(
            name = "Veggie Burger",
            description = "A plant-based burger with all the fixings.",
            price = 13.99,
        ),
        Entree(
            name = "Stuffed Bell Peppers",
            description = "Bell peppers stuffed with quinoa, black beans, and spices.",
            price = 11.99,
        ),
    )

    val sideMenuItems = listOf(
        Side(
            name = "Sweet Potato Fries",
            description = "Crispy sweet potato fries with a sprinkle of sea salt.",
            price = 3.99,
        ),
        Side(
            name = "Kale Salad",
            description = "Kale with lemon vinaigrette, dried cranberries, and pumpkin seeds.",
            price = 4.99,
        ),
        Side(
            name = "Quinoa",
            description = "Quinoa with roasted vegetables and a balsamic glaze.",
            price = 5.99,
        ),
        Side(
            name = "Roasted Brussels Sprouts",
            description = "Brussels sprouts roasted with olive oil and garlic.",
            price = 4.99,
        ),
    )

    val accompanimentMenuItems = listOf(
        Accompaniment(
            name = "Lunch Roll",
            description = "Freshly baked roll with butter.",
            price = 1.50,
        ),
        Accompaniment(
            name = "Mixed Fruit",
            description = "Freshly cut seasonal fruit.",
            price = 1.00,
        ),
        Accompaniment(
            name = "Pickled Vegetables",
            description = "Assorted pickled vegetables.",
            price = 1.99,
        ),
        Accompaniment(
            name = "Chips and Salsa",
            description = "Tortilla chips with house-made salsa.",
            price = 2.99,
        ),
    )
}