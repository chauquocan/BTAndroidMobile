package com.example.btandroidmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Google","80$",R.drawable.google));
        arrayList.add(new Goods("Google","80$",R.drawable.google));
        arrayList.add(new Goods("Google","80$",R.drawable.google));

        adt = new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);

        lvGoods.setAdapter(adt);
    }

}