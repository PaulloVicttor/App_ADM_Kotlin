package com.example.appadm

import feign.Body
import feign.Headers
import feign.Param
import feign.RequestLine
import java.time.LocalDate


    interface PlayerEndpoints {

        // LOGIN
        @RequestLine("POST /api/v1/playerservice/login")
        @Headers("Content-Type: application/json")
        @Body("%7B\"nick\": \"{nick}\", \"password\": \"{password}\"%7D")
        fun login(@Param("nick") nick: String, @Param("password") password: String): String

        // LOGOUT
        @RequestLine("POST /api/v1/playerservice/logout/{idPlayer}")
        fun logout(@Param("idPlayer") idPlayer: Long): String

        // CHECK CREDENTIALS
        @RequestLine("POST /api/v1/playerservice/player/check/credentials")
        @Headers("Content-Type: application/json")
        @Body("%7B\"nick\": \"{nick}\", \"password\": \"{password}\"%7D")
        fun checkCredentials(@Param("nick") nick: String, @Param("password") password: String): Boolean

        // CHECK IS PLAYER ONLINE
        @RequestLine("GET /api/v1/playerservice/player/{idPlayer}/check/online")
        fun checkIsPlayerOnline(@Param("idPlayer") idPlayer: Long): Boolean

        // UPDATE PLAYER ONLINE
        @RequestLine("PUT /api/v1/playerservice/player/{idPlayer}/online/{newStatus}")
        fun updatePlayerOnline(@Param("idPlayer") idPlayer: Long, @Param("newStatus") newStatus: Boolean): Player

        // GET ALL PLAYERS
        @RequestLine("GET /api/v1/playerservice/players")
        fun getAllPlayers(): List<Player>

        // GET ONE PLAYER
        @RequestLine("GET /api/v1/playerservice/player/{idPlayer}")
        fun getPlayer(@Param("idPlayer") idPlayer: Long): Player

        // GET ONE PLAYER BY NICK
        @RequestLine("GET /api/v1/playerservice/player/nick/{userNick}")
        fun getPlayerByNick(@Param("userNick") userNick: String): Player


        // CREATE ONE PLAYER
        @RequestLine("POST /api/v1/playerservice/player")
        @Headers("Content-Type: application/json")
        @Body("""%7B
        |\"nick\": \"{nick}\",
        \"password\": \"{password}\",
        \"email\": \"{email},
        \"avatarUrl\": \"{avatarUrl}\",
        \"fullName\": \"{fullName}\",
        \"gender\": \"{gender}\",
        \"birthday\": \"{birthday}\",
        \"capybaraName\": \"{capybaraName}\",
        \"capybaraColor\": \"{capybaraColor}\"
        |%7D""")
        fun createPlayer(
            @Param("nick") nick: String,
            @Param("password") password: String,
            @Param("email") email: String,
            @Param("avatarUrl") avatarUrl: String,
            @Param("fullName") fullName: String,
            @Param("gender") gender: Char,
            @Param("birthday") birthday: LocalDate,
            @Param("capybaraName") capybaraName: String,
            @Param("capybaraColor") capybaraColor: String
        ): Player

    }

