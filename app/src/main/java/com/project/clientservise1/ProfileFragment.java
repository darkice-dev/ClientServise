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
    private Button btnHelp;
    private Button btnSettings;
    private Button btnAbout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // ваша кнопка
        btnEnter = view.findViewById(R.id.btn_enter);
        btnRegistration = view.findViewById(R.id.btn_registration);
        btnHelp = view.findViewById(R.id.btn_help);
        btnSettings = view.findViewById(R.id.btn_settings);
        btnAbout = view.findViewById(R.id.btn_about);
        //HelpFragment fragmentHelp = new HelpFragment();

        //создаем листенер
        View.OnClickListener onClickBtnOk = v -> {
            Intent intent = new Intent(getActivity(), EnterActivity.class);
            startActivity(intent);
        };

        View.OnClickListener onClickBtnHelp = v -> {
            Intent intent = new Intent(getActivity(), HelpActivity.class);
            startActivity(intent);
        };

        View.OnClickListener onClickBtnReg = v -> {
            Intent intent = new Intent(getActivity(), RegistrationActivity.class);
            startActivity(intent);
        };

        View.OnClickListener onClickBtnAbout = v -> {
            Intent intent = new Intent(getActivity(), AboutActivity.class);
            startActivity(intent);
        };

        view.findViewById(R.id.debug_btn_edit_profile).setOnClickListener(e -> {
            startActivity(new Intent(getActivity(), EditProfileActivity.class));
        });

        //привязываем листенер к кнопке
        btnEnter.setOnClickListener(onClickBtnOk);
        btnRegistration.setOnClickListener(onClickBtnReg);
        btnHelp.setOnClickListener(onClickBtnHelp);
//        btnSettings.setOnClickListener(l -> {
//
//        });
        btnAbout.setOnClickListener(onClickBtnAbout);

        return view;
    }
}
