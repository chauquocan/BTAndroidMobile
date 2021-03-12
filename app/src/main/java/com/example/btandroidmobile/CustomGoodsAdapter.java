package com.example.btandroidmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        //i la position
        convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        //Anh xa
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        ImageView imageShirt = convertView.findViewById(R.id.imageShirt);

        //Gan gia tri
        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imageShirt.setImageResource(arrayList.get(i).getImageGoods());

        return convertView;
    }
}
