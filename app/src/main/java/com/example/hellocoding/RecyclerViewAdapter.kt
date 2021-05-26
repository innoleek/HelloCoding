package com.example.hellocoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(val data: List<Email>): RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val rowItem: View = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        val viewHolder = RecyclerViewHolder(rowItem)
        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentData = data[position]
        holder.subjectTextView.text = currentData.subject
        holder.bodyTextView.text = currentData.body
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class RecyclerViewHolder(rowItem: View) : RecyclerView.ViewHolder(rowItem) {
    val subjectTextView = rowItem.findViewById<TextView>(R.id.subject)
    val bodyTextView = rowItem.findViewById<TextView>(R.id.body)
}