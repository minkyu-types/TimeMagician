package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep1Binding

class OnBoardingStep1Fragment : BaseFragment<FragmentOnBoardingStep1Binding>() {

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