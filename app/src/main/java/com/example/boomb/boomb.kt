package com.example.boomb

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class boomb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boomb)

        val nuemroAleatorioIntent = intent.extras?.getInt("numeroAleatorio")
        var scoreOnClicked:Int = 0
        val songEfect = MediaPlayer.create(this, R.raw.explosion)

        for (i in 1..64) {
            val btn = findViewById<Button>(resources.getIdentifier("btn$i", "id", packageName))
            btn.setOnClickListener {
                scoreOnClicked++
                if (nuemroAleatorioIntent == i) {
                    songEfect.start()
                    btn.setBackgroundColor(Color.parseColor("#C31C04"))
                    val intent = Intent(this, ScoreActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("score", scoreOnClicked)
                    startActivity(intent)
                } else {
                    btn.setBackgroundColor(Color.parseColor("#3B3B3B"))
                }
            }
        }
    }
}