package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHorizontal = findViewById<Button>(R.id.btn_horizontal)
        val btnVertical = findViewById<Button>(R.id.btn_vertical)
        val btnGrid = findViewById<Button>(R.id.btn_grid)


        btnHorizontal.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

        btnGrid.setOnClickListener{
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)

        }

        btnVertical.setOnClickListener {
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }

    }
}