package Tema2.EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el número de términos de Fibonacci : ");
        int n = teclado.nextInt();
        
        int a = 0;
        int b = 1;

        if (n >= 1) {
            System.out.print("\nSerie de Fibonacci: 0"); 
        }
        
        if (n >= 2) {
            System.out.print(", 1"); 
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b; 
            System.out.print(", " + c);
            
            a = b;
            b = c;
        }
        
        System.out.println(); 
        teclado.close();
    }
}

