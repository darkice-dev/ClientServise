package com.project.clientservise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListServiceAdapter extends ArrayAdapter<String> {

    private Context c;
    private String[] service;
    private String[] price;
    private String[] workTime;
    private LayoutInflater inflater;

    public ListServiceAdapter(@NonNull Context context, String[] service, String[] price,
                              String[] workTime) {
        super(context, R.layout.list_service,service);

        this.c = context;
        this.service = service;
        this.price = price;
        this.workTime = workTime;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_service, null);
        }

        TextView Service = convertView.findViewById(R.id.tv_service);
        TextView Price = convertView.findViewById(R.id.tv_price);
        TextView WorkTime = convertView.findViewById(R.id.tv_workTime);

        Service.setText(service[position]);
        Price.setText(price[position]);
        WorkTime.setText(workTime[position]);

        return convertView;
    }
}
