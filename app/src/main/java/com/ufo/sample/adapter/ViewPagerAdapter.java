package com.ufo.sample.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ufo.sample.fragment.TestFragment;

/**
 * 日期:2017/12/8
 * <p>
 * 作者:xudiwei
 * <p>
 * 描述:
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    Fragment mFragment = null;
    Bundle mBundle;

    @Override
    public Fragment getItem(int position) {
        mBundle = new Bundle();
        switch (position) {
            case 0:
                mBundle.putString("data", "页面1");
                break;
            case 1:
                mBundle.putString("data", "页面2");
                break;
            case 2:
                mBundle.putString("data", "页面3");
                break;
        }
        mFragment = new TestFragment();
        mFragment.setArguments(mBundle);
        return mFragment;
    }


}
