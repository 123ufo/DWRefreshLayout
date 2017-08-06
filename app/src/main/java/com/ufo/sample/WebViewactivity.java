package com.ufo.sample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ufo.dwrefresh.view.DWRefreshLayout;

public class WebViewActivity extends AppCompatActivity {
    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_viewactivity);

        final WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://www.sina.com.cn/");
        webView.setWebViewClient(new WebViewClient());

        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
        dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        webView.loadUrl("http://www.baidu.com");
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore() {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        webView.loadUrl("http://www.sina.com.cn/");
                        dwRefreshLayout.setRefresh(false);
                    }
                }, 2000);
            }
        });


    }
}
