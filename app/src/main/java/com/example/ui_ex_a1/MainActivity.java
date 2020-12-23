package com.example.ui_ex_a1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText username_ET = findViewById(R.id.username_ET);
        EditText password_ET = findViewById(R.id.password_ET);
        Button go_btn = findViewById(R.id.go_btn);
        TextView sign_up_TV = findViewById(R.id.sign_up_TV);

        sign_up_TV.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), SignUp.class);
            startActivity(i);
        });
    }
}