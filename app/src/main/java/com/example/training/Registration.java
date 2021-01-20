package com.example.training;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
EditText etusername,etpassword,etemailid,etcontact;
Button btnsubmit;
String USERNAME,PASSWORD,EMAILID,CONTACT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        etusername=findViewById(R.id.usernameET);
        etpassword=findViewById(R.id.passwordET);
        etemailid=findViewById(R.id.emailidET);
        etcontact=findViewById(R.id.contactET);
        btnsubmit=findViewById(R.id.submitBTN);

        btnsubmit.setOnClickListener(v -> {
            USERNAME=etusername.getText().toString();
            PASSWORD=etpassword.getText().toString();
            CONTACT=etcontact.getText().toString();
            EMAILID=etemailid.getText().toString();

            Log.i("data", USERNAME+""+PASSWORD+""+CONTACT+""+EMAILID);
            Toast.makeText(Registration.this,USERNAME+""+PASSWORD+""+CONTACT+""+EMAILID , Toast.LENGTH_SHORT).show();

        });
    }
}