package ActividadesTema2.ActividadPag17;

import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        int opcion = 0;
        int numero1=0;
        int numero2=0;
     do{
        System.out.println("**** CALCULADORA DAW **** ");
        System.out.println("1-Hacer la suma ");
        System.out.println("2-Hacer la resta ");
        System.out.println("3-Hacer la multiplicacion");
        System.out.println("Introduce una opción o -1 para salir: ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1: System.out.println("Introduzca los números: ");
            numero1=teclado.nextInt();
            numero2=teclado.nextInt();
            System.out.println("La suma es: "+(numero1+numero2));
            break; 
        }
        switch(opcion){
            case 2: System.out.println("Introduzca los números: ");
            numero1=teclado.nextInt();
            numero2=teclado.nextInt();
            System.out.println("La resta es: "+(numero1-numero2));
            break; 
        }
        switch(opcion){
            case 3: System.out.println("Introduzca los números: ");
            numero1=teclado.nextInt();
            numero2=teclado.nextInt();
            System.out.println("La multiplicacion es: "+(numero1*numero2));
            break; 
        }
        
    

     }while(opcion!=-1);
    teclado.close();
    
    }
}
