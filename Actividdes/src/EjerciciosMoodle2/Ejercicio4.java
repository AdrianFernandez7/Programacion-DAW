package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la nota del primer exámen: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Introduce la nota del segundo exámen: ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1 + nota2) / 2.0;
        double notaFinal = media;

        if (media >= 5.0) {
            System.out.printf("\nFelicidades has aprobado. Tu nota es: %.2f\n", notaFinal);
        } else { 
            System.out.printf("Tu media inicial es %.2f. Tienes que hacer la recuperación.\n", media);
            
            teclado.nextLine(); 

            System.out.print("Introduce si estas apto o no (apto/no apto): ");
            String recuperacion = teclado.nextLine().trim().toLowerCase(); 
            
            if (recuperacion.equals("apto")) {
                notaFinal = 5.0; 
                System.out.printf("Tu nota es: %.2f\n", notaFinal);
            } else {
                System.out.printf("Tu nota se mantiene en: %.2f\n", notaFinal);
            }
        }
        
        teclado.close();
    }
}

