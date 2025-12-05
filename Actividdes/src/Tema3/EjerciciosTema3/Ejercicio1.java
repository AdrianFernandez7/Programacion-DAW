package Tema3.EjerciciosTema3;

public class Ejercicio1 {

    // Función que busca un número en el array
    public static int buscarNumero(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return i; // Devuelve la posición donde se encontró
            }
        }
        return -1; // Si no se encuentra, devuelve -1
    }

    // Aquí probaremos nuestra funcion
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 3, 9, 4};
        int buscado = 3;

        int posicion = buscarNumero(numeros, buscado);

        if (posicion != -1) {
            System.out.println("El número " + buscado + " está en la posición: " + posicion);
        } else {
            System.out.println("El número " + buscado + " no se encuentra en el array.");
        }
    }
}