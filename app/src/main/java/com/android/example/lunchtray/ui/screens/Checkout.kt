package com.android.example.lunchtray.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.android.example.lunchtray.R
import com.android.example.lunchtray.components.ItemSummary
import com.android.example.lunchtray.components.OrderSubCost
import com.android.example.lunchtray.model.OrderUiState
import com.android.example.lunchtray.model.formatPrice


@Composable
fun Checkout(
    orderUiState: OrderUiState,
    onNextButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val padding_small = 8.dp
    val padding_medium = 16.dp

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(padding_small)
    ) {
        Text(
            text = stringResource(R.string.order_summary),
            fontWeight = FontWeight.Bold
        )
        ItemSummary(item = orderUiState.entree, modifier = Modifier.fillMaxWidth())
        ItemSummary(item = orderUiState.sideDish, modifier = Modifier.fillMaxWidth())
        ItemSummary(item = orderUiState.accompaniment, modifier = Modifier.fillMaxWidth())

        HorizontalDivider(
            modifier = Modifier.padding(bottom = padding_small),
            thickness = 1.dp
        )

        OrderSubCost(
            resourceId = R.string.subtotal,
            price = orderUiState.itemTotalPrice.formatPrice(),
            Modifier.align(Alignment.End)
        )

        OrderSubCost(
            resourceId = R.string.tax,
            price = orderUiState.orderTax.formatPrice(),
            Modifier.align(Alignment.End)
        )

        Text(
            text = stringResource(R.string.total, orderUiState.orderTotalPrice.formatPrice()),
            modifier = Modifier.align(Alignment.End),
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding_medium),
            horizontalArrangement = Arrangement.spacedBy(padding_medium)
        ) {
            OutlinedButton(modifier = Modifier.weight(1f), onClick = onCancelButtonClicked) {
                Text(stringResource(R.string.cancel).uppercase())
            }
            Button(
                modifier = Modifier.weight(1f),
                onClick = onNextButtonClicked
            ) {
                Text(stringResource(R.string.submit).uppercase())
            }
        }
    }
}