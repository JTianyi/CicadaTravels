package com.jiang.cicadatravels.ui.activity;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dllo on 16/7/11.
 */
public class MyApp extends Application{


    private static Context context;


    private static SharedPreferences sp;
    @Override
    public void onCreate() {
        super.onCreate();
        //oncreate中初始化
        context=getApplicationContext();
        sp=context.getSharedPreferences("MyDemo",MODE_PRIVATE);
    }

    //对外提供get方法
    public static Context getContext() {
        return context;
    }
}
