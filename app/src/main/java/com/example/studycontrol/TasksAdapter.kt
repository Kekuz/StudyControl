package com.example.studycontrol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studycontrol.databinding.TaskItemBinding

class TasksAdapter: RecyclerView.Adapter<TasksAdapter.TasksHolder>() {

    val task_list = ArrayList<Tasks>(arrayListOf(
        Tasks("Курсовая", "Необходимо переделать описание!"),
        Tasks("Английский", "У вас ошибка в 7 номере, необходимо преределать."),
        Tasks("Математическая логика", "Учебник стр. 6 задание 99")))

    class TasksHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = TaskItemBinding.bind(item)
        fun bind(task: Tasks){
            binding.tvTitle.text = task.title
            binding.tvAdd.text = task.addition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent,false)
        return TasksHolder(view)
    }

    override fun onBindViewHolder(holder: TasksHolder, position: Int) {
        holder.bind(task_list[position] )
    }

    override fun getItemCount(): Int {
        return task_list.size
    }

    fun addTask(task: Tasks) {
        task_list.add(task)
        notifyDataSetChanged()
    }

}