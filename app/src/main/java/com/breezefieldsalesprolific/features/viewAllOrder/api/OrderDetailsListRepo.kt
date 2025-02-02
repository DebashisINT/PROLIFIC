package com.breezefieldsalesprolific.features.viewAllOrder.api

import com.breezefieldsalesprolific.app.Pref
import com.breezefieldsalesprolific.features.login.model.productlistmodel.NewOdrScrOrderListModel
import com.breezefieldsalesprolific.features.viewAllOrder.model.NewOrderDataModel
import com.breezefieldsalesprolific.features.viewAllOrder.model.NewOrderOrderHistoryModel
import com.breezefieldsalesprolific.features.viewAllOrder.model.ViewAllOrderListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 01-10-2018.
 */
class OrderDetailsListRepo(val apiService: OrderDetailsListApi) {
    fun getOrderDetailsList(sessiontoken: String, user_id: String, shop_id: String, order_id: String): Observable<ViewAllOrderListResponseModel> {
        return apiService.getOrderDetailsList(sessiontoken, user_id, shop_id, order_id)
    }

    fun getNewOrderData(): Observable<NewOrderDataModel> {
        return apiService.getNewOrderData(Pref.session_token!!, Pref.user_id!!)
    }

    fun getNewOrderHistoryData(): Observable<NewOrderOrderHistoryModel> {
        return apiService.getNewOrderHistoryData(Pref.session_token!!, Pref.user_id!!)
    }

    fun getNewOrderHistoryDataSimplefied(): Observable<NewOdrScrOrderListModel> {
        return apiService.getNewOrderHistoryDataSimplefied(Pref.session_token!!, Pref.user_id!!)
    }

}