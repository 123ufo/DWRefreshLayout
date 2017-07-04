package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ufo.dwrefresh.view.DWRefreshLayout;

public class FrameLayoutActivity extends AppCompatActivity {

    Handler mHandler = new Handler(Looper.getMainLooper());
    private TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        mTvContent = (TextView) findViewById(R.id.tv_content);

        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mTvContent.setText("我刚才被刷新了");
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mTvContent.setText("我刚才被加载更多了");
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }
        });
    }
}
