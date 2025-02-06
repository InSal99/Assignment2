package com.example.uxassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uxassignment2.databinding.FragmentOnboard2Binding
import com.example.uxassignment2.databinding.FragmentOnboarding3Binding

class Onboarding3Fragment : Fragment() {

    private lateinit var binding: FragmentOnboarding3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboarding3Binding.inflate(inflater, container, false)


        binding.btnNext.setOnClickListener {
            //Main Activity
        }

        binding.btnSkip.setOnClickListener {
            //Main Activity
        }


        return binding.root
    }

}