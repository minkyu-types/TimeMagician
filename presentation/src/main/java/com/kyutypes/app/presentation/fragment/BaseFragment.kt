package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import io.reactivex.rxjava3.disposables.CompositeDisposable

abstract class BaseFragment<T: ViewBinding>: Fragment() {
    private var _binding: T?= null
    protected val binding get() = _binding!!

    private var _compositeDisposable: CompositeDisposable? = null
    protected val compositeDisposable get() = _compositeDisposable!!

    protected val navController: NavController by lazy { findNavController() }

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getFragmentBinding(inflater, container)
        _compositeDisposable = CompositeDisposable()
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        _compositeDisposable?.clear()
        _compositeDisposable = null
        super.onDestroyView()
    }
}