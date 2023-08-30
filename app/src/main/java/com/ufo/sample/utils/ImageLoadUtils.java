package com.ufo.sample.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.ufo.sample.R;

import java.io.File;

/**
 * 日期:2017/7/16 17:30
 * <p>
 * 作者:xudiwei
 * <p>
 * 描述:图片加载工具类
 */

public class ImageLoadUtils {

    private static final int DEFAULT_IMAGE = R.mipmap.ic_launcher;
    private static final int ERROR_IMAGE = R.mipmap.ic_launcher;

    private static final int DEFAULT_AVATAR = R.mipmap.ic_launcher;
    private static final int ERROR_AVATAR = R.mipmap.ic_launcher;


//    /**
//     * 加载文件类型头像
//     *
//     * @param context   上下文对象
//     * @param imageView 容器
//     * @param file      头像文件
//     */
//    public static void loadAvatar(Context context, ImageView imageView, File file) {
//        Glide.with(context)
//                .load(file)//图片的url
//                .centerCrop()//图片的显示方式。这里在是居中裁剪
//                .placeholder(DEFAULT_AVATAR) //默认的占位图片
//                .error(DEFAULT_AVATAR) //加载失败的图片
//                .crossFade(1000)//图片的加载效果，这里是淡入淡出，时间为1000毫秒
//                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存策略
//                .into(imageView);//加载
//    }
//
//    public static void loadToUrl(Context context, final ImageView imageView, String url) {
//        Glide.with(context).
//                load(url)//图片的url
//                .asBitmap()
//                .centerCrop()//图片的显示方式。这里在是居中裁剪
//                .placeholder(DEFAULT_IMAGE) //默认的占位图片
//                .error(ERROR_IMAGE) //加载失败的图片
////                .crossFade(1000)//图片的加载效果，这里是淡入淡出，时间为1000毫秒
//                .diskCacheStrategy(DiskCacheStrategy.ALL)//缓存策略
//                .into(new SimpleTarget<Bitmap>() {
//                    @Override
//                    public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
//                        imageView.setImageBitmap(resource);
//                    }
//                });
//
//    }

}
