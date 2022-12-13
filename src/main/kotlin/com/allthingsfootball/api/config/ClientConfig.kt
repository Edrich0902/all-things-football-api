package com.allthingsfootball.api.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "application.config.api")
@Component
@Configuration
data class ApiConfig (
    var baseUrl: String = "",
    var key: String = "",
)