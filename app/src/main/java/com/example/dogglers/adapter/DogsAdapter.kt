package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dogglers

class DogsAdapter(private val context: Context, private val dataSet: List<Dogglers>) :
    RecyclerView.Adapter<DogsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView = itemView.findViewById(R.id.image_dog)
        val nameDog: TextView = itemView.findViewById(R.id.dog_name)
        val ageDog: TextView = itemView.findViewById(R.id.dog_age)
        val hobbieDog: TextView = itemView.findViewById(R.id.dog_hobbie)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataSet[position]
        holder.image.setImageResource(currentItem.imageResourceId)
        holder.nameDog.text = context.resources.getText(currentItem.name)
        holder.ageDog.text = context.resources.getText(currentItem.age)
        holder.hobbieDog.text = context.resources.getText(currentItem.hobbies)
    }

    override fun getItemCount(): Int = dataSet.size


}