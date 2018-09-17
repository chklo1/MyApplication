package com.example.x556ua.myapplication;

import java.util.ArrayList;

public class Polinomio implements Funcion {


    ArrayList<Double> coef = new ArrayList<Double>();

    public void añadir(double a) {
        this.coef.add(a);
    }

    public double calcular(double x) {
        double res = 0;
        for (int i = 0; i < coef.size(); i++) {

            res =res + coef.get(i) * Math.pow(x, i);

        }
        return res;

    }
}
