package com.example.internals;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity  {
    TextView textView,textView4,textView13;
    String str;
    Float s,m;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView7);
        textView13=findViewById(R.id.textView13);
        Intent intent=getIntent();
        s=intent.getFloatExtra("mark",0);

        textView4.setText(String.valueOf(s));
    }
}