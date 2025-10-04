package com.example.molodejrf.presentation.fragment.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.molodejrf.R
import com.example.molodejrf.databinding.FragmentStartAuthBinding


class StartFragmentAuth : Fragment() {

    private var _binding: FragmentStartAuthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_start_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonNotMeAcount.setOnClickListener {
            findNavController().navigate(
                R.id.action_startFragmentAuth3_to_mainFragment
            )
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}