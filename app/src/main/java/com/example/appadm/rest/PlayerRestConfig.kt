package com.example.appadm.rest

import android.os.StrictMode
import com.example.appadm.PlayerEndpoints
import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

object PlayerRestConfig {

    var connection: PlayerEndpoints? = null

    private fun createConnection(): PlayerEndpoints {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        return Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(PlayerEndpoints::class.java, "https://capivarawars-player-service.herokuapp.com")
    }

    fun consult() : PlayerEndpoints {
        if (connection == null){
            connection = createConnection()
        }

        return connection as PlayerEndpoints
    }

}