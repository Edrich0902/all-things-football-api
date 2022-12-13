package com.allthingsfootball.api.controllers

import com.allthingsfootball.api.services.MatchService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("public/")
class PublicMatchController(private val service: MatchService) {

    @RequestMapping("matches")
    fun getAllMatches(): String {
        service.getLiveMatches()
        return "Returns all matches"
    }
}