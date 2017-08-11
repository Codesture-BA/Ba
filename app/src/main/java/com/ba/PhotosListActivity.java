package com.ba;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.ba.Adapter.CategoryAdapter;
import com.ba.Adapter.PhotosAdapter;
import com.ba.Model.Category;
import com.ba.Utility.BaseActivity;

import java.util.ArrayList;

/**
 * Created by nikunj-codesture on 11-Aug-17.
 */

public class PhotosListActivity extends BaseActivity {


    private RecyclerView recyclerID;
    private ArrayList<Category> mCategories;
    PhotosAdapter photosAdapter;


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

        recyclerID = (RecyclerView) findViewById(R.id.recyclerID);
        recyclerID.setLayoutManager(getLayoutManager(2,1));
        recyclerID.setNestedScrollingEnabled(false);
    }

    @Override
    public void initData() {
        photosAdapter = new PhotosAdapter(mContext,mCategories);
        recyclerID.setAdapter(photosAdapter);
    }

    @Override
    public void initClickListner() {

    }
}
