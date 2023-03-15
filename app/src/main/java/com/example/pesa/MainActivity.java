package com.example.pesa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pesa.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {

    // define the variable
    Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);

        // add the OnClickListener in sender button after clicked this button following Instruction will run
        login.setOnClickListener(v -> {
            // Create the Intent object of this class Context() to Second_activity class
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            // start the Intent
            startActivity(intent);
        });
        signup.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(intent);
        });
}}