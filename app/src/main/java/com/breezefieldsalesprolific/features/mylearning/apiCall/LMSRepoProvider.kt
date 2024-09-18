package com.breezefieldsalesprolific.features.mylearning.apiCall

import com.breezefieldsalesprolific.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesprolific.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}