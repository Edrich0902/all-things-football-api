package com.allthingsfootball.api.services

import com.allthingsfootball.api.config.ApiConfig
import com.allthingsfootball.api.helpers.RequestBuilderHelper
import org.springframework.stereotype.Service

@Service
class MatchService(private val config: ApiConfig) {
    val requestHelper: RequestBuilderHelper = RequestBuilderHelper(config.key)
    fun getLiveMatches() {
        //val response = requestHelper.buildRequest(config.baseUrl + "/matches/?status=SCHEDULED")
        //println(response.body())
    }
}