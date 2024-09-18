package com.breezefieldsalesprolific.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesprolific.app.FileUtils
import com.breezefieldsalesprolific.app.Pref
import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.addshop.model.AddLogReqData
import com.breezefieldsalesprolific.features.addshop.model.AddShopRequestData
import com.breezefieldsalesprolific.features.addshop.model.AddShopResponse
import com.breezefieldsalesprolific.features.addshop.model.LogFileResponse
import com.breezefieldsalesprolific.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesprolific.features.contacts.CallHisDtls
import com.breezefieldsalesprolific.features.contacts.CompanyReqData
import com.breezefieldsalesprolific.features.contacts.ContactMasterRes
import com.breezefieldsalesprolific.features.contacts.SourceMasterRes
import com.breezefieldsalesprolific.features.contacts.StageMasterRes
import com.breezefieldsalesprolific.features.contacts.StatusMasterRes
import com.breezefieldsalesprolific.features.contacts.TypeMasterRes
import com.breezefieldsalesprolific.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesprolific.features.login.model.WhatsappApiData
import com.breezefieldsalesprolific.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}