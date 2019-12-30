package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        Button btnNext = findViewById(R.id.b_next);
        TextView RegCompany = findViewById(R.id.tv_RegCom);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RegistrationActivity.this, RegistrationClient.class);
                startActivity(intent);
            }
        });

        RegCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RegistrationActivity.this, RegistrationCompany.class);
                startActivity(intent);
            }
        });
    }
}
