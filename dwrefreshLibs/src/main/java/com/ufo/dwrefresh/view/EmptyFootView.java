package com.ufo.dwrefresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.ufo.dwrefresh.view.interf.ILoadMoreFoot;
import com.ufo.dwrefresh.view.utils.DensityUtils;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/7/3.
 * <p>
 * 描述：
 */

public class EmptyFootView extends FrameLayout implements ILoadMoreFoot {
    public EmptyFootView(Context context) {
        super(context);
    }

    public EmptyFootView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyFootView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPullUp(int distance) {

    }

    @Override
    public void onBound() {

    }

    @Override
    public void onFingerUp(int distance) {

    }

    @Override
    public void onStop() {

    }

    @Override
    public int footViewHeight() {
        return (int) DensityUtils.dipToPx(getContext(), 300);
    }
}
