package com.breezefieldsalesprolific.features.viewAllOrder.orderOptimized

import com.breezefieldsalesprolific.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}