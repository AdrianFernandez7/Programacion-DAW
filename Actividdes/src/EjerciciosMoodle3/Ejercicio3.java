package EjerciciosMoodle3;

public class Ejercicio3 {
    public static int[] maxMin(int[] array) {
        int max = array[0], min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] datos = {3, 7, 2, 9, 4};
        int[] resultado = maxMin(datos);
        System.out.println("Máximo: " + resultado[0] + ", Mínimo: " + resultado[1]);
    }
}