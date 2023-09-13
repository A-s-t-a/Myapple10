package com.example.myapple10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class Despuescali extends AppCompatActivity {

    private ToggleButton tb1;
    EditText mte;
    private RadioButton rb1, rb2;
    private ProgressBar pb;
    private Button  btn13,btn15;
    private ImageButton btn18;
    private RatingBar be;
    int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despuescali);
        mte = (EditText) findViewById(R.id.mte);
        tb1 = (ToggleButton) findViewById(R.id.tb1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        btn13 = (Button) findViewById(R.id.btn13);
        btn15 = (Button) findViewById(R.id.btn15);
        btn18 = (ImageButton) findViewById(R.id.btn18);
        pb = (ProgressBar) findViewById(R.id.pb);
        be = (RatingBar) findViewById(R.id.be);

        cambiaEstado();
        comprobarrb1();
        comprobarrb2();
        mostrarT();
    }

    public void mostrarT(){
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mte.getText().toString().isEmpty()){
                    Toast.makeText(Despuescali.this, "El comentario está vacío!!", Toast.LENGTH_SHORT).show();
                }else{
                    String comentarioo = mte.getText().toString();
                    Toast.makeText(Despuescali.this, "Su opinión se guardó con éxito!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void comprobarrb1(){
        rb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String tipo = rb1.getText().toString();
                Toast.makeText(Despuescali.this, "Seleccionó: "+tipo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void comprobarrb2(){
        rb2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String tipo = rb2.getText().toString();
                Toast.makeText(Despuescali.this, "Seleccionó: "+tipo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void cargabarra(View view) {
        final Timer t = new Timer();
        TimerTask tk = new TimerTask() {
            @Override
            public void run() {
                contador++;
                pb.setProgress(contador);
                if(contador == 100)
                    t.cancel();
            }
        };
        t.schedule(tk, 0, 100);

    };


    public void cambiaEstado(){

        tb1.setTextOff("Controles desactivados");
        tb1.setTextOn("Controles activados");

        tb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (tb1.isChecked()){
                    mte.setEnabled(true);
                    btn15.setEnabled(true);
                }else {
                    mte.setEnabled(false);
                    btn15.setEnabled(false);
                }
            }
        });
    }

    public void antescali(View v){
        Toast.makeText(Despuescali.this, "Usted a calificado con: "+ be.getRating()+" estrellas", Toast.LENGTH_SHORT).show();
        Intent siggg = new Intent(this, Despueslogin.class);
        startActivity(siggg);
    }
}