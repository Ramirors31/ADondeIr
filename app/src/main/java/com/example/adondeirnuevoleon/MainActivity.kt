package com.example.adondeirnuevoleon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ADondeIrNuevoLeon)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val registerBtn = findViewById<Button>(R.id.registerBtn)
        loginBtn.setOnClickListener(){
            val login = Intent(this,HomeActivity::class.java)
            startActivity(login)
        }

        registerBtn.setOnClickListener(){
            val register = Intent(this, RegisterActivity::class.java)
            startActivity(register)
        }
    }
}