package com.android.example.lunchtray.model

data class OrderUiState(
    // Entree Selection
    val entree: MenuItem.Entree? = null,
    val sideDish: MenuItem.Side? = null,
    val accompaniment: MenuItem.Accompaniment? = null,
    val itemTotalPrice: Double = 0.0,
    val orderTax: Double = 0.0,
    val orderTotalPrice: Double = 0.0
)