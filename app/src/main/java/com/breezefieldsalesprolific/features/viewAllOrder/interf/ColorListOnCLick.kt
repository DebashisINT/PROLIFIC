package com.breezefieldsalesprolific.features.viewAllOrder.interf

import com.breezefieldsalesprolific.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprolific.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}