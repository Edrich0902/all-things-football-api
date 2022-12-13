package com.allthingsfootball.api.helpers

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import kotlin.text.StringBuilder

class RequestBuilderHelper(private val token: String) {
    fun buildRequest(url: String): HttpResponse<String> {
        val client = getClient()
        val request = getRequest(url)
        return client.send(request, HttpResponse.BodyHandlers.ofString())
    }

    fun buildString(url: String, extras: Array<String> = arrayOf()): String {
        val urlString = StringBuilder()
        urlString.append(url.trim())

        if (extras.isNotEmpty()) {
            extras.forEach { extra ->
                urlString.append(extra.trim())
            }
        }

        return urlString.toString()
    }

    private fun getRequest(url: String): HttpRequest {
        return HttpRequest
            .newBuilder()
            .uri(URI.create(url))
            .header("X-Auth-Token", token)
            .build()
    }

    private fun getClient(): HttpClient {
        return HttpClient.newBuilder().build()
    }
}