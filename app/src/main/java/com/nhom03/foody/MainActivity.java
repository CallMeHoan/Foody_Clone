package com.nhom03.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView signup_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_page);
        signup_txt =  (TextView) findViewById(R.id.signup_tv);

        signup_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_page = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(login_page);
            }
        });
    }
}
