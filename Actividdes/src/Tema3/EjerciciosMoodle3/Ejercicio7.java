package Tema3.EjerciciosMoodle3;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        System.out.println("Matriz original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(101);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] rotada = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                rotada[j][4 - i] = matriz[i][j];

        System.out.println("\nMatriz rotada:");
        for (int[] fila : rotada) {
            for (int val : fila) System.out.print(val + "\t");
            System.out.println();
        }
    }
}