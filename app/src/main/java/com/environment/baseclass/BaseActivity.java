package com.environment.baseclass;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * ================================================
 * 描    述：Activity基类
 * 作    者：王智凡
 * 创建日期：2016/12/3
 * 版    本：1.0
 * 修订历史：
 * ================================================
 */
public class BaseActivity extends AppCompatActivity {


    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
