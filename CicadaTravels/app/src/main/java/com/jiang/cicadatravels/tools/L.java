package com.jiang.cicadatravels.tools;

import android.util.Log;

/**
 * Created by dllo on 16/7/11.
 */
public final class L {

    //私有的构造方法
    private L() {
    }

    //调试模式 目前定义为true
    private static boolean isDebug = true;
    //log的标签,定义的是应用名
    private static String TAG = "MyDemo";


    //使用默认的TAG标签
    public static void d(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }

    //使用自定义的TAG标签的
    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    //使用默认的TAG标签
    public static void e(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    //使用自定义的TAG标签的
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    //使用默认的TAG标签
    public static void i(String msg) {
        if (isDebug) {
            Log.i(TAG, msg);
        }
    }

    //使用自定义的TAG标签的
    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    //使用默认的TAG标签
    public static void w(String msg) {
        if (isDebug) {
            Log.w(TAG, msg);
        }
    }

    //使用自定义的TAG标签的
    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg);
        }
    }


}
