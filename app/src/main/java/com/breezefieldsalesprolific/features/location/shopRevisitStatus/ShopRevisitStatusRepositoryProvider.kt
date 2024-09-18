package com.breezefieldsalesprolific.features.location.shopRevisitStatus

import com.breezefieldsalesprolific.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesprolific.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}