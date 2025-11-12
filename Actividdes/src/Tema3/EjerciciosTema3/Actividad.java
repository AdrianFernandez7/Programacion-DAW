package Tema3.EjerciciosTema3;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(); //Creacion de la lista vacía   
        Scanner teclado= new Scanner(System.in);
        String palabra;
        boolean salida=false;
        do{
            System.out.println("Introduce una palabra o pon fin para cerrar");
            palabra=teclado.nextLine();
            if(!palabra.equals("fin") && !lista.contains(palabra)){
                if(!lista.add(palabra));
            }
            if(palabra.equals("fin")) {salida=true;}
        }while(!salida);

        //Sacar las palabras guardadas
        System.out.println("Contenido de la Lista: ");
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();

        //Vamos a ordenar la lista
        lista.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Contenido de la lista ordenado: ");
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();



        teclado.close();
        }
    
}
