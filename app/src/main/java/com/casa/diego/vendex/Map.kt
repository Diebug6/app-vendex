package com.casa.diego.vendex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class Map : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val t = Timer()
        intent = Intent(this, Transaccion::class.java)
        setContentView(R.layout.activity_map)
        t.schedule(object : TimerTask(){
            override fun run() {
                startActivity(intent)
            }
        }, 2200)
    }
}
