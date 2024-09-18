package com.breezefieldsalesprolific.features.weather.api

import com.breezefieldsalesprolific.features.task.api.TaskApi
import com.breezefieldsalesprolific.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}