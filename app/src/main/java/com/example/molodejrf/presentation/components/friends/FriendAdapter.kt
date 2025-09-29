package com.example.molodejrf.presentation.components.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.molodejrf.R
import com.example.molodejrf.data.model.Friend
import coil.load

class FriendAdapter(
    private val items: MutableList<Friend>,
    private val onItemClick: (Friend) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.small_card_friend, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        if (holder is FriendViewHolder) {
            holder.bind(item)
        }
    }

    override fun getItemCount(): Int = items.size

    inner class FriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameText = itemView.findViewById<TextView>(R.id.name_item_friends)
        private val avatarImage = itemView.findViewById<ImageView>(R.id.avatar_item_friends)

        fun bind(friend: Friend) {
            nameText.text = friend.firstName
            avatarImage.load(friend.avatarBase64)
            itemView.setOnClickListener {
                onItemClick(friend)
            }
        }
    }
}
