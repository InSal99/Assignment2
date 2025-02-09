package com.example.uxassignment2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uxassignment2.databinding.FragmentOnboard2Binding

class Onboard2Fragment : Fragment() {
    private lateinit var binding: FragmentOnboard2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboard2Binding.inflate(inflater, container, false)

        binding.tvBoardingTitle.text = "Explore"
        binding.tvBoardingDescription.text = "Find what you need quickly"
        binding.ivBoardingIll.setImageResource(R.drawable.onboard2)

        return binding.root
    }
}