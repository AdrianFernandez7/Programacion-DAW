package Tema3.EjerciciosTema3;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Matriz de ejemplo
        int[][] matriz = {
            {4, 2, 7},
            {1, 9, 3},
            {6, 5, 8}
        };

        // Calcular tamaño total del vector
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] vector = new int[filas * columnas];

        // Copiar elementos de la matriz al vector
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                vector[index++] = matriz[i][j];
            }
        }

        // Ordenar el vector
        Arrays.sort(vector);

        // Mostrar el vector ordenado
        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}