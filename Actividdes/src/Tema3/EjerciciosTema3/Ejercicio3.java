package Tema3.EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Definir tamaño de la matriz
        System.out.print("Introduce el número de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Insertar valores en la matriz
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Calcular suma por fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Calcular suma por columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        teclado.close();
    }
}