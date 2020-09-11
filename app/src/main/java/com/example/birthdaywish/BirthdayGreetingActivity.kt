package com.example.birthdaywish

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthday_greeting.*


class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA ="name_extra"
    }

    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name =intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text ="Happy Birthday\n$name!"

        mediaPlayer = MediaPlayer.create(this,R.raw.songs)
        mediaPlayer?.setOnPreparedListener {
        }
        mediaPlayer?.start()
    }
}
