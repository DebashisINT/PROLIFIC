package com.breezefieldsalesprolific.features.viewAllOrder.interf

import com.breezefieldsalesprolific.app.domain.NewOrderProductEntity
import com.breezefieldsalesprolific.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}