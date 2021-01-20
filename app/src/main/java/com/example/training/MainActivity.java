package com.example.training;


import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvlogin,tvRegistration,tvCreate;
    String ANUSHA;
    Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvlogin=findViewById(R.id.loginTV);
        tvRegistration=findViewById(R.id.RegistrationTV);
        tvCreate=findViewById(R.id.CreateTV);
        utils=new Utils();

        tvlogin.setOnClickListener(v -> {
           clickMethod(tvlogin);
        });


        tvRegistration.setOnClickListener(v -> {
            clickMethod(tvRegistration);
        });

        tvCreate.setOnClickListener(v -> {
           clickMethod(tvCreate);
        });



    }

    public void clickMethod(TextView tv){
        ANUSHA=tv.getText().toString();
        utils.showMessage(MainActivity.this,ANUSHA);

    }

}