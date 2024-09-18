package com.breezefieldsalesprolific.features.lead.api

import com.breezefieldsalesprolific.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesprolific.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}