package com.example.appadm

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.appadm.rest.PlayerRestConfig
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val thisActivity = this
//
//        runBlocking {
//            val players: List<Player> = mutableListOf<Player>()
//
//            val job = GlobalScope.launch {
//                try {
//
//                   etUsuario.text == Editable = PlayerRestConfig.consult().getPlayerByNick("paulo").nick
//
//                } catch (e: Exception) {
//                    tvUsuario.text = "Carregando"
//                }
//            }
//            job.join()
//
//            var message = ""
//
//            for (index in players.indices) {
//                message += "${index + 1}# ${players[index].nick}: ${players[index].score}pts\n"
//            }
//
//            tvUsuario.text = message
//
//            val tela2 = Intent(this, ADMTela2::class.java)
//            startActivity(tela2)
//        }
    }

    fun irTela2(v:View){
        val tela2 = Intent(this, ADMTela2::class.java)

        startActivity(tela2)

    }

}