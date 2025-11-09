package EjerciciosMoodle3;

public class Ejercicio8 {
    public static boolean esPalindromo(String frase) {
        frase = frase.toLowerCase().replaceAll("[^a-záéíóúüñ]", "");
        String invertida = new StringBuilder(frase).reverse().toString();
        return frase.equals(invertida);
    }

    public static void main(String[] args) {
        String frase = "Dábale arroz a la zorra el abad";
        System.out.println("¿Es palíndroma? " + esPalindromo(frase));
    }
}