package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep3Binding
import com.kyutypes.app.presentation.viewmodel.OnBoardingViewModel

class OnBoardingStep3Fragment : BaseFragment<FragmentOnBoardingStep3Binding>() {
    private val viewModel: OnBoardingViewModel by viewModels()

    companion object {
        fun newInstance() = OnBoardingStep3Fragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingStep3Binding {
        return FragmentOnBoardingStep3Binding.inflate(inflater, container, false)
    }
}