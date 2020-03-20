package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class EditProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getSupportActionBar().hide();

        findViewById(R.id.flBtnSaveProfile).setOnClickListener(e -> {
            onBackPressed();
        });

        findViewById(R.id.btn_change_avatar).setOnClickListener(e -> {
            Toast.makeText(this, "Тут можно будет изменить аватарку", Toast.LENGTH_SHORT).show();
        });
    }
}
