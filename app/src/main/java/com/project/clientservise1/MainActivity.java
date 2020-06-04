package com.project.clientservise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.project.clientservise1.Entities.Note;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Note> notes = new ArrayList<>();

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private HomeFragment homeFragment;
    private NoteFragment noteFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //TintIcons.tintImageView((inavp) findViewById(R.id.nav_profile), R.color.icon_state_list);
        //TintIcons.tintImageView((inavn) findViewById(R.id.nav_note), R.color.icon_state_list);
        //TintIcons.tintImageView((inavh) findViewById(R.id.nav_home), R.color.icon_state_list);


        getSupportActionBar().hide();

        mMainFrame = findViewById(R.id.main_frame);
        mMainNav = findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        noteFragment = new NoteFragment();
        profileFragment = new ProfileFragment();

        setFragment(homeFragment);

        mMainNav.setOnNavigationItemSelectedListener(menuItem -> {

            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    setFragment(homeFragment);
                    return true;

                case R.id.nav_note:
                    setFragment(noteFragment);
                    return true;

                case R.id.nav_profile:
                    setFragment(profileFragment);
                    return true;

                default:
                    return false;
            }
        });




        //Spinner spinner = findViewById(R.id.spinnerCategory);
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, category);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }

    public void onClickOpenNotificationSettings(View view) {
        Intent intent = new Intent(view.getContext(), NotificationSettingsActivity.class);
        startActivity(intent);
    }

    public void onClickNoteButton(View view) {
        view.setEnabled(false);
        notes.add(new Note("Запись на услугу 1","Описание услуги 1", "100", "30 минут", "15:10"));
        notes.add(new Note("Запись на услугу 2","Описание услуги 2", "200", "31 минуту", "15:20"));
        notes.add(new Note("Запись на услугу 3","Описание услуги 3", "300", "32 минуты", "15:30"));
        notes.add(new Note("Запись на услугу 4","Описание услуги 4", "400", "33 минуты", "15:40"));
        notes.add(new Note("Запись на услугу 5","Описание услуги 5", "500", "34 минуты", "15:50"));
        notes.add(new Note("Запись на услугу 6","Описание услуги 6", "600", "35 минут", "16:00"));
        notes.add(new Note("Запись на услугу 7","Описание услуги 7", "700", "36 минут", "16:10"));
        notes.add(new Note("Запись на услугу 8","Описание услуги 8", "800", "37 минут", "16:20"));
    }

    //public void onClickOpenNotificationSettings(View view) {
    //    Intent intent = new Intent(view.getContext(), NotificationSettingsActivity.class);
    //    startActivity(intent);
    //}
}