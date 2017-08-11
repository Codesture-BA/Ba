package com.ba;

import android.os.Bundle;

import com.ba.Utility.BaseActivity;

/**
 * Created by nikunj-codesture on 11-Aug-17.
 */

public class DemoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photos_list);

        initComponent();
        initData();
        initClickListner();
    }

    @Override
    public void initComponent() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initClickListner() {

    }
}
