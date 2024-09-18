package com.breezefieldsalesprolific.features.viewAllOrder.interf

import com.breezefieldsalesprolific.app.domain.NewOrderColorEntity
import com.breezefieldsalesprolific.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}