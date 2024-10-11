package com.android.example.lunchtray.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.example.lunchtray.model.MenuItem
import com.android.example.lunchtray.model.MenuItem.Entree

@Composable
fun EntreeMenu(
    options: List<Entree>,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit,
    onSelectionChanged: (Entree) -> Unit,
    modifier: Modifier = Modifier
) {
    BaseMenu(
        options = options,
        onCancelButtonClicked = onCancelButtonClicked,
        onNextButtonClicked = onNextButtonClicked,
        onSelectionChanged = onSelectionChanged as (MenuItem) -> Unit,
        modifier = modifier
    )
}