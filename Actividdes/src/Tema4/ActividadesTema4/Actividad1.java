package Tema4.ActividadesTema4;

import Prueba.Matematicas;
import Prueba.Persona;

public class Actividad1 {
    public static void main(String[] args) {
        Persona p = new Persona("Adrian", 20);
        p.imprimePersona();

        double a=4;
        double b=5;

        System.out.println(Matematicas.suma(a, b));
    }
    
}
