package com.example.nick.myfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Loginn extends AppCompatActivity implements View.OnClickListener{
   Button bLoginn;
    EditText etUsername,etPassword;
    TextView tvRegisterlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginn);

        etUsername=(EditText) findViewById(R.id.etUsername);
        etPassword=(EditText) findViewById(R.id.etPassword);
        bLoginn=(Button) findViewById(R.id.bLoginn);
        tvRegisterlink=(TextView) findViewById(R.id.tvRegisterlink);
        bLoginn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLoginn:
            break;

            case R.id.tvRegisterlink:

                startActivity(new Intent(this,Webpg.class));
                break;
        }
    }
}
