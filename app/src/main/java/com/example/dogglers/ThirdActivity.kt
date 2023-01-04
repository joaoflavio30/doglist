package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.DogsAdapter
import com.example.dogglers.data.DataSource

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val dataSet = DataSource().loadDogs()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view3)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = DogsAdapter(this,dataSet)
        recyclerView.setHasFixedSize(true)

    }
}