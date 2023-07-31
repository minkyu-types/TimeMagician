package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingBinding
import com.kyutypes.app.presentation.viewmodel.OnBoardingViewModel

class OnBoardingFragment constructor(): BaseFragment<FragmentOnBoardingBinding>() {
    private val viewModel: OnBoardingViewModel by viewModels()

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