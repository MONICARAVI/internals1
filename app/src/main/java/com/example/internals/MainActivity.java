package com.example.internals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText editText,ed2,ed3,ed4;
    Button button;
    TextView textView,tv5,tv6,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        ed2=findViewById(R.id.editText2);
        ed4=findViewById(R.id.editText4);
        ed3=findViewById(R.id.editText3);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        tv6=findViewById(R.id.textView3);
        tv5=findViewById(R.id.textView5);
        tv3=findViewById(R.id.textView6);

    }

    public void xy(View view) {
        int x=Integer.parseInt(editText.getText().toString());
        int y=Integer.parseInt(ed3.getText().toString());
        int x1=Integer.parseInt(ed2.getText().toString());
        int y1=Integer.parseInt(ed4.getText().toString());

        if (!(x>50||x1>50||y>50||y1>50))  {
            float z= (float) (((x*0.7)+(x1*0.3))/2);//70 percent of CAT mark and 30 percent of ASSIGNMENT mark
            float z1= (float) (((y*0.7)+(y1*0.3))/2);
            float m=(z+z1);
            Intent a=new Intent(MainActivity.this,Main2Activity.class);
            a.putExtra("mark",m);
            startActivity(a);
        }
        else {
            Toast.makeText(MainActivity.this,
                    "Enter mark out of 50", Toast.LENGTH_LONG).show();
        }

    }
}
