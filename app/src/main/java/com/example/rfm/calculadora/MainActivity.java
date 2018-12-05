package com.example.rfm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rfm.calculadora.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";
    private TextView etiqueta;
    private double resultado;
    private String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClear = findViewById(R.id.clear);
        Button buttonMultiplicar = findViewById(R.id.multiplicar);
        Button  buttonDividir = findViewById(R.id.dividir);
        Button buttonSumar = findViewById(R.id.sumar);
        Button buttonRestar = findViewById(R.id.restar);
        Button  buttonNueve = findViewById(R.id.nueve);
        Button  buttonOcho = findViewById(R.id.ocho);
        Button  buttonSiete = findViewById(R.id.siete);
        Button  buttonSeis = findViewById(R.id.seis);
        Button  buttonCinco = findViewById(R.id.cinco);
        Button  buttonCuatro = findViewById(R.id.cuatro);
        Button  buttonTres = findViewById(R.id.tres);
        Button  buttonDos = findViewById(R.id.dos);
        Button  buttonUno = findViewById(R.id.uno);
        Button  buttonCero = findViewById(R.id.cero);
        Button  buttonBorrar = findViewById(R.id.borrar);
        Button  buttonDecimal = findViewById(R.id.decimal);
        Button  buttonResultado = findViewById(R.id.resultado);

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

        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = etiqueta.getText().toString();
                operador = "+";
                etiqueta.setText("");
            }
        });

        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = etiqueta.getText().toString();
                operador = "-";
                etiqueta.setText("");
            }
        });

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = etiqueta.getText().toString();
                operador = "/";
                etiqueta.setText("");
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = etiqueta.getText().toString();
                operador = "*";
                etiqueta.setText("");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                if (!mostrar.contains(".")) {
                    mostrar = mostrar + ".";
                    etiqueta.setText(mostrar);
                }
            }
        });

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                if (!mostrar.equals("")) {
                    mostrar = mostrar.substring(0, mostrar.length() - 1);
                    etiqueta.setText(mostrar);
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "";
                etiqueta.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = etiqueta.getText().toString();
                mostrar = mostrar + "1";

                if (reserva != null) {

                    switch (operador) {

                        case "-":

                            if (!reserva.equals("")) {

                                try {
                                    resultado = Utils.redondeoDecimales(Utils.restar(Double.parseDouble(reserva), Double.parseDouble(etiqueta.getText().toString())), 5);
                                    etiqueta.setText(String.valueOf(resultado));

                                } catch (RuntimeException e) {
                                    Log.e(TAG, "Error: ", e);
                                }

                                break;
                            }

                        case "+":

                            if (!reserva.equals("")) {

                                try {
                                    resultado = Utils.redondeoDecimales(Utils.sumar(Double.parseDouble(reserva), Double.parseDouble(etiqueta.getText().toString())), 5);
                                    etiqueta.setText(String.valueOf(resultado));

                                } catch (RuntimeException e) {
                                    Log.e(TAG, "Error: ", e);
                                }

                                break;
                            }

                        case "*":

                            if (!reserva.equals("")) {

                                try {
                                    resultado = Utils.redondeoDecimales(Utils.multiplicar(Double.parseDouble(reserva), Double.parseDouble(etiqueta.getText().toString())), 5);
                                    etiqueta.setText(String.valueOf(resultado));

                                } catch (RuntimeException e) {
                                    Log.e(TAG, "Error: ", e);
                                }

                                break;
                            }

                        case "/":

                            if (!reserva.equals("")) {

                                try {
                                    resultado = Utils.redondeoDecimales(Utils.dividir(Double.parseDouble(reserva), Double.parseDouble(etiqueta.getText().toString())), 5);
                                    etiqueta.setText(String.valueOf(resultado));

                                } catch (RuntimeException e) {
                                    Log.e(TAG, "Error: ", e);
                                }

                                break;
                            }
                    }

                }
            }
        });
    }
}