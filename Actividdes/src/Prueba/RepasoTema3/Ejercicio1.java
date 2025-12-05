package Prueba.RepasoTema3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //creamos un array con los digitos del bonoloto
        ArrayList<Integer> correcto = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5 ,6));
        ArrayList<Integer> usuario = new ArrayList<>();
        //creamos un bonoloto con los datos del usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los 6 digitos de su ticket?: ");
        
            for(int i=0; i<6; i++){
                
                usuario.addFirst(teclado.nextInt());
                

                }
            
            teclado.close();
            int aciertos = 0;
            for (int num : usuario) {
            if (correcto.contains(num)) aciertos++;
            }
            System.out.println("Has tenido " + aciertos + " aciertos.");

        

    }
    
}
