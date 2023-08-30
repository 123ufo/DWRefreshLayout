package com.ufo.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ufo.dwrefresh.view.DWRefreshLayout;

import java.util.ArrayList;
import java.util.List;

public class BannerViewActivity extends AppCompatActivity {

    List<String> imgs = new ArrayList<>();
    private DWRefreshLayout mDwRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_view);

        imgs.add("http://o7m8diy9d.bkt.clouddn.com/static/2c/3c/62/c4/e0b5e7e1c39e429d8328e4fef2107a65.jpg");
        imgs.add("http://o7m8diy9d.bkt.clouddn.com/static/70/9f/a8/d0/27ebc37906964c24a448747699d64139.jpg");

        mDwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        mDwRefreshLayout.setOnRefreshListener(new MyOnRefreshListener());

//        BannerView bannerView = (BannerView) findViewById(R.id.bannerView);
//        bannerView.setData(imgs, new ImageLoadCallback() {
//            @Override
//            public void loadImage(ImageView imageView, String imgUrl) {
//                ImageLoadUtils.loadToUrl(BannerViewActivity.this, imageView, imgUrl);
//            }
//        });
    }

    private class MyOnRefreshListener implements DWRefreshLayout.OnRefreshListener {
        @Override
        public void onRefresh() {
            mDwRefreshLayout.setRefresh(false);
        }

        @Override
        public void onLoadMore() {
            mDwRefreshLayout.setRefresh(false);
        }
    }
}
