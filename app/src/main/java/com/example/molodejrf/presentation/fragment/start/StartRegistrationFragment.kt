package com.example.molodejrf.presentation.fragment.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.molodejrf.R
import com.example.molodejrf.databinding.FragmentRegistrationBinding


class StartRegistrationFragment : Fragment(R.layout.fragment_registration) {

    private var _binding :FragmentRegistrationBinding?  = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater,container,false)

        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonDone.setOnClickListener {
            findNavController().navigate(
                R.id.action_startRegistrationFragment4_to_startEmailAuthFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}