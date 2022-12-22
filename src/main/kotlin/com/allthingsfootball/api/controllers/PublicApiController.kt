package com.allthingsfootball.api.controllers

import com.allthingsfootball.api.services.UrlHandlerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("public/")
class PublicApiController(private val service: UrlHandlerService) {

    @RequestMapping("handle-url")
    fun handleUrl(@RequestParam(required = true) url: String): ResponseEntity<Any> {
        return ResponseEntity<Any>(service.handleUrl(url), HttpStatus.OK)
    }
}