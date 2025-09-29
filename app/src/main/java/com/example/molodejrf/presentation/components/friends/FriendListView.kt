package com.example.molodejrf.presentation.components.friends

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.molodejrf.data.model.Friend
import com.example.molodejrf.databinding.ComponentFriendsMainSreenBinding


class FriendListView @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0
    ) : FrameLayout(context, attributes, defStyleAttr) {

    private val binding = ComponentFriendsMainSreenBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    private val adapter = FriendAdapter()

    init {
        binding.friendRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.friendRecyclerView.adapter = adapter
    }

    fun setFriends(friends: List<Friend>) {
        adapter.submitList(friends)
    }


}