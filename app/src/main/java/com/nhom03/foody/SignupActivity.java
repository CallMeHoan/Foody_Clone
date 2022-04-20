package com.nhom03.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    TextView signin_txt;
    TextView signup_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);
        signin_txt = (TextView) findViewById(R.id.signin_tv);
        signup_txt =  (TextView) findViewById(R.id.signup_tv);

        signin_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup_page = new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(signup_page);
            }
        });
    }
}