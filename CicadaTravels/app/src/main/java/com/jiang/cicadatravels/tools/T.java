package com.jiang.cicadatravels.tools;

import android.widget.Toast;

import com.jiang.cicadatravels.ui.activity.MyApp;

/**
 * Created by dllo on 16/7/11.
 * 吐司的工具类
 */
public class T {
    private static boolean isDebug = true;

    /**
     * 吐司时间长的
     *
     * @param msg
     */
    public static void longMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * 吐司时间短的
     *
     * @param msg
     */
    public static void shortMsg(String msg) {
        if (isDebug) {
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
