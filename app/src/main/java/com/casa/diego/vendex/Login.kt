package com.casa.diego.vendex

import android.Manifest
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.view.View
import android.widget.EditText

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        permisos()
        setContentView(R.layout.activity_login)
    }
    fun iniciarSesion(view: View){
        Constants.user = (findViewById(R.id.editText) as EditText).text.toString()
        val intent = Intent(this, Menu::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)
    }
    fun regitrarse(view: View){
        val intent = Intent(this, Singup::class.java)
        startActivity(intent)
    }
    private fun permisos() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), 1)
    }
}
