package EjerciciosMoodle2;

    import java.util.Scanner;

public class Ejercicio10 {

    public static int contarDigitosPares(long numero) {
        int contador = 0;
        if (numero < 0) {
            numero = -numero;
        }
        if (numero == 0) return 1; 

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) { 
                contador++;
            }
            numero /= 10; 
        }
        return contador;
    }
        public static int contarDigitosImpares(long numero) {
        int contador = 0;
        if (numero < 0) {
            numero = -numero;
        }
        if (numero == 0) return 0; 

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 != 0) { 
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero : ");
        long numeroEntrada = sc.nextLong();

        int pares = contarDigitosPares(numeroEntrada);
        int impares = contarDigitosImpares(numeroEntrada);

        System.out.println("El " + numeroEntrada + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares.");
        
        sc.close();
    }
}

