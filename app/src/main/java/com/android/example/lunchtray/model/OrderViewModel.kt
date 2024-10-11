package com.android.example.lunchtray.model

import androidx.lifecycle.ViewModel
import com.android.example.lunchtray.model.MenuItem.Entree
import com.android.example.lunchtray.model.MenuItem.Side
import com.android.example.lunchtray.model.MenuItem.Accompaniment
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    private val taxRate = 0.08

    private val _uiState = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    fun updateEntree(entree: Entree) {
        val previousEntree = _uiState.value.entree
        updateItem(entree, previousEntree)
    }

    fun updateSideDish(sideDish: Side) {
        val previousSideDish = _uiState.value.sideDish
        updateItem(sideDish, previousSideDish)
    }

    fun updateAccompaniment(accompaniment: Accompaniment) {
        val previousAccompaniment = _uiState.value.accompaniment
        updateItem(accompaniment, previousAccompaniment)
    }

    fun resetOrder() {
        _uiState.value = OrderUiState()
    }

    private fun updateItem(newItem: MenuItem, previousItem: MenuItem?) {
        _uiState.update { currentState ->
            val previousItemPrice = previousItem?.price ?: 0.0
            // subtract previous item price in case an item of this category was already added.
            val itemTotalPrice = currentState.itemTotalPrice - previousItemPrice + newItem.price
            // recalculate tax
            val tax = itemTotalPrice * taxRate
            currentState.copy(
                itemTotalPrice = itemTotalPrice,
                orderTax = tax,
                orderTotalPrice = itemTotalPrice + tax,
                entree = if (newItem is Entree) newItem else currentState.entree,
                sideDish = if (newItem is Side) newItem else currentState.sideDish,
                accompaniment =
                if (newItem is Accompaniment) newItem else currentState.accompaniment
            )
        }
    }
}

fun Double.formatPrice(): String {
    return NumberFormat.getCurrencyInstance().format(this)
}