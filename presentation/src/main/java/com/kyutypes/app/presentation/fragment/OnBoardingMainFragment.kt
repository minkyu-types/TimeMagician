package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.kyutypes.app.presentation.R
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingMainBinding

class OnBoardingMainFragment : BaseFragment<FragmentOnBoardingMainBinding>() {
    private lateinit var viewPager: ViewPager2
    private lateinit var nextButton: Button

    companion object {
        fun newInstance() = OnBoardingMainFragment()
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnBoardingMainBinding {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding_main, container, false)
    }
}