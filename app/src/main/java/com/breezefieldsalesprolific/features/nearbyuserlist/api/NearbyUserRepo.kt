package com.breezefieldsalesprolific.features.nearbyuserlist.api

import com.breezefieldsalesprolific.app.Pref
import com.breezefieldsalesprolific.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesprolific.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesprolific.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}