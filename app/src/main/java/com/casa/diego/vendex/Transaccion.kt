package com.casa.diego.vendex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Transaccion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaccion)
    }
    fun confirmar(view: View){
        intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}
