package com.example.boomb

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import kotlinx.coroutines.delay

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val songEffect = MediaPlayer.create(this, R.raw.endgame)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val textScore = findViewById<TextView>(R.id.textScore)
        val score = intent.extras?.getInt("score")
        textScore.text = score.toString()
        Handler().postDelayed({
          songEffect.start()
        }, 3000)
    }
}