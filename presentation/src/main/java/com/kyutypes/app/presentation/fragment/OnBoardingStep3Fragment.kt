package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep3Binding

class OnBoardingStep3Fragment : BaseFragment<FragmentOnBoardingStep3Binding>() {

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