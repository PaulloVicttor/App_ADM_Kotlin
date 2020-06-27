package com.example.appadm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
fun doLogin(v:View){

}
    fun irTela2(v:View){
        val tela2 = Intent(this, ADMTela2::class.java)

        startActivity(tela2)
    }

}
