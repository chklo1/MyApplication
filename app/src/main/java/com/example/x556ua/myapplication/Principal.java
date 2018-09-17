package com.example.x556ua.myapplication;

import java.util.ArrayList;

public class Principal {
    public static void main(String arg[]) {

        //Funcion f = new Seno();
        //System.out.println(f.calcular(x:1.0));

   /* ArrayList <Funcion> fun = new ArrayList <Funcion> ();
    fun.add(new Seno());
    fun.add(new Logaritmo());
    for (int i=0; i < fun.size();i++){
    Funcion f = fun.get(i);
    System.out.println(f.calcular(x:1.0))
        }
   */

        //---------------------------------------------------------

       /* Polinomio p1 = new Polinomio();
        p1.añadir(3);
        p1.añadir(2);
        double y = p1.calcular(2);
        System.out.println(y);

*/



//---------------------------------------------------------------------------

    Persona yo = new Persona ("christopher", "kloft");
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(yo);

    Telefono telefono = new Telefono ("Movil", 659865754);
    yo.anyadir(telefono);
    yo.anyadir(new Telefono("Trabajo", 653256857));

    Persona p = Persona.buscar(personas, "christopher");
    p.mostrarTelefonos();

    }


























}
