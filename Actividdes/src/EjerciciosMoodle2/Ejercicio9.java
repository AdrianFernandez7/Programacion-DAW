package EjerciciosMoodle2;

    import java.util.Scanner;

public class Ejercicio9 {
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } 
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el número de términos de Fibonacci : ");
        int n = teclado.nextInt();

        System.out.print("\nSerie de Fibonacci : ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        teclado.close();
    }
}

