package com.breezefieldsalesprolific.features.stockAddCurrentStock.api

import com.breezefieldsalesprolific.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesprolific.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}