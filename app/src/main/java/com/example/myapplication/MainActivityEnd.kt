package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityEnd : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_end)

        val btnBackto1=findViewById<Button>(R.id.btn_backto1)

        btnBackto1.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}