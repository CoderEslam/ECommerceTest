package com.doubleclick.ecommerce.ui.signin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.doubleclick.ecommerce.Home;
import com.doubleclick.ecommerce.R;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    ProgressBar progressBar;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressBar);
        login = findViewById(R.id.login);

        login.setOnClickListener(view -> {
            progressBar.setVisibility(View.VISIBLE);
            if (Check()) {
                if (email.getText().toString().equals("yasser123@gmail.com") && password.getText().toString().equals("12345678")) {
                    startActivity(new Intent(LoginActivity.this, Home.class));
                    progressBar.setVisibility(View.GONE);
                } else {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(LoginActivity.this, "invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private boolean Check() {
        if (!email.getText().toString().equals("") && !password.getText().toString().equals("")) {
            return true;
        } else {
            email.setError("must insert email");
            password.setError("must insert password");
            return false;
        }
    }


}