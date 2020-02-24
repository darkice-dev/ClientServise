package com.project.clientservise1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CompanyViewActivity extends AppCompatActivity {

    String[] service = {"Услуга 1", "Услуга 2", "Услуга 3", "Услуга 4", "Услуга 5"};
    String[] price = {"1500 р.", "1200 р.", "1450 р.", "500 р.", "780 р,"};
    String[] timeWork = {"2 часа", "1,5 часа", "1 час", "20 мин.", "30 мин."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_view);

        final ListView listView = findViewById(R.id.lv_service);
        ListServiceAdapter adapter = new ListServiceAdapter(this, service, price, timeWork);
        listView.setAdapter(adapter);

        //позволяет запустить приложение с самого начала макета
        listView.postDelayed(() -> {
            //listView показывается весь и не прокручивается
            Utility.setListViewHeightBasedOnChildren(listView);
        }, 400);
    }
}
