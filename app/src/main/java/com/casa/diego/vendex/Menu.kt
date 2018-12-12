package com.casa.diego.vendex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    fun buscar(view: View){
        intent = Intent(this, MapProductos::class.java)
        startActivity(intent)
    }
    fun comprar(view: View){
        intent = Intent(this, Map::class.java)
        startActivity(intent)
    }
}
