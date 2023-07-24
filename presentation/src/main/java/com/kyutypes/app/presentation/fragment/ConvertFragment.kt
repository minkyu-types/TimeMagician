package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyutypes.app.presentation.databinding.FragmentConvertBinding

class ConvertFragment : BaseFragment<FragmentConvertBinding>() {

    companion object {
        fun newInstance() = ConvertFragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentConvertBinding {
        return FragmentConvertBinding.inflate(inflater, container, false)
    }
}