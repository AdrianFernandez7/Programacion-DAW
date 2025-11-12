package Tema2.ActividadesTema2.ActividadPag16;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args){
        //Leer edades hatsa -1 y entonces sacar el valor maximo y minimo
        int maximo=0,minimo=0,ContadorPersonas=0;
        Scanner teclado= new Scanner(System.in);
        int edad;
        do{
            System.out.println("Escriba una edad o -1 para salir :");
            edad=teclado.nextInt();
            if(edad!=-1) ContadorPersonas++;//Nueva Persona
            //Establezco la lógica de máximo y mínimo
            if(maximo<edad){
                maximo=edad;
            }
            if(minimo>edad !=(edad<1)){
                minimo=edad;
            }
        }while(edad!=-1);
        System.out.println("El máximo es: "+ maximo);
        System.out.println("El mínimo es: "+ minimo);
        System.out.println("El número de personas es: "+ ContadorPersonas);

        teclado.close();


    }
    
}
