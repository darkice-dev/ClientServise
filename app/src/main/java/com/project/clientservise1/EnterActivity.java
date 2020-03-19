package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

        getSupportActionBar().hide();

        Button btnEnter = findViewById(R.id.btn_enter);
        TextView help = findViewById(R.id.tv_btn_help);
        TextView Reg = findViewById(R.id.Registration);

        btnEnter.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(EnterActivity.this, MainActivity.class);
            startActivity(intent);
        });

        help.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(EnterActivity.this, HelpActivity.class);
            startActivity(intent);
        });

        Reg.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(EnterActivity.this, RegistrationActivity.class);
            startActivity(intent);
        });

    }
}
