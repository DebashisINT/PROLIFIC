package com.breezefieldsalesprolific.features.photoReg.present

import com.breezefieldsalesprolific.app.domain.ProspectEntity
import com.breezefieldsalesprolific.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}