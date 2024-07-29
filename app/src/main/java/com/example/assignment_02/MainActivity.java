package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText  login_text , password_text ;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_text = (EditText) findViewById(R.id.login);
        password_text = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.buttonlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = login_text.getText().toString();
                String password = password_text.getText().toString();

                if (username.equals("user") && password.equals("1234")){
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL :)",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"INVALID CREDENTIALS :(",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}