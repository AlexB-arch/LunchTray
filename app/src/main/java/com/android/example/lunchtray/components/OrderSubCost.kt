package com.android.example.lunchtray.components

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun OrderSubCost(
    @StringRes resourceId: Int,
    price: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(resourceId, price),
        modifier = modifier
    )
}