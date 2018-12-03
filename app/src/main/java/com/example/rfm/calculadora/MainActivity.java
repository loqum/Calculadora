package com.example.rfm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClear, buttonMultiplicar, buttonDividir, buttonSumar, buttonRestar, buttonNueve,
            buttonOcho, buttonSiete, buttonSeis, buttonCinco, buttonCuatro, buttonTres, buttonDos,
            buttonUno, buttonCero, buttonBorrar, buttonDecimal;
    TextView etiqueta;

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


    }
}
