package com.breezefieldsalesprolific.features.newcollectionreport

import com.breezefieldsalesprolific.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}