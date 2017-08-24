package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ufo.dwrefresh.view.DWRefreshLayout;

public class SimpleActivity extends AppCompatActivity {

    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);


        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        //开启禁止加载更多
//        dwRefreshLayout.lockLoadMore(true);
        dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SimpleActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SimpleActivity.this, "加载更多完成", Toast.LENGTH_SHORT).show();
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }
        });
    }
}
