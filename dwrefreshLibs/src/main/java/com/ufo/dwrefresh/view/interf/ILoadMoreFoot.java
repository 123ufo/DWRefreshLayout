package com.ufo.dwrefresh.view.interf;

/**
 * Created by: xudiwei
 * <p>
 * on: 2017/6/2.
 * <p>
 * 描述：加载更多脚布局
 * 生命周期:1.onStart()
 * 2.onPullUp(int distance)
 * 3.onBound()
 * 4.onFingerUp(distance)
 * 5.onStop();
 */
public interface ILoadMoreFoot {

    /**
     * 开始上拉 调用一次
     */
    void onStart();

    /**
     * 上拉中 多次被调用
     *
     * @param distance 脚布局距离底部的距离
     */
    void onPullUp(int distance);

    /**
     * 下拉到边界 多次被调用
     */
    void onBound();

    /**
     * 松手 多次被调用
     *
     * @param distance 脚布局距离底部的距离
     */
    void onFingerUp(int distance);

    /**
     * 结束
     */
    void onStop();

    /**
     * 脚布局的view高度
     *
     * @return 返回脚布局view的高度(px)像素.
     */
    int footViewHeight();


}
