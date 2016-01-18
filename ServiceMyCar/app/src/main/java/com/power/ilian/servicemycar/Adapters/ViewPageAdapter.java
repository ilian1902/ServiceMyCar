package com.power.ilian.servicemycar.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.power.ilian.servicemycar.R;
import com.power.ilian.servicemycar.fragments.AddCarFragment;
import com.power.ilian.servicemycar.fragments.AddRepairCar;
import com.power.ilian.servicemycar.fragments.HistoryFragment;
import com.power.ilian.servicemycar.fragments.HomeFragment;

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new HistoryFragment();
            case 2:
                return new AddRepairCar();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
