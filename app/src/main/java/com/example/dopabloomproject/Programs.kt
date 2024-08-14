package com.example.dopabloomproject

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class Programs :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.programs)


        //Home navi
        val homeNavi = findViewById<LinearLayout>(R.id.home_button_icon)
        homeNavi.setOnClickListener{
            val goPrograms = Intent(this,Home::class.java)
            startActivity(goPrograms)
        }


        //Program navigation
        val programsNavi = findViewById<LinearLayout>(R.id.programs_button_icon)

        programsNavi.setOnClickListener{
            val goPrograms = Intent(this,Programs::class.java)
            startActivity(goPrograms)
        }

        //Challenges navigation
        val chlNavi = findViewById<LinearLayout>(R.id.challenges_button_icon)

        chlNavi.setOnClickListener{
            val goPrograms = Intent(this,Challenges::class.java)
            startActivity(goPrograms)
        }

        //Profile navigation
        val profileNavi = findViewById<LinearLayout>(R.id.profile_button_icon)
        profileNavi.setOnClickListener{
            val goPrograms = Intent(this,Profile::class.java)
            startActivity(goPrograms)
        }
    }
}