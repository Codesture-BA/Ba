package com.ba.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ba.Model.Category;
import com.ba.PhotosListActivity;
import com.ba.R;

import java.util.ArrayList;

/**
 * Created by nikunj-codesture on 11-Aug-17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.Holder> {


    private Context mContext;
    private ArrayList<Category> mCategories;

    public CategoryAdapter(Context mContext, ArrayList<Category> mCategories) {
        this.mContext = mContext;
        this.mCategories = mCategories;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(mContext).inflate(R.layout.row_category,parent,false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, PhotosListActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return  10;
    }

    public class Holder extends RecyclerView.ViewHolder{

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
