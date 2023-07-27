package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingBinding
import com.kyutypes.app.presentation.viewmodel.OnBoardingViewModel

class OnBoardingFragment private constructor(): BaseFragment<FragmentOnBoardingBinding>() {
    private val viewModel: OnBoardingViewModel by viewModels()

    private lateinit var viewPager: ViewPager2
    private lateinit var nextButton: Button

    companion object {
        fun newInstance() = OnBoardingFragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingBinding {
        return FragmentOnBoardingBinding.inflate(inflater, container, false)
    }
}