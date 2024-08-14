package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class LoginAndSignup : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_and_signup)

        //Login Button Navigation
        val loginButton = findViewById<Button>(R.id.login_btn)
        loginButton.setOnClickListener {
            // Create an Intent to start the Login
            val intent = Intent(this, Login::class.java)

            // Start the Login
            startActivity(intent)
        }

        //Signup navigation
        val signupBtn = findViewById<Button>(R.id.signup_btn)
        signupBtn.setOnClickListener{
            // Create an Intent to start the Login
            val intent = Intent(this, Signup::class.java)
            // Start the Login
            startActivity(intent)
        }


    }
}