package com.breezefieldsalesprolific.features.survey.api

import com.breezefieldsalesprolific.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesprolific.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}