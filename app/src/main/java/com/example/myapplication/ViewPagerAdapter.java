package com.example.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import static com.example.myapplication.MainActivity.VIEWPAGER_TABS;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentUserActivity1.newInstance(position);
            case 1:
                return FragmentUserActivity2.newInstance(position);
            case 2:
                return FragmentUserActivity3.newInstance(position);
            case 3:
                return FragmentUserActivity4.newInstance(position);
            default:
                return FragmentUserActivity1.newInstance(position);

        }
    }

    @Override
    public int getCount() {
        return 4;  // 4 tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position < 0 || position > 3) position = 0;
        return VIEWPAGER_TABS[position];
    }
}
