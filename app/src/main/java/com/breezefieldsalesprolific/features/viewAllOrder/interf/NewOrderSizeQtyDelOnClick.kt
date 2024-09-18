package com.breezefieldsalesprolific.features.viewAllOrder.interf

import com.breezefieldsalesprolific.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprolific.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}