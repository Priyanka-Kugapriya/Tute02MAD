package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button add, sub, mult, div;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent2 = getIntent();
        final String num1 = intent2.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        final String num2 = intent2.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        TextView text3 =findViewById(R.id.input1);
        text3.setText(num1);

        TextView text4 =findViewById(R.id.input2);
        text4.setText(num2);


        add = (Button) findViewById(R.id.plusbtn);
        sub = (Button) findViewById(R.id.minusbtn);
        mult = (Button) findViewById(R.id.multibtn);
        div = (Button) findViewById(R.id.divbtn);
        ans = (TextView) findViewById(R.id.ans);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int answ  = Integer.parseInt(num1) + Integer.parseInt(num2);
                String n = String.valueOf(answ);

                ans.setText(n);

            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int answ  = Integer.parseInt(num1) - Integer.parseInt(num2);
                String n = String.valueOf(answ);

                ans.setText(n);

            }
        });


        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int answ  = Integer.parseInt(num1) * Integer.parseInt(num2);
                String n = String.valueOf(answ);

                ans.setText(n);

            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int answ  = Integer.parseInt(num1) / Integer.parseInt(num2);
                String n = String.valueOf(answ);

                ans.setText(n);

            }
        });




    }
}
