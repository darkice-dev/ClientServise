package com.project.clientservise1;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


   private Spinner spinner = null;
   private String[] category = {"Категория услуг", "Сантехник", "Парикмахер", "Мастер маникюра", "Юрист", "Репетитор"};
    private LinearLayout linearLayout;

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
        String[] Address = {"Надибаидзе 30","Комарова 5","Фокина 10","ВГУЭС","Калинина 115"};
        String[] workTime = {"Пн-Пт 10:00-20:00","Пн-Пт 10:00-20:00","Пн-Пт 10:00-20:00",
                "Пн-Пт 10:00-20:00","Пн-Пт 10:00-20:00"};
        String[] Rating = {"5.0","4.2","3.1","0.0","2.6"};
        int[] image = {R.drawable.baseline_account_circle_black_48dp, R.drawable.baseline_account_circle_black_48dp,
                R.drawable.baseline_account_circle_black_48dp, R.drawable.baseline_account_circle_black_48dp,
                R.drawable.baseline_account_circle_black_48dp};

        View view = inflater.inflate(R.layout.fragment_home, container, false);        //Вот так реализуется спиннер во фрагментах

        ListView listView = view.findViewById(R.id.lv_button);
        ListButtonAdapter adapter = new ListButtonAdapter(getActivity(), nameCompany, Address,workTime,Rating,image);
        listView.setAdapter(adapter);
        Utility.setListViewHeightBasedOnChildren(listView);
        createSpinner(view);
        return view;
    }

    private void createSpinner( View view )
    {
        spinner = view.findViewById( R.id.spinnerCategory );
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, category);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
