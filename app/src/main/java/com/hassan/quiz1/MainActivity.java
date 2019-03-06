package com.hassan.quiz1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
ImageView imageView,imageView2;
RadioGroup radioGroup;
Spinner spinner;
RadioButton radioButton,r1,r2,r3,r4,r5;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.radioButton1);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        r4=findViewById(R.id.radioButton4);
        r5=findViewById(R.id.radioButton5);
        spinner=findViewById(R.id.spinner3);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        radioGroup=findViewById(R.id.rg);
        textView=findViewById(R.id.textView3);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton=findViewById(i);

                if(radioButton.getText().equals("Pakistan"))
                {
                    imageView.setImageResource(R.mipmap.pakistan);
                }
                if(radioButton.getText().equals("India"))
                {
                    imageView.setImageResource(R.mipmap.india);
                }
                if(radioButton.getText().equals("USA"))
                {
                    imageView.setImageResource(R.mipmap.usa);
                }
                if(radioButton.getText().equals("UAE"))
                {
                    imageView.setImageResource(R.mipmap.uae);
                }
                if(radioButton.getText().equals("Canada"))
                {
                    imageView.setImageResource(R.mipmap.canada);
                }


            }
        });
        spinner.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id)
    {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        if(pos==0)
        {
            imageView.setImageResource(R.mipmap.python);
        }
        else if(pos==1)
        {
            imageView.setImageResource(R.mipmap.java);
        }
        else if(pos==2)
        {
            imageView.setImageResource(R.mipmap.cplus);
        }
       else  if(pos==3)
        {
            imageView.setImageResource(R.mipmap.android);
        }

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
