package com.example.appadm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ADMTela5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_d_m_tela5)
    }

    fun irTela6(v:View){
        val tela6 = Intent(this,ADMTela6::class.java)

        startActivity(tela6)

    }

    fun irTela7(v:View){
        val tela7 = Intent(this, ADMTela7::class.java)

        startActivity(tela7)
    }

    fun irTela8(v:View){
        val tela8 = Intent(this, ADMTela8::class.java)

        startActivity(tela8)
    }

}
