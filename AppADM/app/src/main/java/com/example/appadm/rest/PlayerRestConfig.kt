package com.example.appadm.rest

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

object PlayerRestConfig {
    fun createConnection(): PlayerEndpoints {
        return Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(PlayerEndpoints::class.java, "https://capivarawars-player-service.herokuapp.com")
    }
}