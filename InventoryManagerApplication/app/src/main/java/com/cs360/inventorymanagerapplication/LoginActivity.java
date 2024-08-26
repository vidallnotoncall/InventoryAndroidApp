package com.cs360.inventorymanagerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView userName = (TextView) findViewById(R.id.username);
        TextView passWord = (TextView) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.login);

        LoginHandler loginHandler = new LoginHandler();

        passWord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 12){
                    loginButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName != null){
                    loginHandler.checkLoginCredentials(userName.getText().toString(), passWord.getText().toString());
                }
                if (loginHandler.getLoginTrueorFalse()){

                }
            }
        });
    }
}