package com.example.pau.quiz;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {
    Context context;
    String itemList[];

    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] menuStrings) {
        this.context = context;
        this.itemList = menuStrings;

        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return itemList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.menu_item, null);
        TextView item = (TextView) view.findViewById(R.id.menuItemTextView);
        item.setText(itemList[i]);
        return view;
    }
}
