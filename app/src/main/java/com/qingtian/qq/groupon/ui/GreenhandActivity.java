package com.qingtian.qq.groupon.ui;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import com.qingtian.qq.groupon.R;
import com.qingtian.qq.groupon.adapter.MyPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GreenhandActivity extends FragmentActivity {

    @BindView(R.id.vp_greenhand) ViewPager viewPager;
    MyPagerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenhand);
        ButterKnife.bind(this);
        initViewPager();
    }

    private void initViewPager(){
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

}
