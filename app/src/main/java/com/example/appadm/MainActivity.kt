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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    val usuario = etUsuario

    val senha =  etSenha

    fun irTela2(v: View) {
        val tela2 = Intent(this, ADMTela3::class.java)


    }


    fun buttonLogin(v: View) {

        //       Contexts: IO (network, disk), Main (UI), Default (heavy actions like filters operation)
        CoroutineScope(Dispatchers.Main).launch {
            getPlayersList()

        }
    }


    private suspend fun getPlayersList() {
//        withContext(Dispatchers.Main){
        etUsuario.text = PlayerRestConfig.consult().getPlayerByNick(usuario).fullName
//        }

    }

}
