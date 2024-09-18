package com.breezefieldsalesprolific.features.viewAllOrder.model

import com.breezefieldsalesprolific.app.domain.NewOrderColorEntity
import com.breezefieldsalesprolific.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprolific.app.domain.NewOrderProductEntity
import com.breezefieldsalesprolific.app.domain.NewOrderSizeEntity
import com.breezefieldsalesprolific.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

