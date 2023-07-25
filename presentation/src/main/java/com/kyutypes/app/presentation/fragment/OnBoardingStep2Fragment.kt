package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep2Binding
import com.kyutypes.app.presentation.viewmodel.OnBoardingViewModel

class OnBoardingStep2Fragment : BaseFragment<FragmentOnBoardingStep2Binding>() {
    private val viewModel: OnBoardingViewModel by viewModels()

    companion object {
        fun newInstance() = OnBoardingStep2Fragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingStep2Binding {
        return FragmentOnBoardingStep2Binding.inflate(inflater, container, false)
    }
}