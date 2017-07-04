package com.ufo.dwrefresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.ufo.dwrefresh.view.interf.IRefreshHead;
import com.ufo.dwrefresh.view.utils.DensityUtils;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/7/3.
 * <p>
 * 描述：空刷新头
 */

public class EmptyHeadView extends FrameLayout implements IRefreshHead{

    public EmptyHeadView(Context context) {
        super(context);
    }

    public EmptyHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPullDown(int distance) {

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
    public int headViewHeight() {
        return (int) DensityUtils.dipToPx(getContext(),300);
    }
}
