package Tema3.EjerciciosMoodle3;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> correcto = new ArrayList<>(Arrays.asList(3, 15, 22, 28, 35, 42));
        ArrayList<Integer> usuario = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tus 6 números:");
        for (int i = 0; i < 6; i++) {
            usuario.add(teclado.nextInt());

            
        }
        teclado.close();
        int aciertos = 0;
        for (int num : usuario) {
            if (correcto.contains(num)) aciertos++;
        }

        System.out.println("Has tenido " + aciertos + " aciertos.");
    }
}