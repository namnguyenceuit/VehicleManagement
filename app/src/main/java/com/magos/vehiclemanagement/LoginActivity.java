package com.magos.vehiclemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText editText_username;
    EditText editText_password;
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitialView();
    }

    public void InitialView(){
        editText_username = findViewById(R.id.edt_username);
        editText_password = findViewById(R.id.edt_password);
        button_login = findViewById(R.id.btn_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin();
            }
        });
    }

    private void doLogin() {
        //String username = editText_username.getText().toString();
        //String password = editText_password.getText().toString();
        Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(loginIntent);
    }

}
