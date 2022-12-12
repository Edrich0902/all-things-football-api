package com.allthingsfootball.api.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("public/")
class Test {

    @RequestMapping("test")
    fun test(): String {
        return "Testing auth"
    }
}