package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep2Binding

class OnBoardingStep2Fragment : BaseFragment<FragmentOnBoardingStep2Binding>() {

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