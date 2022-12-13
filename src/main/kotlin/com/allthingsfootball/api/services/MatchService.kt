package com.allthingsfootball.api.services

import com.allthingsfootball.api.config.ApiConfig
import com.allthingsfootball.api.constants.ApiConstants
import com.allthingsfootball.api.helpers.RequestBuilderHelper
import org.springframework.stereotype.Service

@Service
class MatchService(private val config: ApiConfig) {
    val requestHelper: RequestBuilderHelper = RequestBuilderHelper(config.key)
    fun getLiveMatches(): String {
        val url = requestHelper.buildString(config.baseUrl, arrayOf("/matches/?status=", ApiConstants.IN_PLAY))
        val response = requestHelper.buildRequest(url)
        return response.body()
    }

    fun getFinishedMatches(): String {
        val url = requestHelper.buildString(config.baseUrl, arrayOf("/matches/?status=", ApiConstants.FINISHED))
        val response = requestHelper.buildRequest(url)
        return response.body()
    }

    fun getScheduledMatches(): String {
        val url = requestHelper.buildString(config.baseUrl, arrayOf("/matches/?status=", ApiConstants.SCHEDULED))
        val response = requestHelper.buildRequest(url)
        return response.body()
    }
}