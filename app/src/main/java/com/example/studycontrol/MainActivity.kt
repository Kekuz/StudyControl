package com.example.studycontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun chatMe(view: View){
        val chatIntent = Intent(this, ChatActivity::class.java)
        startActivity(chatIntent)
    }

    fun settingsMe(view: View){
        val settingsIntent = Intent(this, SettingsActivity::class.java)
        startActivity(settingsIntent)
    }
    fun homeMe(view: View){
        val homeIntent = Intent(this, MainActivity::class.java)
        startActivity(homeIntent)
    }
}