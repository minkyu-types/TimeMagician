package com.kyutypes.app.presentation.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.kyutypes.app.presentation.databinding.FragmentHistoryBinding
import com.kyutypes.app.presentation.viewmodel.HistoryViewModel

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    private val viewModel: HistoryViewModel by viewModels()

    companion object {
        fun newInstance() = HistoryFragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(inflater, container, false)
    }
}