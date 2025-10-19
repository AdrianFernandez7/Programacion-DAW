package EjerciciosMoodle2;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = teclado.nextInt();
        
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = teclado.nextInt();
        
        String signo = "Fecha incorrecta";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "ARIES ";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "TAURO ";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "GÉMINIS ";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "CÁNCER ";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "LEO "; 
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "VIRGO ";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "LIBRA ";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "ESCORPIO ";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "SAGITARIO ";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "CAPRICORNIO ";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "ACUARIO ";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "PISCIS ";
        } 

        System.out.println("\nTu signo del zodiaco es: " + signo);

        teclado.close();
    }
}

