package com.example.molodejrf.presentation.fragment.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.molodejrf.R
import com.example.molodejrf.databinding.FragmentMainBinding
import com.example.molodejrf.databinding.FragmentStartFirstScreenBinding


class StartFirstScreenFragment : Fragment(R.layout.fragment_start_first_screen) {

    private var _binding: FragmentStartFirstScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartFirstScreenBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            firstScreenButtonStart.setOnClickListener {
                findNavController().navigate(
                    R.id.action_startFirstScreenFragment_to_startEmailAuthFragment
                )
            }

            buttonNotMeAcount.setOnClickListener {
                findNavController().navigate(
                    R.id.action_startFirstScreenFragment_to_startRegistrationFragment4
                )
            }

        }
    }


}