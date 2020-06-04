package com.project.clientservise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListMasterAdapter extends ArrayAdapter<String> {

    Context c;
    String[] name;
    int[] image;
    LayoutInflater inflater;

    public ListMasterAdapter(@NonNull Context context, String[] name, int[] image) {
        super(context, R.layout.list_button,name);

        this.c = context;
        this.name = name;
        this.image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null)
        {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_master, null);
        }

        TextView Name = convertView.findViewById(R.id.tv_nameCompany);
        ImageView Image = convertView.findViewById(R.id.im_company);


        Name.setText(name[position]);
        Image.setImageResource(image[position]);

        return convertView;
    }
}
