package com.ufo.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ufo.dwrefresh.view.DWRefreshLayout;
import com.ufo.dwrefresh.view.EmptyFootView;
import com.ufo.dwrefresh.view.EmptyHeadView;

public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        dwRefreshLayout.setHeadView(new EmptyHeadView(this));
        dwRefreshLayout.setFootView(new EmptyFootView(this));
        dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                dwRefreshLayout.setRefresh(false);
            }

            @Override
            public void onLoadMore() {
                dwRefreshLayout.setRefresh(false);
            }
        });
    }
}
