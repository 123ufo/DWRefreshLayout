package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ufo.dwrefresh.view.DWRefreshLayout;
import com.ufo.sample.widget.SimpleHeadView;

public class CustomHeadViewActivity extends AppCompatActivity {
    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_head_view);

        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        //自定义一个最简单的刷新头
        dwRefreshLayout.setHeadView(new SimpleHeadView(this));
//        final ToastHeadView headView = new ToastHeadView(this);
//        dwRefreshLayout.setHeadView(headView);
        dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
//                mHandler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        headView.setToast("已为你更新了5条最新消息",R.color.colorPrimaryDarkLight);
//                    }
//                }, 1000);
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(CustomHeadViewActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(CustomHeadViewActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }
        });
    }
}
