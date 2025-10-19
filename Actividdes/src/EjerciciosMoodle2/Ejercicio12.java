package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio12 {

    
    public static int mcd(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;  
        }
        return a;
    }

    public static long mcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        
        int divisor = mcd(a, b);
        return Math.abs((long)a / divisor * b);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Introduce otro número: ");
        int num2 = teclado.nextInt();

        int resultadoMCD = mcd(num1, num2);
        long resultadoMCM = mcm(num1, num2);

        System.out.println("\nPara los números " + num1 + " y " + num2 + ":");
        System.out.println("El Máximo Común Divisor es: " + resultadoMCD);
        System.out.println("El Mínimo Común Múltiplo es: " + resultadoMCM);
        
        teclado.close();
    }
}



