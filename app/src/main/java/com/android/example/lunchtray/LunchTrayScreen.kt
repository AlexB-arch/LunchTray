package com.android.example.lunchtray

import androidx.annotation.StringRes

enum class LunchTrayScreen(@StringRes val title: Int) {
    Start( title = R.string.app_name),
    Entree( title = R.string.choose_entree),
    Sides( title = R.string.choose_sides),
    Accompaniments( title = R.string.choose_accompaniments),
    Checkout( title = R.string.order_checkout),
}