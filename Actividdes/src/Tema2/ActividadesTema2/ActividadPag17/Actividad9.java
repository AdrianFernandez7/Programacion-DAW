package Tema2.ActividadesTema2.ActividadPag17;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {

        //Introducir el numero de alumnos
        //     Leer el numero de alumnos
        //         imprimir Suma,media,numero de alumnos y mayores de edad
        //fin_programa

        Scanner teclado=new Scanner(System.in);
        int edad=0;
        int ContadorAlumnos=0;
        int MayoresDeEdad=0;
        int maximo=0;
        int minimo=0;
        int suma=0;
        do{
            System.out.println("Introduzca la edad de tus alumnos");
            edad=teclado.nextInt();
            if(edad>maximo){
                maximo=edad;
            }
            if(edad<minimo && edad!=-1){
                minimo=edad;
            }
            if(edad!=-1){
                minimo=suma;
            }


        }while(edad!=-1);
        System.out.println("El máximo es: "+ maximo);
        System.out.println("El mínimo es: "+ minimo);
        System.out.println("El número de personas es: "+ ContadorAlumnos);
        System.out.println("El numero de mayores de 18: "+MayoresDeEdad);
        System.out.println("Suma de edades: "+suma);
        System.err.println("Media de edades: "+(suma/ContadorAlumnos));

        teclado.close();



        
    }
}
