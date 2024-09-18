package com.breezefieldsalesprolific.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesprolific.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesprolific.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}