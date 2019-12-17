package com.project.clientservise1;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }

    private Button btn_enter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

             // ваша кнопка
        btn_enter = view.findViewById(R.id.btn_enter);
            //создаем листенер
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //обработка нажатия
                Intent intent = new Intent(getActivity(), EnterActivity.class);
                startActivity(intent);
            }
        };
            //привязываем листенер к кнопке
        btn_enter.setOnClickListener(oclBtnOk);

        return view;
    }
}
