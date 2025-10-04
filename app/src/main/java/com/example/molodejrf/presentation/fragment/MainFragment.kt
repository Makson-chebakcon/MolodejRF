package com.example.molodejrf.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.molodejrf.R
import com.example.molodejrf.TestDataFriends

import com.example.molodejrf.databinding.FragmentMainBinding
import com.example.molodejrf.presentation.components.friends.FriendAdapter
import com.google.android.material.appbar.MaterialToolbar


class MainFragment : Fragment() {

    private lateinit var toolbar: MaterialToolbar
    private lateinit var avatar: ImageView
    private lateinit var buttonSetting: ImageButton
    private lateinit var button2: ImageButton
    private lateinit var button3: ImageButton

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainBinding.inflate(inflater, container,false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? AppCompatActivity)?.setSupportActionBar(binding.materialToolbar)


        val avatar = binding.materialToolbar.findViewById<ImageView>(R.id.profileAvatar)
        avatar?.load("https://i.pravatar.cc/150?img=1")

        val adapter = FriendAdapter(
            items = TestDataFriends().testFriends,
            onItemClick = {}
        )

        binding.mainFriendRecyclerView.adapter = adapter




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}