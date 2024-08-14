package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //Sign up navi
        val signupLink = findViewById<TextView>(R.id.signup_link)
        signupLink.setOnClickListener {
            val openSignUp = Intent(this, Signup::class.java)
            startActivity(openSignUp)

        }

        //Home navi
        val homeNavi = findViewById<Button>(R.id.login_to_home)
        homeNavi.setOnClickListener{
            val go_to_home = Intent(this,Home::class.java)
            startActivity(go_to_home)
        }

    }
}