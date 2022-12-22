package com.allthingsfootball.api.services

import com.allthingsfootball.api.config.ApiConfig
import com.allthingsfootball.api.constants.ApiConstants
import com.allthingsfootball.api.helpers.RequestBuilderHelper
import org.springframework.stereotype.Service

@Service
class UrlHandlerService(private val config: ApiConfig) {
    val requestHelper: RequestBuilderHelper = RequestBuilderHelper(config.key)
    fun handleUrl(url: String): String {
        val response = requestHelper.buildRequest(url)
        return response.body()
    }
}