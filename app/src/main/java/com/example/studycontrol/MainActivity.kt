package com.example.studycontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studycontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = TasksAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.apply {
            tasksView.layoutManager = LinearLayoutManager(this@MainActivity)
            tasksView.adapter = adapter
        }
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