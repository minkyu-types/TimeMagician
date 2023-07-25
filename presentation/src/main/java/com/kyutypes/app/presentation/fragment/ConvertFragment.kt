package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentConvertBinding
import com.kyutypes.app.presentation.viewmodel.ConvertViewModel

class ConvertFragment : BaseFragment<FragmentConvertBinding>() {
    private val viewModel: ConvertViewModel by viewModels()

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