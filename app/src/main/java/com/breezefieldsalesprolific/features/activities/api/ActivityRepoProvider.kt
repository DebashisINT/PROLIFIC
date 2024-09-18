package com.breezefieldsalesprolific.features.activities.api

import com.breezefieldsalesprolific.features.member.api.TeamApi
import com.breezefieldsalesprolific.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}