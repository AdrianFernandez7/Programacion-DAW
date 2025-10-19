package EjerciciosMoodle2;

    import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final int HORAS_NORMALES = 40;
        final double TARIFA_NORMAL = 12.0;
        final double TARIFA_EXTRA = 16.0;

        System.out.print("Introduce el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = teclado.nextInt(); 

        double salarioSemanal;
    
        if (horasTrabajadas <= HORAS_NORMALES) {
            salarioSemanal = horasTrabajadas * TARIFA_NORMAL;
        } else {
            int horasExtra = horasTrabajadas - HORAS_NORMALES;
            salarioSemanal = (HORAS_NORMALES * TARIFA_NORMAL) + (horasExtra * TARIFA_EXTRA);
        }
        System.out.printf("El sueldo semanal que le corresponde es de %.2f euros\n", salarioSemanal);
        
        teclado.close(); 
    }
}

