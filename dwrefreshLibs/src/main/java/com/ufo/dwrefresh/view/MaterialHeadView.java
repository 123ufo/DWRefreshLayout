package com.ufo.dwrefresh.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.ufo.dwrefresh.view.interf.IRefreshHead;
import com.ufo.dwrefresh.view.utils.DensityUtils;
import com.ufo.dwrefreshlayout.R;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/6/16.
 * <p>
 * 描述：Material Design风格的刷新头View
 */

public class MaterialHeadView extends FrameLayout implements IRefreshHead {

    MaterialProgressDrawable mProgress;
    private static final String TAG = "MaterialHeadView";
    private CircleImageView mImageView;
    // Default background for the progress spinner
    private static final int CIRCLE_BG_LIGHT = 0xFFFAFAFA;

    public MaterialHeadView(Context context) {
        this(context, null);
    }

    public MaterialHeadView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialHeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    /**
     * 初始化view
     */
    private void initView() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.widget_material_head, this);
        LinearLayout llRoot = (LinearLayout) view.findViewById(R.id.rl_root);
        mImageView = new CircleImageView(getContext(), CIRCLE_BG_LIGHT);
        setColorSchemeColors(Color.RED, Color.GREEN, Color.CYAN);
        llRoot.addView(mImageView, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT
                , LinearLayout.LayoutParams.WRAP_CONTENT));

        mProgress = new MaterialProgressDrawable(getContext(), this);
        mImageView.setImageDrawable(mProgress);
        mProgress.setBackgroundColor(CIRCLE_BG_LIGHT);
        mProgress.setColorSchemeColors(mColors);
        mProgress.setAlpha(255);
        mProgress.showArrow(true);
        mProgress.updateSizes(MaterialProgressDrawable.DEFAULT);

        Log.d(TAG, "initView");
    }

    private int[] mColors;

    public void setColorSchemeColors(int... colors) {
        mColors = colors;
        if (null != mProgress) {
            mProgress.setColorSchemeColors(mColors);
        }

    }

    @Override
    public void onStart() {
        mProgress.stop();
        mImageView.setImageDrawable(mProgress);
        Log.d(TAG, "onStart");

    }

    @Override
    public void onPullDown(int distance) {
        Log.d(TAG, "onPullDown");
    }

    @Override
    public void onBound() {
        Log.d(TAG, "onBound");
    }

    @Override
    public void onFingerUp(int distance) {
        mProgress.start();
        Log.d(TAG, "onFingerUp: " + distance);
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop");
    }

    @Override
    public int headViewHeight() {
        return (int) DensityUtils.dipToPx(getContext(), 100);
    }
}
