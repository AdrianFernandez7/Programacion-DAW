package EjerciciosMoodle3;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar número\n2. Eliminar número\n3. Mostrar\n4. Comprobar\n5. Eliminar todos\n6. Tamaño\n7. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Número: ");
                    int num = teclado.nextInt();
                    if (num >= 0) lista.add(num);
                    else System.out.println("No se permiten negativos.");
                    break;
                case 2:
                    System.out.print("Número a eliminar: ");
                    int eliminar = teclado.nextInt();
                    lista.removeIf(n -> n == eliminar);
                    break;
                case 3:
                    System.out.println("Lista: " + lista);
                    break;
                case 4:
                    System.out.print("Número a comprobar: ");
                    int comprobar = teclado.nextInt();
                    System.out.println(lista.contains(comprobar) ? "Está en la lista." : "No está.");
                    break;
                case 5:
                    lista.clear();
                    break;
                case 6:
                    System.out.println("Tamaño: " + lista.size());
                    break;
            }
            teclado.close();
        } while (opcion != 7);
    }
}