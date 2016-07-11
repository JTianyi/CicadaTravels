package com.jiang.cicadatravels.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by dllo on 16/7/11.
 * 抽象的Activity基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        //去掉信息栏(在setContentView上方)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //绑定布局
        setContentView(setLayout());
        //初始化组件
        initViews();
        //初始化数据
        initDatas();
    }

    //layout布局文件
    protected abstract int setLayout();

    //初始化组件
    protected abstract void initViews();

    //初始化数据
    protected abstract void initDatas();

    //FindViewById
    protected <T extends View> T byView(int resId) {
        return (T) findViewById(resId);
    }

    //简化Intent跳转
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to) {
        Intent intent = new Intent(from, to);
        startActivity(intent);
    }

    //隐式Intent
    protected void goTo(String action, String uri) {
        Intent intent = new Intent(action);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    //带值跳转
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to, Bundle values) {
        Intent intent = new Intent(from, to);
        intent.putExtras(values);
        startActivity(intent);
    }


}
