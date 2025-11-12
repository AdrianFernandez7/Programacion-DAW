package Tema3.EjerciciosMoodle3;

import java.util.Arrays;

public class Ejercicio6 {
    public static int[][] combinarMatrices(int[][] m1, int[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;
        int[][] resultado = new int[filas][3]; // 3 columnas: suma, producto, media

        for (int i = 0; i < filas; i++) {
            int suma = 0, producto = 1, media = 0;
            for (int j = 0; j < columnas; j++) {
                suma += m1[i][j] + m2[i][j];
                producto *= m1[i][j] * m2[i][j];
                media += (m1[i][j] + m2[i][j]) / 2;
            }
            resultado[i][0] = suma;
            resultado[i][1] = producto;
            resultado[i][2] = media;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] resultado = combinarMatrices(matriz1, matriz2);

        System.out.println("Matriz resultado:");
        for (int[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }
}