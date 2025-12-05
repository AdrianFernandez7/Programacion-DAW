import java.util.Scanner;

public class BatallaRol {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int seleccion;
        do{
        System.out.println(
        "\n-----Menú-----"+"\n1 Crear Personaje"+"\n2 Iniciar Batalla  "+"\n3 Mostrar Listas   "+"\n4 Mostrar Menu     "+"\n0 Salir");
        seleccion=teclado.nextInt();
        if(seleccion==1){
            //imprimimos los 3 personajes que tenemos
            //cuando se elija uno imprimimos sus caract.
            //añadimos a la lista de heroes o villanos segun sea

        }else if(seleccion==2){
            //inciamos la clase batalla
            //calculara el daño que le afectara con sus defensas, etc
            //mostrara el ganador y imprimiremos de nuevo el menu
            //en un futuro implementaremos 

        }else if(seleccion==3){
            //mostrar arraysList con villanos y heroes

        }else if(seleccion==4){

        }else if(seleccion!=0){
            System.out.println("Dato no válido");
        }
        }while(seleccion!=0);
            System.out.println("¡Hasta pronto!");
        

            teclado.close();
    
        //Personajes personaje=new Personajes("Adrian",23,23,23);
        //System.out.println(personaje);
        

    }

    
}
