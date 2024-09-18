package com.breezefieldsalesprolific.features.stockAddCurrentStock.api

import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesprolific.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesprolific.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesprolific.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesprolific.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}