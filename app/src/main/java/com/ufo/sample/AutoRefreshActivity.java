package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ufo.dwrefresh.view.DWRefreshLayout;

public class AutoRefreshActivity extends AppCompatActivity {


    Handler mHandler = new Handler(Looper.getMainLooper());
    private DWRefreshLayout mDwRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_refresh);

        findViewById(R.id.tv_false).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDwRefreshLayout.setRefresh(false);
            }
        });


        mDwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        mDwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDwRefreshLayout.setRefresh(true);
    }
}
