package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class MainActivity3  : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_question3)

        val btnReturn=findViewById<Button>(R.id.btn_return)
        val btnNext=findViewById<Button>(R.id.btn_next)
        val btnBackto1=findViewById<Button>(R.id.btn_backto1)

        btnBackto1.setOnClickListener{
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnReturn.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener{
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }

}
