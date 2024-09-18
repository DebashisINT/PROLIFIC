package com.breezefieldsalesprolific.features.login.model.productlistmodel

import com.breezefieldsalesprolific.app.domain.ModelEntity
import com.breezefieldsalesprolific.app.domain.ProductListEntity
import com.breezefieldsalesprolific.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}