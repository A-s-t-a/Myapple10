package com.example.myapple10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Despueslogin extends AppCompatActivity {

    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despueslogin);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);

    }

    public void vermasu(View v){
        int img = getResources().getIdentifier("@drawable/esme",null, this.getPackageName());
        iv1.setImageResource(img);
    }
    public void vermasd(View v){
        int img = getResources().getIdentifier("@drawable/torre",null, this.getPackageName());
        iv2.setImageResource(img);
    }
    public void vermast(View v){
        int img = getResources().getIdentifier("@drawable/hamber",null, this.getPackageName());
        iv3.setImageResource(img);
    }
    public void vermasc(View v){
        int img = getResources().getIdentifier("@drawable/boya",null, this.getPackageName());
        iv4.setImageResource(img);
    }
    public void vermasi(View v){
        int img = getResources().getIdentifier("@drawable/mall",null, this.getPackageName());
        iv5.setImageResource(img);
    }















    public void cali(View v){
        Intent sigg = new Intent(this, Despuescali.class);
        startActivity(sigg);
    }


}