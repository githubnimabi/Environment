package com.environment.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.environment.R;
import com.environment.baseclass.BaseFragment;

/**
 * ================================================
 * 描    述：HomeActivity中的第一个选项卡
 * 作    者：王智凡
 * 创建日期：2016/12/3
 * 版    本：1.0
 * 修订历史：
 * ================================================
 */
public class FirstFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }
}
