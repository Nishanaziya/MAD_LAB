package com.example.gridview_alertbox;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public Integer[] thumbImages ={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
    };

    public ImageAdapter(Context c){
        mContext =c;
    }

    public int getCount(){
        return thumbImages.length;
    }

    public Object getItem(int i){
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup){

        ImageView imageview = new ImageView(mContext);
        imageview.setLayoutParams(new ViewGroup.LayoutParams(200,200));
        imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageview.setPadding(8,8,8,8);
        imageview.setImageResource(thumbImages[i]);
        return imageview;
    }


    }

