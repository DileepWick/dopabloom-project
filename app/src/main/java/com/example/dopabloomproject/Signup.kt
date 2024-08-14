package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class Signup :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        //Login navi
        val loginNavi = findViewById<TextView>(R.id.login_link)
        loginNavi.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        //Signup navi
        val signupNavi = findViewById<Button>(R.id.signup_form_btn)
        signupNavi.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}