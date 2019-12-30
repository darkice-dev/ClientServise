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

    private Button btnEnter;
    private Button btnRegistration;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

             // ваша кнопка
        btnEnter = view.findViewById(R.id.btn_enter);
        btnRegistration = view.findViewById(R.id.btn_registration);

            //создаем листенер
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //обработка нажатия
                Intent intent = new Intent(getActivity(), EnterActivity.class);
                startActivity(intent);
            }
        };
        View.OnClickListener oclBtnReg = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegistrationActivity.class);
                startActivity(intent);
            }
        };
            //привязываем листенер к кнопке
        btnEnter.setOnClickListener(oclBtnOk);
        btnRegistration.setOnClickListener(oclBtnReg);

        return view;
    }
}
