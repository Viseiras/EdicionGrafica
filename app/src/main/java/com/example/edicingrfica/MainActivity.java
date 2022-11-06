package com.example.edicingrfica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String operacion="";
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnDel;
    private Button btnSuma;
    private Button btnDiv;
    private Button btnMulti;
    private Button btnComa;
    private Button btnIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnDel=findViewById(R.id.btnDel);
        btnSuma=findViewById(R.id.btnSuma);
        btnDiv=findViewById(R.id.btnDiv);
        btnMulti=findViewById(R.id.btnMulti);
        btnComa=findViewById(R.id.btnComa);
        btnIgual=findViewById(R.id.btnIgual);

        TextView txtResult = findViewById(R.id.Visualizer);

        btn1.setOnClickListener(v->{

        });
    }
}