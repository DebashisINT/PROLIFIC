package com.breezefieldsalesprolific.features.document.api

import com.breezefieldsalesprolific.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesprolific.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}