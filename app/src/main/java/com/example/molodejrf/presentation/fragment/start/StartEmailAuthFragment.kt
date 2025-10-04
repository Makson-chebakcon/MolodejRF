package com.example.molodejrf.presentation.fragment.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.molodejrf.R
import com.example.molodejrf.databinding.FragmentStartEmailAuthBinding


class StartEmailAuthFragment : Fragment() {

    private var _binding: FragmentStartEmailAuthBinding? = null
    private val binding get() =   _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartEmailAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCancelAuth.setOnClickListener {
            findNavController().navigate(
                R.id.action_startEmailAuthFragment_to_startFragmentAuth
            )
        }
    }


    override fun onDestroy() {
        super.onDestroy()

        _binding = null


    }

}