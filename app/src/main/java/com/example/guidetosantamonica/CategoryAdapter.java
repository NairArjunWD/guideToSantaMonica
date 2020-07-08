package com.example.guidetosantamonica;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CoastFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new RecreationFragment();
        }
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Coast";
        } else if (position == 1) {
            return "Food";
        } else if (position == 2) {
            return "Shopping";
        } else {
            return "Fun";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
