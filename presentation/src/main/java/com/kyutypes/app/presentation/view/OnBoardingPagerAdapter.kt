package com.kyutypes.app.presentation.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kyutypes.app.presentation.fragment.OnBoardingStep1Fragment
import com.kyutypes.app.presentation.fragment.OnBoardingStep2Fragment
import com.kyutypes.app.presentation.fragment.OnBoardingStep3Fragment

class OnBoardingPagerAdapter(f: Fragment) : FragmentStateAdapter(f) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int) =
        when (position) {
            1 -> OnBoardingStep1Fragment.newInstance()
            2 -> OnBoardingStep2Fragment.newInstance()
            3 -> OnBoardingStep3Fragment.newInstance()
            else -> error("OnBoarding Process ERROR!")
        }
}