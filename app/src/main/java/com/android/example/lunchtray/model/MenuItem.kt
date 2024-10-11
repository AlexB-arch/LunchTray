package com.android.example.lunchtray.model

import java.text.NumberFormat

sealed class MenuItem(
    open val name: String,
    open val description: String,
    open val price: Double,
) {
    data class Entree(
        override val name: String,
        override val description: String,
        override val price: Double,
    ) : MenuItem(name, description, price)
    // This is how to override the sealed class.

    data class Side(
        override val name: String,
        override val description: String,
        override val price: Double,
    ) : MenuItem(name, description, price)

    data class Accompaniment(
        override val name: String,
        override val description: String,
        override val price: Double,
    ) : MenuItem(name, description, price)

    // Gets and formats price.
    fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
}