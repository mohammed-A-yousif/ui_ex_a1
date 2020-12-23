package com.example.ui_ex_a1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        EditText username_ET = findViewById(R.id.username_ET);
        EditText password_ET = findViewById(R.id.password_ET);
        Button go_btn = findViewById(R.id.go_btn);
        TextView sign_in_TV = findViewById(R.id.sign_in_TV);

        sign_in_TV.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });
    }
}