package com.ufo.sample.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorRes;

import com.ufo.dwrefresh.view.interf.IRefreshHead;
import com.ufo.dwrefresh.view.utils.DensityUtils;
import com.ufo.sample.R;

/**
 * 日期:2017/10/30
 * <p>
 * 作者:xudiwei
 * <p>
 * 描述:
 */

public class ToastHeadView extends FrameLayout implements IRefreshHead {

    private TextView mTvHeadViewContent;
    private LinearLayout mLlBg;

    public ToastHeadView(Context context) {
        this(context, null);
    }

    public ToastHeadView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ToastHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.widget_simple_head_view, this);
        mTvHeadViewContent = (TextView) findViewById(R.id.tv_head_view);
        mLlBg = (LinearLayout) findViewById(R.id.ll_bg);
    }

    @Override
    public void onStart() {
        mLlBg.setBackgroundColor(Color.WHITE);
        mTvHeadViewContent.setText("开始");
    }

    @Override
    public void onPullDown(int distance) {
        mTvHeadViewContent.setText("下拉中: " + distance);
    }

    @Override
    public void onBound() {
        mTvHeadViewContent.setText("下拉超过高度 ");
    }

    @Override
    public void onFingerUp(int distance) {
        mTvHeadViewContent.setText("松开: " + distance);
    }

    @Override
    public void onStop() {
        mTvHeadViewContent.setText("停止: ");
    }

    @Override
    public int headViewHeight() {
        return (int) DensityUtils.dipToPx(getContext(), 60);
    }

    public void setToast(String toast, @ColorRes int color) {
        mLlBg.setBackgroundResource(color);
        mTvHeadViewContent.setText(toast);
    }
}
