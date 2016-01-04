package com.abdelsattar.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by abdelsattar on 30/07/15.
 */
public class tabsPagerAdapter extends FragmentPagerAdapter {

    Fragment[] fragments;

    public tabsPagerAdapter(FragmentManager fm, Fragment[] fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return 2;
    }
}