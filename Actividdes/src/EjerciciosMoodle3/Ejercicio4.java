package EjerciciosMoodle3;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] correcto = {3, 15, 22, 28, 35, 42};
        int[] usuario = new int[6];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tus 6 números:");
        for (int i = 0; i < 6; i++) {
            usuario[i] = teclado.nextInt();

            teclado.close();
        }

        int aciertos = 0;
        for (int num : usuario) {
            for (int val : correcto) {
                if (num == val) aciertos++;
            }
        }

        System.out.println("Has tenido " + aciertos + " aciertos.");
    }
}