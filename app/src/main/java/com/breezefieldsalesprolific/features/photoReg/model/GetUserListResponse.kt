package com.breezefieldsalesprolific.features.photoReg.model

import com.breezefieldsalesprolific.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}