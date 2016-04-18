package com.example.blazhkoserghii.SBlazhkoApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Blazhko Serghii on 15.10.2015.
 */
public class Homework_1 extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btBye;
    Button btHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_1);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btHello = (Button) findViewById(R.id.btnHello);
        btBye = (Button) findViewById(R.id.btnBye);

        btHello.setOnClickListener(this);
        btBye.setOnClickListener(this);

        }
        @Override
        public void onClick (View v){
            switch (v.getId()){
                case R.id.btnHello:
                    tvOut.setText("Hello, my first app !!!! :)");
                    break;
                case R.id.btnBye:
                    tvOut.setText("Bye Bye my first app !!!!! :)");
                    break;
            }
    }
}
