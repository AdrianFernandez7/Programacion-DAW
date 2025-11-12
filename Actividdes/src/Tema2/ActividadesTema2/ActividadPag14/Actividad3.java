package Tema2.ActividadesTema2.ActividadPag14;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);                 //Guardar numero introducido
        System.out.println("Introduzca un número");
        int numero1=teclado.nextInt();                          //añadiendo los numeros introducidos por el teclado
         System.out.println("Introduzca un segundo número");
        int numero2=teclado.nextInt();
         System.out.println("Introduzca un tercer número");
        int numero3=teclado.nextInt();
    
                                                        //double sirve para cualquier numero y int solo para los enteros
        double numero2r = Math.pow(numero2,2);        //mas rentable utilizar double
        double resultado=numero2r-4*numero1*numero3;
        double resultado1=0;                            //Aqui añadimos los valores de dentro del else para que la app lo entienda correctamente
        double resultado2=0;

        if (resultado<0){
            System.out.println("No hay soluciones");
        }
        else if (resultado>0) {
            resultado1=-numero2/2*numero1;
            System.out.println("La unica solucion es "+ resultado1);
        
        }
        else {
            resultado1=(-numero2+Math.sqrt(resultado)/2);
            resultado2=(-numero2-Math.sqrt(resultado)/2);
            System.out.println("La primera solucion es "+resultado1+" y el segundo es "+resultado2);
        }

        teclado.close();            //por si acaso siempre cerrar          

        } 
        
        
    }



    

