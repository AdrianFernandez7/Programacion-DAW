package Tema3.EjerciciosTema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            String nombre = teclado.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            // Evitar duplicados
            if (!nombres.contains(nombre)) {
                nombres.add(nombre);
            } else {
                System.out.println("Ese nombre ya está en la lista.");
            }
        }

        // Ordenar la lista alfabéticamente
        Collections.sort(nombres);

        // Mostrar nombres ordenados
        System.out.println("\nNombres introducidos (ordenados):");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        teclado.close();
    }
}
