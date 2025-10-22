package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double sueldoBase = 0.0;
        double irpfPorcentaje = 0.0;
        final double COMPLEMENTO_VIAJE_POR_DIA = 18.0; 
        
        System.out.println("--- Cálculo de Nómina ---");
        System.out.println("Seleccione el cargo:");
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Senior");
        System.out.println("3 - Jefe de Proyecto");
        System.out.print("Opción de cargo (1-3): ");
        int cargo = teclado.nextInt();

        switch (cargo) {
            case 1:
                sueldoBase = 950.00; 
                break;
            case 2:
                sueldoBase = 1200.00; 
                break;
            case 3:
                sueldoBase = 1500.00; 
                break;
        }

        System.out.print("Introduce los días de viaje : ");
        int diasViaje = teclado.nextInt();
        
        System.out.println("Seleccione el estado civil:");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Opción de estado civil (1-2): ");
        int estadoCivil = teclado.nextInt();
        
        if (estadoCivil == 1) {
            irpfPorcentaje = 0.20; 
        } else if (estadoCivil == 2) {
            irpfPorcentaje = 0.18; 
        } else {
            System.out.println("Estado civil no válido.");
            irpfPorcentaje = 0.20;
        }

        double complementoViaje = diasViaje * COMPLEMENTO_VIAJE_POR_DIA;
        double sueldoBruto = sueldoBase + complementoViaje;
        double irpf = sueldoBruto * irpfPorcentaje;
        double sueldoNeto = sueldoBruto - irpf;

        System.out.println("\n        --- NÓMINA ---");
        System.out.printf("%-20s %10s\n", "CONCEPTO", "IMPORTE");
        System.out.printf("%-20s %10s\n", "--------------------", "----------");
        System.out.printf("%-20s %10.2f €\n", "Sueldo Base", sueldoBase);
        System.out.printf("%-20s %10.2f €\n", "Compl. Viaje (" + diasViaje + " días)", complementoViaje);
        System.out.printf("%-20s %10s\n", "--------------------", "----------");
        System.out.printf("%-20s %10.2f €\n", "Sueldo Bruto", sueldoBruto);
        System.out.printf("%-20s %10s\n", "--------------------", "----------");
        System.out.printf("%-20s %10.2f €\n", "Retención IRPF (" + (int)(irpfPorcentaje*100) + "%)", irpf);
        System.out.printf("%-20s %10s\n", "--------------------", "----------");
        System.out.printf("%-20s %10.2f €\n", "SUELDO NETO", sueldoNeto);
        
        teclado.close();
    }
}

