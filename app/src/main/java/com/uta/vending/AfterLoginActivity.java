package com.uta.vending;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AfterLoginActivity extends AppCompatActivity
{

    Button btnLogout;
    Button btnviewprofile;
    Button btnsearchvehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        btnsearchvehicle=findViewById(R.id.SearchVehicle);
        btnsearchvehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent svscreen = new Intent(AfterLoginActivity.this, SearchVehicle.class);
                startActivity(svscreen);
            }
        });


        btnviewprofile=findViewById(R.id.ViewProfile);
        btnviewprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vpscreen = new Intent(AfterLoginActivity.this, ViewProfile.class);
                startActivity(vpscreen);
            }
        });

        btnLogout = findViewById(R.id.LogoutButton);
        btnLogout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(AfterLoginActivity.this, "LOGOUT Successful!", Toast.LENGTH_SHORT).show();
                Intent backToLogin = new Intent(AfterLoginActivity.this, MainActivity.class);
                startActivity(backToLogin);
            }
        });

    }
}
