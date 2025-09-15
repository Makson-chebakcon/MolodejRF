package com.example.molodejrf.presentation.components.friends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.molodejrf.R
import com.example.molodejrf.data.api.Friend
import coil.load

class FriendAdapter(
    private val onItemClick: (Friend) -> Unit
) : ListAdapter<Friend, FriendAdapter.FriendViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.small_card_friend, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameText = itemView.findViewById<TextView>(R.id.textView8)
        private val avatarImage = itemView.findViewById<ImageView>(R.id.imageView2)

        fun bind(friend: Friend) {
            nameText.text = friend.name

            avatarImage.load(friend.avatar)

            itemView.setOnClickListener {
                onItemClick(friend)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Friend>() {
        override fun areItemsTheSame(oldItem: Friend, newItem: Friend): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Friend, newItem: Friend): Boolean =
            oldItem == newItem
    }
}
