package ActividadPag17;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args){
        //Generar número aleatorio
        int aleatorio=(int)(Math.random()*(100-1+1))+1;
        int intentos=0;
        int numero=0;
        boolean encontrado=false;
        Scanner teclado = new Scanner(System.in);
        //Crearemos el bucle para ir viendo lo que el usuario va introduciendo
        do {
            //Vamos a leer el número
            System.out.println("Introduce un número: ");
            numero=teclado.nextInt();
            if(numero>aleatorio){
            System.out.println("El número es menor al introducido");
            }
            else if(numero<aleatorio){
            System.out.println("El número es mayor al introducido");
            }
            else{
                System.out.println("Has acertado el número");
                encontrado=true;
                System.out.println("Has utilizado "+intentos+" intentos.");
            }
            intentos++;
            
        }while(!encontrado);
        teclado.close();
    }
    
}
