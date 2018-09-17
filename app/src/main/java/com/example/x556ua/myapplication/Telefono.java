package com.example.x556ua.myapplication;

import java.util.ArrayList;

public class Telefono {
    String tipo;
    int numero;


    public Telefono(String tipo, int numero) {

        this.tipo = tipo;
        this.numero = numero;

    }

    public void mostrar (){
        System.out.println(tipo);
        System.out.println(numero);
    }


}

