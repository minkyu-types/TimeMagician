package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.kyutypes.app.presentation.databinding.FragmentConvertBinding
import com.kyutypes.app.presentation.viewmodel.ConvertViewModel
import kotlinx.coroutines.launch

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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launch {
            viewModel.eventFlow.collect{ event -> handleEvent(event) }
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun handleEvent(event: ConvertViewModel.Event) = when(event) {
        is ConvertViewModel.Event.ShowToast -> {

        }
        is ConvertViewModel.Event.SelectDate -> {

        }
        is ConvertViewModel.Event.SelectTime -> {

        }
        is ConvertViewModel.Event.SelectTimeZone -> {

        }
        is ConvertViewModel.Event.ConvertTime -> {

        }
        else -> {

        }
    }
}