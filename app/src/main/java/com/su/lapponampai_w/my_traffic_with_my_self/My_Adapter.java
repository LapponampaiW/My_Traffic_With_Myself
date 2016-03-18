package com.su.lapponampai_w.my_traffic_with_my_self;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 3/18/16.
 */
public class My_Adapter extends BaseAdapter {

    private Context adapContext;
    private int[] adapInts;
    private String[] adapStringsd1, getAdapStringsd2;

    public My_Adapter(Context adapContext, int[] adapInts, String[] adapStringsd1, String[] getAdapStringsd2) {
        this.adapContext = adapContext;
        this.adapInts = adapInts;
        this.adapStringsd1 = adapStringsd1;
        this.getAdapStringsd2 = getAdapStringsd2;
    }

    @Override
    public int getCount() {
        return adapStringsd1.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layout = (LayoutInflater) adapContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.my_listview, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(adapInts[position]);

        TextView textViewd1 = (TextView) view.findViewById(R.id.listview_d1);
        textViewd1.setText(adapStringsd1[position]);

        TextView textViewd2 = (TextView) view.findViewById(R.id.listview_d2);
        textViewd2.setText(getAdapStringsd2[position]);

        return view;



    }
}
