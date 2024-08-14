package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

/**
 * MainActivity is the entry point of the app.
 * It sets up the initial screen (activity_main) and handles button click events.
 */
class MainActivity : ComponentActivity() {

    /**
     * Called when the activity is first created.
     * Sets up the content view and initializes the UI components.
     *
     * @param savedInstanceState Bundle containing the activity's previously saved state.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to the layout defined in activity_main.xml
        setContentView(R.layout.activity_main)

        // Find the button in the layout using its ID
        val button = findViewById<Button>(R.id.go_to_second_screen_button)

        val imageView = findViewById<ImageView>(R.id.animatedImageView)

        // Set an OnClickListener for the button
        button.setOnClickListener {
            // Create an Intent to start the SecondActivity
            val intent = Intent(this, SecondActivity::class.java)

            // Start SecondActivity
            startActivity(intent)
        }
    }
}
