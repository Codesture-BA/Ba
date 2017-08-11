package com.ba.Utility;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;



/**
 * Created by mahadev on 6/22/16.
 */
public abstract class BaseFragment extends Fragment {
    public SharedPrefrences prefrences;
    public abstract void initComponent(View view);
    public abstract void initData();
    public abstract void initClickListner();
    public AppDialogs appDialogs;
    public BaseActivity baseActivity;
    public Context mContext;
    public BaseFragment(){

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        prefrences=new SharedPrefrences(getActivity());
        appDialogs = new AppDialogs(getActivity());
        baseActivity = (BaseActivity) getActivity();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        prefrences=new SharedPrefrences(getActivity());
        baseActivity = (BaseActivity) getActivity();
    }


    public static void hideKeyboard(Context ctx) {
        InputMethodManager inputManager = (InputMethodManager) ctx
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        // check if no view has focus:
        View v = ((Activity) ctx).getCurrentFocus();
        if (v == null)
            return;

        inputManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }


    public String getEditTextValue(EditText editText){
        return editText.getText().toString();
    }

}
