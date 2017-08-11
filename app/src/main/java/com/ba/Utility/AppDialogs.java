package com.ba.Utility;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.sdsmdg.tastytoast.TastyToast;

import java.text.DateFormatSymbols;
import java.util.Calendar;


/**
 * Created by mahadev on 6/23/16.
 */
public class AppDialogs {

    Context mContext;
    SharedPrefrences prefrences;
    ProgressDialog pDialog;

    public AppDialogs(Context mContext) {
        this.mContext = mContext;
        prefrences=new SharedPrefrences(mContext);
    }


    public void showProgressDialog() {
        if (mContext != null) {
            if (pDialog == null) {
                pDialog = new ProgressDialog(mContext);
            }
            pDialog.setMessage("Please wait..");
            pDialog.setCancelable(false);
            pDialog.show();
        }

    }

    public void hideProgressDialog() {
        if (mContext != null) {
            if (pDialog != null) {
                pDialog.dismiss();
                pDialog = null;
            }
        }
    }

    public void setSuccessToast(String messgae) {

        TastyToast.makeText(mContext, messgae, 2, TastyToast.SUCCESS);
    }

    public void setErrorToast(String messgae) {

        TastyToast.makeText(mContext, messgae, 2, TastyToast.ERROR);
    }


    public void setProgressToast(String messgae) {

        TastyToast.makeText(mContext, messgae, 2, TastyToast.INFO);
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month - 1];
    }

}


