package Tema2.ActividadesTema2.ActividadPag14;

import java.util.Scanner;

public class Actividad4 {

    //inicio
    //   Solicitar nota
    //      Leer nota
    //   Indicar calificacion
    //  Fin_Programa
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);                 
        System.out.println("Introduzca su nota");
        double nota=teclado.nextInt();
        
        if(nota>=0 && nota<5){
        System.out.println("SUSPENSO");
        }
        else if (nota==5) {
        System.out.println("APROBADO");
        }
        else if (nota>=6 && nota<=7) {
        System.out.println("BIEN");

        }
        else if (nota<=9 && nota>=8) {
        System.out.println("NOTABLE");
        }
        else if(nota==10) {
        System.out.println("SOBRESALIENTE");

        }
        else  {
        System.out.println("NOTA INCORRECTA");
        }
    
    
        teclado.close();
    
        }
    
    
    }





