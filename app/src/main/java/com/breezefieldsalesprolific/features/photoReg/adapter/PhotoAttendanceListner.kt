package com.breezefieldsalesprolific.features.photoReg.adapter

import com.breezefieldsalesprolific.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}