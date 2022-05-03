package com.doubleclick.ecommerce.ui.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.doubleclick.ecommerce.Home;
import com.doubleclick.ecommerce.R;


public class RegisterActiviy extends AppCompatActivity {

    EditText name, email, password;
    Button CreateEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        CreateEmail = findViewById(R.id.CreateEmail);
        CreateEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Check()) {
                    if (email.getText().toString().equals("yasser123@gmail.com") && password.getText().toString().equals("12345678")) {
                        startActivity(new Intent(RegisterActiviy.this, LoginActivity.class));
                    }
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
