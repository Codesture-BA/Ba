package com.ba.Utility;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by mahadev on 6/20/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public SharedPrefrences prefrences;

    public abstract void initComponent();

    public abstract void initData();
    public abstract void initClickListner();

    public Context mContext;
    public Application application;
    public AppDialogs appDialogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefrences = new SharedPrefrences(this);
        mContext = BaseActivity.this;
        appDialogs = new AppDialogs(BaseActivity.this);
        hideKeyBoard(BaseActivity.this);
    }


    public void initActionBar(String title) {
//        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);




    }

    public void initBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        // getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_icon);
    }


    public void hideKeyBoard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public String getEditTextValue(EditText editText){
        return editText.getText().toString();
    }


    public GridLayoutManager getLayoutManager(int scrollbar, int row) {
        GridLayoutManager gridLayoutManager;
        //0 = Vertical 1 = Horizontal

        if (scrollbar == 1) {
            gridLayoutManager = new GridLayoutManager(mContext, row, LinearLayoutManager.HORIZONTAL, false);
            return gridLayoutManager;
        } else {
            gridLayoutManager = new GridLayoutManager(mContext, row, LinearLayoutManager.VERTICAL, false);
            return gridLayoutManager;

        }


    }


    public boolean isNetworkAvilable(Activity activity)
    {
        ConnectivityManager connectivityManager= (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        return networkInfo!=null && networkInfo.isConnected();
    }
}
