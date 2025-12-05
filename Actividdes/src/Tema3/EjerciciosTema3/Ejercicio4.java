package Tema3.EjerciciosTema3;

public class Ejercicio4 {

    // Función que elimina un valor del array
    public static int[] borrarValor(int[] array, int valorABorrar) {
        int contador = 0;

        // Contar cuántos elementos NO son el valor a borrar
        for (int num : array) {
            if (num != valorABorrar) {
                contador++;
            }
        }

        // Crear nuevo array 
        int[] nuevoArray = new int[contador];
        int indice = 0;

        // Copiar solo los elementos distintos al valor a borrar
        for (int num : array) {
            if (num != valorABorrar) {
                nuevoArray[indice++] = num;
            }
        }

        return nuevoArray;
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        int[] original = {2, 3, 5, 7, 8, 2};
        int valor = 2;

        int[] resultado = borrarValor(original, valor);

        System.out.print("Array sin el valor " + valor + ": ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
