package com.example.appadm.rest

import java.time.LocalDate
import java.time.LocalDateTime

class Player {

    data class Player(
        val idPlayer: Long,
        val nick: String,
        val password: String,
        val email: String,
        val accountBirthday: LocalDateTime,
        val avatarUrl: String,
        val fullName: String,
        val gender: Char,
        val birthday: LocalDate,
        val online: Boolean,
        val lastActivationCode: String,
        val coins: Int,
        val score: Int,
        val wins: Int,
        val losses: Int,
        val draws: Int,
        val accurateShots: Int,
        val badShots: Int,
        val shotsReceived: Int,
        val movements: Int,
        val matchesPlayed: Int,
        val championshipsPlayed: Int,
        val prizesEarned: Int,
        val capybaraName: String,
        val capybaraColor: String,
        val capybaraLife: Int
    )
}