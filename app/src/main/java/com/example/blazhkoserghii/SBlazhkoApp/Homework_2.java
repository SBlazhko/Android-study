package com.example.blazhkoserghii.SBlazhkoApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

/**
 * Created by Blazhko Serghii on 15.10.2015.
 */
public class Homework_2 extends AppCompatActivity implements View.OnClickListener {
    TextView tvOutTop;
    EditText editNumbTop;
    Button btTop;
    Button btBottom;
   // private static String factorial = null;
    //private static String fibonachi = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_2);

        tvOutTop = (TextView) findViewById(R.id.tvTop);
        editNumbTop = (EditText) findViewById(R.id.editNumbTop);
        btTop = (Button) findViewById(R.id.btnTop);
        btBottom = (Button) findViewById(R.id.btnBottom);

        btTop.setOnClickListener(this);
        btBottom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTop:
                tvOutTop.setText(factorial(editNumbTop.getText().toString()));
                break;
            case R.id.btnBottom:
                tvOutTop.setText(fibonachi(editNumbTop.getText().toString()));
        }
    }

    public static String factorial(String fac){
        int n = Integer.parseInt(fac);
            BigInteger rez = BigInteger.ONE;
            for (int i = 1; i <= n; ++i) {
                rez = rez.multiply(BigInteger.valueOf(i));
            }
            return fac = rez.toString();
        }

    public static String fibonachi(String fib){
        int n = Integer.parseInt(fib);
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, rez = BigInteger.ZERO;
        for (int i = 2; i <= n; i++) {
            rez = a.add(b);
            a = b;
            b = rez;
        }
        return fib = rez.toString();
    }

}
