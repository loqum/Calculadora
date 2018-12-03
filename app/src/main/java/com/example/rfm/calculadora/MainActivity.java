package com.example.rfm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClear, buttonMultiplicar, buttonDividir, buttonSumar, buttonRestar, buttonNueve,
            buttonOcho, buttonSiete, buttonSeis, buttonCinco, buttonCuatro, buttonTres, buttonDos,
            buttonUno, buttonCero, buttonBorrar, buttonDecimal;
    TextView etiqueta;
    double resultado;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClear = findViewById(R.id.clear);
        buttonMultiplicar = findViewById(R.id.multiplicar);
        buttonDividir = findViewById(R.id.dividir);
        buttonSumar = findViewById(R.id.sumar);
        buttonRestar = findViewById(R.id.restar);
        buttonNueve = findViewById(R.id.nueve);
        buttonOcho = findViewById(R.id.ocho);
        buttonSiete = findViewById(R.id.siete);
        buttonSeis = findViewById(R.id.seis);
        buttonCinco = findViewById(R.id.cinco);
        buttonCuatro = findViewById(R.id.cuatro);
        buttonTres = findViewById(R.id.tres);
        buttonDos = findViewById(R.id.dos);
        buttonUno = findViewById(R.id.uno);
        buttonCero = findViewById(R.id.cero);
        buttonBorrar = findViewById(R.id.borrar);
        buttonDecimal = findViewById(R.id.decimal);

        etiqueta = findViewById(R.id.etiquetaResultado);

        buttonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "9";
                etiqueta.setText(mostrar);
            }
        });

        buttonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "8";
                etiqueta.setText(mostrar);
            }
        });

        buttonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "7";
                etiqueta.setText(mostrar);
            }
        });

        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "6";
                etiqueta.setText(mostrar);
            }
        });

        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "5";
                etiqueta.setText(mostrar);
            }
        });

        buttonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "4";
                etiqueta.setText(mostrar);
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "3";
                etiqueta.setText(mostrar);
            }
        });

        buttonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "2";
                etiqueta.setText(mostrar);
            }
        });

        buttonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "1";
                etiqueta.setText(mostrar);
            }
        });

        buttonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "0";
                etiqueta.setText(mostrar);
            }
        });


    }
}
