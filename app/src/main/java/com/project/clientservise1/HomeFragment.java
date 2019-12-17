package com.project.clientservise1;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


   private Spinner spinner = null;
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

        View view = inflater.inflate(R.layout.fragment_home, container, false);        //Вот так реализуется спиннер во фрагментах
        //spinner = view.findViewById( R.id.spinnerCategory );
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
