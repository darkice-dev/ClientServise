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

public class ListButtonAdapter extends ArrayAdapter<String>{

    Context c;
    String[] nameCompany;
    String[] address;
    String[] workTime;
    String[] rating;
    int[] image;
    LayoutInflater inflater;

    public ListButtonAdapter(@NonNull Context context, String[] nameCompany, String[] address,
                             String[] workTime, String[] rating, int[] image) {
        super(context, R.layout.list_button,nameCompany);

        this.c = context;
        this.nameCompany = nameCompany;
        this.address = address;
        this.workTime = workTime;
        this.rating = rating;
        this.image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null)
        {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_button, null);
        }

        TextView NameCompany = convertView.findViewById(R.id.tv_nameCompany);
        TextView Address = convertView.findViewById(R.id.tv_address);
        TextView WorkTime = convertView.findViewById(R.id.tv_workTime);
        TextView Rating = convertView.findViewById(R.id.tv_rating);
        ImageView Image = convertView.findViewById(R.id.im_company);


        NameCompany.setText(nameCompany[position]);
        Address.setText(address[position]);
        WorkTime.setText(workTime[position]);
        Rating.setText(rating[position]);
        Image.setImageResource(image[position]);

        return convertView;
    }
}
