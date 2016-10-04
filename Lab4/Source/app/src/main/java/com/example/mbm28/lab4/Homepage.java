package com.example.nick.myfinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Webpg extends AppCompatActivity implements View.OnClickListener{
    Button etWebpg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpg);
        etWebpg=(Button) findViewById(R.id.etWebpg);
        etWebpg.setOnClickListener(this);
    }
    public void Browser1(View View){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.kh"));
        startActivity(browserIntent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.etWebpg:
                break;
        }
    }
}
