package com.example.x556ua.myapplication;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    ArrayList<Telefono> telefonos;

    public Persona(String nombre, String apellido) {

        this.nombre= nombre;
        this.apellido= apellido;
        this.telefonos = new ArrayList<Telefono>();

    }

    public void anyadir(String tipo, int numero) {
        telefonos.add(new Telefono(tipo, numero));
    }

    public void anyadir(Telefono t) {
        telefonos.add(t);
    }

    public static Persona buscar (ArrayList<Persona> personas,String nombre){

        for (int i=0;i<personas.size();i++){
            if(nombre.equals(personas.get(i).nombre)){
                return personas.get(i);
            }

        }
        return null;

    }

    public void mostrarTelefonos(){
        for (int i=0;i<telefonos.size();i++) {
            telefonos.get(i).mostrar();
        }


    }


}


