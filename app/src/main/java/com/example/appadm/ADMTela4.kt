package com.example.appadm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appadm.rest.PlayerRestConfig
import kotlinx.android.synthetic.main.activity_a_d_m_tela4.*
import kotlinx.android.synthetic.main.activity_a_d_m_tela4.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ADMTela4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_d_m_tela4)
    }


    fun buttonJogador(v: View) {
        tvJogador.text = "Carregando..."

        // Contexts: IO (network, disk), Main (UI), Default (heavy actions like filters operation)
        CoroutineScope(Dispatchers.Main).launch {
            getPlayersList()
        }
    }

    private suspend fun getPlayersList() {
//        withContext(Dispatchers.Main){

        tvJogador.text = "Nome: Paulo Victor" + "\n" +
                "Nick: paulo" + "\n" +
                "ID: 2" + "\n" +
                "Vitórias: 0" + "\n" +
                "Derrotas: 0" + "\n" +
                "Empates: 0"

       // tvJogador.text = PlayerRestConfig.consult().getPlayer(2).fullName
//        }
    }

}
