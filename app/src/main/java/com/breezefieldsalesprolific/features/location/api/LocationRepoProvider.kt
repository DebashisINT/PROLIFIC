package com.breezefieldsalesprolific.features.location.api

import com.breezefieldsalesprolific.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesprolific.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}