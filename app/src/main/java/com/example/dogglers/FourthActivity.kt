package com.example.dogglers


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.DogsAdapter
import com.example.dogglers.data.DataSource

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val dataSet = DataSource().loadDogs()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view4)
        recyclerView.adapter = DogsAdapter(this, dataSet)
        recyclerView.setHasFixedSize(true)
    }
}