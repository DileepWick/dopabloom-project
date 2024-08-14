package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_started)

        // Find the button in the layout using its ID
        val button = findViewById<Button>(R.id.get_started_button_01)

        // Set an OnClickListener for the button
        button.setOnClickListener {
            // Create an Intent to start the ThirdActivity
            val intent = Intent(this, LoginAndSignup::class.java)

            // Start the ThirdActivity
            startActivity(intent)
        }
    }
}
