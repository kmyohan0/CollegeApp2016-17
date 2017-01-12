package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
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
        if (intent.hasExtra("username") && intent.hasExtra("password"))
        {
            String uName= intent.getStringExtra("username");
            String pWord= intent.getStringExtra("password");
            username.setText("" + uName);
            password.setText("" + pWord);
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
        Backendless.initApp(this, "B05B93CB-EC32-EBF4-FF3B-F3C846352400", "BAF47B3E-D747-5D1F-FF82-0A6A82332500" , "v1");
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
                  Backendless.UserService.login(username.getText().toString(), password.getText().toString(), CreateRegCallback());

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

    private AsyncCallback<BackendlessUser>CreateRegCallback() {
    return new AsyncCallback<BackendlessUser>() {
        @Override
        public void handleResponse(BackendlessUser response) {
            Toast.makeText(LoginActivity.this, "LOGIN SUCCESS!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void handleFault(BackendlessFault fault) {
            Toast.makeText(LoginActivity.this,"" + fault.getMessage() , Toast.LENGTH_SHORT).show();
        }
    };
    }


}
