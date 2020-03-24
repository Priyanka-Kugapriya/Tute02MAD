package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cal;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater li = getLayoutInflater();


        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);


        toast.show();


        cal = (Button) findViewById(R.id.button);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFirstActivity();
            }
        });

    }


    public void openFirstActivity(){

        Intent nwintent = new Intent(this, FirstActivity.class);
        startActivity(nwintent);
    }
}
