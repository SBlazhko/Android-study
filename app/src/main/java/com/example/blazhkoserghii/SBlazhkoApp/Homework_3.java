package com.example.blazhkoserghii.SBlazhkoApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Blazhko Serghii on 15.10.2015.
 */
public class Homework_3 extends AppCompatActivity implements View.OnClickListener{

    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu",
            "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android",
            "iPhone", "WindowsMobile" };
    private ArrayList<String> list = new ArrayList<String>(Arrays.asList(values));
    Button bt1,bt2,bt3,bt4;
    TextView text_1,text_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_3);
        bt1 = (Button) findViewById(R.id.Bt1);
        bt2 = (Button) findViewById(R.id.Bt2);
        bt3 = (Button) findViewById(R.id.Bt3);
        bt4 = (Button) findViewById(R.id.Bt4);
        text_1 = (TextView) findViewById(R.id.text_1);
        text_2 = (TextView) findViewById(R.id.text_2);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

        String original = TextUtils.join(", ", list);
        text_1.setText(original);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Bt1:
                showArrReverse();
                break;
            case R.id.Bt2:
                removeEveryThird();
                break;
            case  R.id.Bt3:
                removeDuplicates();
                break;
            case R.id.Bt4:
                sortByABC();
                break;
        }
    }
    public void showArrReverse(){
        Collections.reverse(list);
        String reverse = TextUtils.join(", ", list);

        text_2.setText(reverse);
    }

    public void removeEveryThird(){
        ArrayList<String> listRm = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            listRm.add(list.get(i));
        }
        for (int i = 2; i < listRm.size(); i+=2) {
            listRm.remove(i);
        }
        String removeEveryThird = TextUtils.join(", ", listRm);

        text_2.setText(removeEveryThird);
    }

    public void removeDuplicates(){
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        String removeDuplicates = TextUtils.join(", ", set);

        text_2.setText(removeDuplicates);
    }

    public void sortByABC(){
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        String sortByABC = TextUtils.join(", ", list);

        text_2.setText(sortByABC);
    }
}
