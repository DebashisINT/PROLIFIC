package com.breezefieldsalesprolific.features.location.api

import com.breezefieldsalesprolific.app.Pref
import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.location.model.AppInfoInputModel
import com.breezefieldsalesprolific.features.location.model.AppInfoResponseModel
import com.breezefieldsalesprolific.features.location.model.GpsNetInputModel
import com.breezefieldsalesprolific.features.location.model.ShopDurationRequest
import com.breezefieldsalesprolific.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}