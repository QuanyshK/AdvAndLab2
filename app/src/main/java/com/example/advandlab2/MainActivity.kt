package com.example.advandlab2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.chatecholib.ChatStarter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSend = findViewById<Button>(R.id.buttonSend)
        buttonSend.setOnClickListener {
            ChatStarter.start(this)
        }
    }
}