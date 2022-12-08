package com.android.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(var tasks: List<String>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.descriptionTextView.text = tasks[position]
        holder.completedCheckBox.isChecked = false
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val descriptionTextView: TextView = view.findViewById(R.id.task)
        val completedCheckBox: CheckBox = view.findViewById(R.id.task_completed)
    }
}