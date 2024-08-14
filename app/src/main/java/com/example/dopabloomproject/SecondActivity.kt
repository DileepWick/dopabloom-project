package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Find the button in the layout using its ID
        val button = findViewById<Button>(R.id.go_to_third_screen_button)

        // Set an OnClickListener for the button
        button.setOnClickListener {
            // Create an Intent to start the ThirdActivity
            val intent = Intent(this, ThirdActivity::class.java)

            // Start the ThirdActivity
            startActivity(intent)
        }
    }
}
