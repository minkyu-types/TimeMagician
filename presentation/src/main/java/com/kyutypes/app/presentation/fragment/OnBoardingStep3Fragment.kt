package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kyutypes.app.presentation.R
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingStep3Binding

class OnBoardingStep3Fragment : BaseFragment<FragmentOnBoardingStep3Binding>() {

    companion object {
        fun newInstance() = OnBoardingStep3Fragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingStep3Binding {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_step3, container, false)
    }
}