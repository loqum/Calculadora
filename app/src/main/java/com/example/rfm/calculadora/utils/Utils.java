package com.example.rfm.calculadora.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double redondeoDecimales(double resultado, int numeroDecimales) {
        BigDecimal redondeado = new BigDecimal(resultado).setScale(numeroDecimales,
                RoundingMode.HALF_EVEN);

        return redondeado.doubleValue();
    }
}
