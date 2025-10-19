package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int numero;

        System.out.println("Introduce números enteros. Pon 0 para finalizar.");

        System.out.print("Introduce un número: ");
        numero = teclado.nextInt(); 

        while (numero != 0) {
            if (numero > 0) {
                positivos++;
            } else { 
                negativos++;
            }

            System.out.print("Introduce otro número o 0 para finalizar: ");
            numero = teclado.nextInt(); 
        }

        System.out.println("Has introducido " + positivos + " números positivos.");
        System.out.println("Has introducido " + negativos + " números negativos.");
        
        teclado.close();
    }
}

