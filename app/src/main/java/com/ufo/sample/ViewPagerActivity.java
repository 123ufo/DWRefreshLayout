package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ufo.dwrefresh.view.DWRefreshLayout;
import com.ufo.sample.adapter.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    private DWRefreshLayout mDwRefreshLayout;
    private static final String TAG = "ViewPagerActivity";

    Handler mHandler = new Handler(Looper.myLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        mDwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        mDwRefreshLayout.setOnRefreshListener(new MyOnRefreshListener());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));


        Log.d(TAG, "onCreate:--> ");
    }

    private class MyOnRefreshListener implements DWRefreshLayout.OnRefreshListener {
        @Override
        public void onRefresh() {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mDwRefreshLayout.setRefresh(false);
                }
            },1000);

        }

        @Override
        public void onLoadMore() {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mDwRefreshLayout.setRefresh(false);
                }
            },1000);
        }
    }
}
