package Tema3.EjerciciosMoodle3;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos números quieres introducir? ");
        int n = teclado.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Vector original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Orden descendente: " + Arrays.toString(reverse(numeros)));

        teclado.close();
    }

    public static int[] reverse(int[] array) {
        int[] rev = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - 1 - i];
        }
        return rev;

    }
}