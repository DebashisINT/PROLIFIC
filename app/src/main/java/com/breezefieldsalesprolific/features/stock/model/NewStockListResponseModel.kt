package com.breezefieldsalesprolific.features.stock.model

import com.breezefieldsalesprolific.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}