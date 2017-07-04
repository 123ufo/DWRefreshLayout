package com.ufo.sample.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ufo.dwrefresh.view.interf.ILoadMoreFoot;
import com.ufo.dwrefresh.view.utils.DensityUtils;
import com.ufo.sample.R;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/7/3.
 * <p>
 * 描述：一个最简单的自定请刷新头
 */

public class SimpleFootView extends FrameLayout implements ILoadMoreFoot {

    private TextView mTvHeadViewContent;

    public SimpleFootView(Context context) {
        this(context, null);
    }

    public SimpleFootView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SimpleFootView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.widget_simple_head_view, this);
        mTvHeadViewContent = (TextView) findViewById(R.id.tv_head_view);
    }

    @Override
    public void onStart() {
        mTvHeadViewContent.setText("开始");
    }

    @Override
    public void onPullUp(int distance) {
        mTvHeadViewContent.setText("上拉中: "+distance);
    }


    @Override
    public void onBound() {
        mTvHeadViewContent.setText("上拉超过高度 ");
    }

    @Override
    public void onFingerUp(int distance) {
        mTvHeadViewContent.setText("松开: " + distance);
    }

    @Override
    public void onStop() {
        mTvHeadViewContent.setText("停止 ");
    }

    @Override
    public int footViewHeight() {
        return (int) DensityUtils.dipToPx(getContext(), 60);
    }
}
