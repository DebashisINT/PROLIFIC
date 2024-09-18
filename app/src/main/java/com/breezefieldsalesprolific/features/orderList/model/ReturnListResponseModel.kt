package com.breezefieldsalesprolific.features.orderList.model

import com.breezefieldsalesprolific.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}