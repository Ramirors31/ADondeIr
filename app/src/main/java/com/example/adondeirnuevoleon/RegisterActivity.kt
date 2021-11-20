package com.example.adondeirnuevoleon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val emailRegisterBtn : Button = findViewById<Button>(R.id.emailRegisterBtn)
        val facebookRegisterBtn: LinearLayout = findViewById<LinearLayout>(R.id.facebookRegisterBtn)
        val googleRegisterBtn : LinearLayout = findViewById<LinearLayout>(R.id.googleRegisterBtn)

        //EMAIL REGISTER
        emailRegisterBtn.setOnClickListener(){
            Toast.makeText(this,"Registro con email", Toast.LENGTH_LONG )
        }
        //FACEBOOK REGISTER
        facebookRegisterBtn.setOnClickListener(){
            Toast.makeText(this,"Registro con Facebook", Toast.LENGTH_LONG )
        }
        //GOOGLE REGISTER
        googleRegisterBtn.setOnClickListener(){
            Toast.makeText(this,"Registro con Google", Toast.LENGTH_LONG )
        }

    }
}