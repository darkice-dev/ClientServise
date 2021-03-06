package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", false)) {
            this.setTheme(R.style.AppThemeDark);
        } else {
            this.setTheme(R.style.AppTheme);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().hide();


        Button btnNext = findViewById(R.id.b_next);
        TextView RegCompany = findViewById(R.id.tv_RegCom);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(RegistrationActivity.this, RegistrationClient.class);
            startActivity(intent);
        });

        RegCompany.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(RegistrationActivity.this, RegistrationCompany.class);
            startActivity(intent);
        });
    }
}
