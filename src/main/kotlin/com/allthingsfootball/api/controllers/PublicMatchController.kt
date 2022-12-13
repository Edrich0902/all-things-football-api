package com.allthingsfootball.api.controllers

import com.allthingsfootball.api.helpers.PublicApiRequest
import com.allthingsfootball.api.services.MatchService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("public/")
class PublicMatchController(private val service: MatchService) {

    @RequestMapping("matches")
    fun getLiveMatches(@RequestBody body: PublicApiRequest): ResponseEntity<Any> {
        //TODO: make the filtering of matches dynamic based on filter from front-end
        println(body)
        return ResponseEntity<Any>(service.getLiveMatches(), HttpStatus.OK)
    }
}