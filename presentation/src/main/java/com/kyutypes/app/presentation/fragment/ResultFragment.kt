package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentResultBinding
import com.kyutypes.app.presentation.viewmodel.ResultViewModel

class ResultFragment : BaseFragment<FragmentResultBinding>() {
    private val viewModel: ResultViewModel by viewModels()

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