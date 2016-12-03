package com.environment.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.environment.R;
import com.environment.baseclass.BaseActivity;
import com.environment.ui.fragment.ContactFragment;
import com.environment.ui.fragment.FirstFragment;
import com.environment.ui.fragment.GroupFragment;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * ================================================
 * 描    述：HomeActivity
 * 作    者：王智凡
 * 创建日期：2016/12/3
 * 版    本：1.0
 * 修订历史：
 * ================================================
 */
public class HomeActivity extends BaseActivity {

    @Bind(R.id.iv_map)
    ImageView ivMap;
    @Bind(R.id.iv_contact)
    ImageView ivContact;
    @Bind(R.id.iv_group)
    ImageView ivGroup;
    @Bind(R.id.tv_map)
    TextView tvMap;
    @Bind(R.id.tv_contact)
    TextView tvContact;
    @Bind(R.id.tv_group)
    TextView tvGroup;

    private Fragment fragmentFrist, fragmentContact, fragmentGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setSeceted(0);
    }

    private void setSeceted(int i) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        hideFragment(transaction);
        switch (i) {
            case 0:
                if (fragmentFrist == null) {
                    fragmentFrist = new FirstFragment();
                    transaction.add(R.id.fragment_home, fragmentFrist);
                } else {
                    transaction.show(fragmentFrist);
                }
                ivMap.setImageResource(R.drawable.ic_map_p);
                tvMap.setTextColor(Color.parseColor("#68D796"));
                break;
            case 1:
                if (fragmentContact == null) {
                    fragmentContact = new ContactFragment();
                    transaction.add(R.id.fragment_home, fragmentContact);
                } else {
                    transaction.show(fragmentContact);
                }
                ivContact.setImageResource(R.drawable.ic_contact_p);
                tvContact.setTextColor(Color.parseColor("#68D796"));
                break;
            case 2:
                if (fragmentGroup == null) {
                    fragmentGroup = new GroupFragment();
                    transaction.add(R.id.fragment_home, fragmentGroup);
                } else {
                    transaction.show(fragmentGroup);
                }
                ivGroup.setImageResource(R.drawable.ic_group_n);
                tvGroup.setTextColor(Color.parseColor("#68D796"));
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (fragmentFrist != null)
            transaction.hide(fragmentFrist);
        if (fragmentContact != null)
            transaction.hide(fragmentContact);
        if (fragmentGroup != null)
            transaction.hide(fragmentGroup);
    }

    @OnClick({R.id.layout_tab_map, R.id.layout_tab_contact, R.id.layout_tab_group})
    public void onClick(View v) {
        resetImage();
        switch (v.getId()) {
            case R.id.layout_tab_map:
                setSeceted(0);
                break;
            case R.id.layout_tab_contact:
                setSeceted(1);
                break;
            case R.id.layout_tab_group:
                setSeceted(2);
                break;
        }
    }

    private void resetImage() {
        ivMap.setImageResource(R.drawable.ic_map_n);
        ivContact.setImageResource(R.drawable.ic_contact_n);
        ivGroup.setImageResource(R.drawable.ic_group_n);
        int color = Color.parseColor("#333333");
        tvMap.setTextColor(color);
        tvContact.setTextColor(color);
        tvGroup.setTextColor(color);
    }
}
