package com.example.appadm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ADMTela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_d_m_tela2)
    }

    fun irTela3(v:View){
        val tela3 = Intent(this, ADMTela3::class.java)

        startActivity(tela3)

    }

    fun irTela4(v:View){
        val tela4 = Intent(this, ADMTela4::class.java)

        startActivity(tela4)
    }

    fun irTela5(v:View){
        val tela5 = Intent(this, ADMTela5::class.java)

        startActivity(tela5)
    }

}
