package com.ba.Utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;


/**
 * Created by mahadev on 6/21/16.
 */
public class SharedPrefrences {

    SharedPreferences mPref;
    SharedPreferences.Editor editor;
    Gson gson;

    public SharedPrefrences(Context mContext) {
        mPref = mContext.getSharedPreferences("Ayyar Group", Context.MODE_PRIVATE);
        editor = mPref.edit();
        gson = new Gson();

    }



    public void setFlag(Context context, Boolean myFlag)
    {
        editor.putBoolean("flag", myFlag);
        editor.commit();
    }

    public boolean getFlag()
    {
        Boolean flag = mPref.getBoolean("flag",false);
        return flag;

    }



}
