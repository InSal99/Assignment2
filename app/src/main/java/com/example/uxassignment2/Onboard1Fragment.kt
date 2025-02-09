package com.example.uxassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uxassignment2.databinding.FragmentOnboard1Binding

class Onboard1Fragment : Fragment() {
    private lateinit var binding: FragmentOnboard1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboard1Binding.inflate(inflater, container, false)

        binding.tvBoardingTitle.text = "Your Title Here"
        binding.tvBoardingDescription.text = "Your Description Here"
        binding.ivBoardingIll.setImageResource(R.drawable.ic_launcher_background)

        return binding.root
    }
}