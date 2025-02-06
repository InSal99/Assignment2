package com.example.uxassignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uxassignment2.databinding.FragmentOnboard1Binding
import com.example.uxassignment2.databinding.FragmentOnboard2Binding
import com.example.uxassignment2.databinding.FragmentOnboardingBinding

class Onboard2Fragment : Fragment() {
    private lateinit var binding: FragmentOnboard2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboard2Binding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            val fragmentNext = Onboarding3Fragment()

            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.onboarding_container, fragmentNext, Onboarding3Fragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        binding.btnSkip.setOnClickListener {
            //Main Activity
        }

        return binding.root
    }
}