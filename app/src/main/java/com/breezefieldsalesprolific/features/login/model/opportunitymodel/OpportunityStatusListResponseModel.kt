package com.breezefieldsalesprolific.features.login.model.opportunitymodel

import com.breezefieldsalesprolific.app.domain.OpportunityStatusEntity
import com.breezefieldsalesprolific.app.domain.ProductListEntity
import com.breezefieldsalesprolific.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}