package Tema3.EjerciciosTema3;

public class Ejercicio5 {

    // Función que inserta un valor en una posición específica
    public static int[] insertarValor(int[] array, int valor, int posicion) {
        int nuevoTamaño = Math.max(array.length + 1, posicion + 1);
        int[] nuevoArray = new int[nuevoTamaño];

        // Copiar elementos hasta la posición deseada
        for (int i = 0; i < posicion && i < array.length; i++) {
            nuevoArray[i] = array[i];
        }

        // Insertar el nuevo valor
        nuevoArray[posicion] = valor;

        // Copiar el resto de elementos si la posición está dentro del array original
        if (posicion < array.length) {
            for (int i = posicion; i < array.length; i++) {
                nuevoArray[i + 1] = array[i];
            }
        }

        return nuevoArray;
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        int[] original = {3, 5, 7, 8};
        int valor = 2;
        int posicion = 2;

        int[] resultado = insertarValor(original, valor, posicion);

        System.out.print("Array resultante: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
