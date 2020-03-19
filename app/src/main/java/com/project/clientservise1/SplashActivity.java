package com.project.clientservise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

//import android.os.Handler;
//import java.util.logging.LogRecord;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));

        finishAffinity();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//
//        new Handler().postDelayed(new Runnable() {                                              //Позволяет выводить окно загрузки какое то время
//            @Override                                                                           //
//            public void run() {                                                                 //
//                Intent i = new Intent(SplashActivity.this, MainActivity.class);   //
//                startActivity(i);                                                               //
//                finish();                                                                       //
//            }                                                                                   //
//        }, 3*500);                                                                    //
//
//    }
}
