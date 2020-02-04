package com.project.clientservise1;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


   private Spinner spinner = null;
   private EditText inputSearch;
   private ListButtonAdapter adapter;
   private String[] category = {"Категория услуг", "Сантехник", "Парикмахер", "Мастер маникюра", "Юрист", "Репетитор"};


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] nameCompany = {"Company 1","Company 2", "Company 3", "Company 4", "Company 5"};
        String[] Address = {"Надибаидзе, 30","Комарова, 5","Фокина, 10","ВГУЭС","Калинина, 115"};
        String[] workTime = {"Пн-Пт: 10:00-20:00","Пн-Пт: 10:00-20:00","Пн-Пт: 10:00-20:00",
                "Пн-Пт: 10:00-20:00","Пн-Пт: 10:00-20:00"};
        String[] Rating = {"5.0","4.2","3.1","0.0","2.6"};
        int[] image = {R.drawable.baseline_account_circle_black_48dp, R.drawable.baseline_account_circle_black_48dp,
                R.drawable.baseline_account_circle_black_48dp, R.drawable.baseline_account_circle_black_48dp,
                R.drawable.baseline_account_circle_black_48dp};

        View view = inflater.inflate(R.layout.fragment_home, container, false);        //Вот так реализуется спиннер во фрагментах

        final ListView listView = view.findViewById(R.id.lv_button);
        inputSearch = view.findViewById(R.id.inputSearch);
        ListButtonAdapter adapter = new ListButtonAdapter(getActivity(), nameCompany, Address,workTime,Rating,image);
        listView.setAdapter(adapter);

        listView.postDelayed(new Runnable() {                       //позволяет запустить приложение с самого начала макета
            public void run() {                                     //listView показывается весь и не прокручивается
                Utility.setListViewHeightBasedOnChildren(listView);
            }
        }, 400);

       // Utility.setListViewHeightBasedOnChildren(listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {             //Обработчик нажатия на ListView
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {              //Позволяет сделать нажатие и перейти на новый активити
                Intent intent = new Intent(getActivity(), CompanyViewActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
