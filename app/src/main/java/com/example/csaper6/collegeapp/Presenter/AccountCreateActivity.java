package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.csaper6.collegeapp.R;

public class AccountCreateActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button register;
    private EditText firstNameRegister, lastNameRegister, emailRegister, passwordRegister, passwordConfirmRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_create);
        wireWidget();
    }

    private void wireWidget() {
        register = (Button) findViewById(R.id.register);
        register.setOnClickListener(this);
        firstNameRegister = (EditText) findViewById(R.id.register_first_name);
        lastNameRegister = (EditText) findViewById(R.id.register_last_name);
        emailRegister = (EditText) findViewById(R.id.register_email);
        passwordRegister = (EditText) findViewById(R.id.register_password);
        passwordConfirmRegister = (EditText) findViewById(R.id.register_password_confirm);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == register.getId())
        {
            if (firstNameRegister.getText().toString().length() <= 1)
            {
                Toast.makeText(AccountCreateActivity.this, "Please type a valid name.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if (lastNameRegister.getText().toString().length() <= 1)
                {
                    Toast.makeText(AccountCreateActivity.this, "Please type a valid last name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (emailRegister.getText().toString().length() <= 1)
                    {
                        Toast.makeText(AccountCreateActivity.this, "Please type a valid email.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if (passwordRegister.getText().toString().equals(passwordConfirmRegister.getText().toString()))
                        {
                            Toast.makeText(AccountCreateActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                            Thread timerThread = new Thread(){
                                public void run(){
                                    try{
                                        sleep(2000);
                                    }
                                    catch(InterruptedException e){
                                        e.printStackTrace();
                                    }
                                    finally{
                                        Intent intent = new Intent(AccountCreateActivity.this,LoginActivity.class);
                                        intent.putExtra("username", emailRegister.getText().toString());
                                        intent.putExtra("password", passwordRegister.getText().toString());
                                        startActivity(intent);
                                        finish();
                                    }

                                }
                            };
                            timerThread.start();
                        }
                        else
                        {
                            Toast.makeText(AccountCreateActivity.this, "Please check if your password and your password confirmation is same password.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }

    }
}
