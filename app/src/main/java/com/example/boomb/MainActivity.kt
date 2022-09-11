package com.example.boomb

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStartGame = findViewById<Button>(R.id.btnStartGame)

        btnStartGame.setOnClickListener {
            var numeroAleatorio:Int = 0
            val intent = Intent(this, boomb::class.java)
            numeroAleatorio = (1..64).shuffled().last()
            intent.putExtra("numeroAleatorio", numeroAleatorio)
            startActivity(intent)
        }
    }
}