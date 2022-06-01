package com.example.studycontrol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studycontrol.databinding.ChatPersonItemBinding

class ChatPersonAdapter: RecyclerView.Adapter<ChatPersonAdapter.ChatPersonHolder>() {

    val chat_person_list = ArrayList<ChatPerson>(arrayListOf(
        ChatPerson(R.drawable.ic_baseline_person_24, "Марина Ивановна"),
        ChatPerson(R.drawable.ic_baseline_person_24, "Виктор Васильевич")))

    class ChatPersonHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ChatPersonItemBinding.bind(item)
        fun bind(chat_person: ChatPerson){
            binding.tvName.text = chat_person.name
            binding.imagePerson.setImageResource(chat_person.avatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatPersonHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_person_item, parent,false)
        return ChatPersonHolder(view)
    }

    override fun onBindViewHolder(holder: ChatPersonHolder, position: Int) {
        holder.bind(chat_person_list[position] )
    }

    override fun getItemCount(): Int {
        return chat_person_list.size
    }

    fun addTask(chat_person: ChatPerson) {
        chat_person_list.add(chat_person)
        notifyDataSetChanged()
    }

}