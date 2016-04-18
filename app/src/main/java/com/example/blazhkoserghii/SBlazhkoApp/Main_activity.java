package com.example.blazhkoserghii.SBlazhkoApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_activity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button homework_1,homework_2,homework_3,homework_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        tvOut = (TextView) findViewById(R.id.tvOut);
        homework_1 = (Button) findViewById(R.id.homework_1);
        homework_1.setOnClickListener(this);
        homework_2 = (Button) findViewById(R.id.homework_2);
        homework_2.setOnClickListener(this);
        homework_3 = (Button) findViewById(R.id.homework_3);
        homework_3.setOnClickListener(this);
        homework_5 = (Button) findViewById(R.id.homework_5);
        homework_5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.homework_1:
                startActivity(new Intent(this,Homework_1.class));
                break;
            case R.id.homework_2:
                startActivity(new Intent(this,Homework_2.class));
                break;
            case R.id.homework_3:
                startActivity(new Intent(this,Homework_3.class));
                break;
            case R.id.homework_5:
                startActivity(new Intent(this,Homework_5.class));
        }
    }
}
