package com.ba.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ba.R;
import com.ba.Utility.BaseFragment;

/**
 * Created by nikunj-codesture on 11-Aug-17.
 */

public class DemoFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,container,false);

        initComponent(view);
        initData();
        initClickListner();
        return view;
    }

    @Override
    public void initComponent(View view) {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initClickListner() {

    }
}
