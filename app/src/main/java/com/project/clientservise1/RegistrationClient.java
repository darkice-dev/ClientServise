package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationClient extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_client);

        Button endReg = findViewById(R.id.b_reg);
        EditText Password = findViewById(R.id.PasswordClient);
        final TextView HelpPass = findViewById(R.id.HelpMassage);

        endReg.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(RegistrationClient.this, MainActivity.class);
            startActivity(intent);
        });

        Password.setOnTouchListener((v, event) -> {
            if(event.getAction() == MotionEvent.ACTION_DOWN) {
                HelpPass.setText("Ваш пароль должен содержать не менее 8 символов,среди "+
                        "которых должны быть буквы(a-z) и цифры(0-9)");
            }
            return false;
        });
    }
}
