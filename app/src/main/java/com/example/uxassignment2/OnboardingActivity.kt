package com.example.uxassignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uxassignment2.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val fragment = mFragmentManager.findFragmentByTag(OnboardingFragment::class.java.simpleName)

        if (fragment == null) {
            mFragmentManager
                .beginTransaction()
                .replace(R.id.onboarding_container, OnboardingFragment(), OnboardingFragment::class.java.simpleName)
                .commit()
        }
    }
}