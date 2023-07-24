package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyutypes.app.presentation.databinding.FragmentResultBinding

class ResultFragment : BaseFragment<FragmentResultBinding>() {

    companion object {
        fun newInstance() = ResultFragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentResultBinding {
        return FragmentResultBinding.inflate(inflater, container, false)
    }
}