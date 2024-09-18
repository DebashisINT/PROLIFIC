package com.breezefieldsalesprolific.features.weather.api

import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.task.api.TaskApi
import com.breezefieldsalesprolific.features.task.model.AddTaskInputModel
import com.breezefieldsalesprolific.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesprolific.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}