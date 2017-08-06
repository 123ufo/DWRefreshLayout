package com.ufo.dwrefresh.view.interf;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/6/2.
 * <p>
 * 描述：刷新布局的头view
 * <p>
 * 生命周期:1.onStart()
 * 2.onPullDown(int distance)
 * 3.onBound()
 * 4.onFingerUp(distance)
 * 5.onStop();
 */
public interface IRefreshHead {

    /**
     * 开始下拉,只调用一次
     */
    void onStart();

    /**
     * 下拉中 多次被调用
     *
     * @param distance 头布局距离顶部的距离
     */
    void onPullDown(int distance);

    /**
     * 下拉到边界 多次被调用
     */
    void onBound();

    /**
     * 松手 多次被调用
     *
     * @param distance 头布局距离顶部的距离
     */
    void onFingerUp(int distance);

    /**
     * 结束
     */
    void onStop();

    /**
     * 头布局的view高度
     *
     * @return 返回头布局view的高度(px)像素
     */
    int headViewHeight();


}
