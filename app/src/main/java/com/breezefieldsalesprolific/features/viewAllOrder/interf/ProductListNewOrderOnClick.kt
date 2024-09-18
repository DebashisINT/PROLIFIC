package com.breezefieldsalesprolific.features.viewAllOrder.interf

import com.breezefieldsalesprolific.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprolific.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}