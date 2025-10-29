package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--- Menú de Horario ---");
            System.out.println("1-5: Mostrar materias de ese día");
            System.out.println("6: Mostrar horario completo ");
            System.out.println("7: Salir del programa");
            System.out.print("Introduce una opción (1-7): ");
            
            opcion=teclado.nextInt();
            if (opcion<=0 || opcion>=8){
                System.out.println("La opción no es válida");
            }

            switch (opcion) {
                case 1:
                    System.out.println("\nLUNES: Programación, Bases de Datos.");
                    break;
                case 2:
                    System.out.println("\nMARTES: Sistemas Informáticos, Lenguaje de Marcas.");
                    break;
                case 3:
                    System.out.println("\nMIÉRCOLES: Programación, Sistemas Informáticos.");
                    break;
                case 4:
                    System.out.println("\nJUEVES: Bases de Datos, Entornos de Desarrollo.");
                    break;
                case 5:
                    System.out.println("\nVIERNES: Programación, Formación y Orientación Laboral.");
                    break;
                case 6:
                    System.out.println("\n--- HORARIO COMPLETO ---");
                    System.out.printf("%-10s %-25s\n", "DÍA", "MATERIAS");
                    System.out.printf("%-10s %-25s\n", "---", "----------");
                    System.out.printf("%-10s %-25s\n", "Lunes", "Programación, Bases de Datos");
                    System.out.printf("%-10s %-25s\n", "Martes", "Sistemas Informáticos, L. Marcas");
                    System.out.printf("%-10s %-25s\n", "Miérc.", "Programación, Sistemas Informáticos");
                    System.out.printf("%-10s %-25s\n", "Jueves", "Bases de Datos, E. Desarrollo");
                    System.out.printf("%-10s %-25s\n", "Viernes", "Programación, F.O.L.");
                    break;
                case 7:
                    System.out.println("Saliste del programa");
                    break;
            }
        } while (opcion != 7);
        
        teclado.close();
    }
}

