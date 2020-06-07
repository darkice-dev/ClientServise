package com.project.clientservise1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Помощь");

        Button btn_ask_question = findViewById(R.id.btn_ask_question);
        btn_ask_question.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, getString(R.string.supportEmailAddress));
            try {
                startActivity(emailIntent);
            } catch (android.content.ActivityNotFoundException e){
                Toast.makeText(this, "Почтовый клиент не установлен на вашем телефоне :(", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnRecord11 = findViewById(R.id.btn_record11);
        Button btnRecord21 = findViewById(R.id.btn_record21);
        TextView tvRecord1 = findViewById(R.id.tv_record1);


        Button btnRecord12 = findViewById(R.id.btn_record12);
        Button btnRecord22 = findViewById(R.id.btn_record22);
        TextView tvRecord2 = findViewById(R.id.tv_record2);

        Button btnRecord13 = findViewById(R.id.btn_record13);
        Button btnRecord23 = findViewById(R.id.btn_record23);
        TextView tvRecord3 = findViewById(R.id.tv_record3);

        Button btnRecord14 = findViewById(R.id.btn_record14);
        Button btnRecord24 = findViewById(R.id.btn_record24);
        TextView tvRecord4 = findViewById(R.id.tv_record4);

        Button btnRecord15 = findViewById(R.id.btn_record15);
        Button btnRecord25 = findViewById(R.id.btn_record25);
        TextView tvRecord5 = findViewById(R.id.tv_record5);

        btnRecord11.setOnClickListener(v -> {
            tvRecord1.setVisibility(View.VISIBLE);
            btnRecord21.setVisibility(View.VISIBLE);
            btnRecord11.setVisibility(View.INVISIBLE);
        });

        btnRecord21.setOnClickListener(v -> {
            tvRecord1.setVisibility(View.GONE);
            btnRecord21.setVisibility(View.INVISIBLE);
            btnRecord11.setVisibility(View.VISIBLE);
        });

        btnRecord12.setOnClickListener(v -> {
            tvRecord2.setVisibility(View.VISIBLE);
            btnRecord22.setVisibility(View.VISIBLE);
            btnRecord12.setVisibility(View.INVISIBLE);
        });

        btnRecord22.setOnClickListener(v -> {
            tvRecord2.setVisibility(View.GONE);
            btnRecord22.setVisibility(View.INVISIBLE);
            btnRecord12.setVisibility(View.VISIBLE);
        });

        btnRecord13.setOnClickListener(v -> {
            tvRecord3.setVisibility(View.VISIBLE);
            btnRecord23.setVisibility(View.VISIBLE);
            btnRecord13.setVisibility(View.INVISIBLE);
        });

        btnRecord23.setOnClickListener(v -> {
            tvRecord3.setVisibility(View.GONE);
            btnRecord23.setVisibility(View.INVISIBLE);
            btnRecord13.setVisibility(View.VISIBLE);
        });

        btnRecord14.setOnClickListener(v -> {
            tvRecord4.setVisibility(View.VISIBLE);
            btnRecord24.setVisibility(View.VISIBLE);
            btnRecord14.setVisibility(View.INVISIBLE);
        });

        btnRecord24.setOnClickListener(v -> {
            tvRecord4.setVisibility(View.GONE);
            btnRecord24.setVisibility(View.INVISIBLE);
            btnRecord14.setVisibility(View.VISIBLE);
        });

        btnRecord15.setOnClickListener(v -> {
            tvRecord5.setVisibility(View.VISIBLE);
            btnRecord25.setVisibility(View.VISIBLE);
            btnRecord15.setVisibility(View.INVISIBLE);
        });

        btnRecord25.setOnClickListener(v -> {
            tvRecord5.setVisibility(View.GONE);
            btnRecord25.setVisibility(View.INVISIBLE);
            btnRecord15.setVisibility(View.VISIBLE);
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
