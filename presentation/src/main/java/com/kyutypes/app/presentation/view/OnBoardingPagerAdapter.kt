package com.kyutypes.app.presentation.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kyutypes.app.presentation.fragment.OnBoardingMainFragment

class OnBoardingPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        // Return a new fragment instance for each page
        return OnBoardingMainFragment.newInstance()
    }
}