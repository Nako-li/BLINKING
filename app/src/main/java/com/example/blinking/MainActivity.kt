package com.example.blinking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button= findViewById<Button>(R.id.login_btn)
        button.setOnClickListener{
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}