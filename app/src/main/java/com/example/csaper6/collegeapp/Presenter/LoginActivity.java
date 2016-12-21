package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.csaper6.collegeapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username, password;
    private Button loginButton, forgotPasswordButton, createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        wireWidgets();
        autofill();

    }

    private void autofill() {
        Intent intent = getIntent();
        if ()
        {
            String uName= intent.getStringExtra("username");
            String pWord= intent.getStringExtra("password");
            username.setText(uName);
            password.setText(pWord);
        }
        else
        {
            username.setText("");
            password.setText("");
        }
    }

    private void wireWidgets()
    {
        username = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(this);
        forgotPasswordButton = (Button) findViewById(R.id.forgot);
        forgotPasswordButton.setOnClickListener(this);
        createAccountButton = (Button) findViewById(R.id.create_account);
        createAccountButton.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (view.getId() == loginButton.getId())
        {
            if (username.getText().length() <= 0)
            {
                Toast.makeText(LoginActivity.this, "Please enter your username.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if (password.getText().length() <= 0)
                {
                    Toast.makeText(LoginActivity.this, "Please enter your password.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        }
        else if (view.getId() == forgotPasswordButton.getId())
        {
            Toast.makeText(LoginActivity.this, "This will be fixed soon.", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == createAccountButton.getId())
        {
            Intent intent = new Intent(LoginActivity.this,AccountCreateActivity.class);
            startActivity(intent);


        }
        else
        {

        }
    }
}
