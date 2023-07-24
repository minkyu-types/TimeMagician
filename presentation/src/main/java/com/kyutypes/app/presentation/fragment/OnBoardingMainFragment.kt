package com.kyutypes.app.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.kyutypes.app.presentation.databinding.FragmentOnBoardingMainBinding
import com.kyutypes.app.presentation.view.OnBoardingPagerAdapter

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
        return FragmentOnBoardingMainBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewpagerOnboarding.adapter = OnBoardingPagerAdapter(this)
        binding.buttonNext.setOnClickListener {
            val currItem = binding.viewpagerOnboarding.currentItem

            if (currItem < 2) {
                binding.viewpagerOnboarding.currentItem = currItem + 1
            }
            if (currItem == 3) {

            }
        }
    }
}