package com.breezefieldsalesprolific.features.stockCompetetorStock.api

import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesprolific.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesprolific.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}