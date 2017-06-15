package com.qingtian.qq.groupon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qingtian.qq.groupon.R;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class FragmentTwo extends BaseFragment {

    @BindView(R.id.tv_fragment_skip) TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
        skip(textView);
        return view;
    }
}
