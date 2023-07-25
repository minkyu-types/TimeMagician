package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep1Binding
import com.kyutypes.app.presentation.viewmodel.OnBoardingViewModel

class OnBoardingStep1Fragment : BaseFragment<FragmentOnBoardingStep1Binding>() {
    private val viewModel: OnBoardingViewModel by viewModels()

    companion object {
        fun newInstance() = OnBoardingStep2Fragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingStep1Binding {
        return FragmentOnBoardingStep1Binding.inflate(inflater, container, false)
    }
}