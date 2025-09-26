import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        //Instrucciones de salida por pantalla
        /*  int valor=7;
        System.out.println(valor);

        //Usar printf
        double precio=130.35479;
        System.out.printf("El precio del producto %s tiene un valor de %5.2f","Tablet",precio);
        //Incluir un icono
        System.out.println(" Qué ganas tengo de unas vacaciones ⛱ ");

        //Formato reciente de System
        System.out.println("El precio del producto " + " Tablet " + " tiene un valor de "+precio+ " y se han comprado " + valor+" unidades");
        //Formato salida texto
        System.out.printf(" %15s, %-15s "," Adrián "," Informático ");

        //Formato tabla
        System.out.printf("|%-10s |%10s |%-10s |\n","Producto","Cantidad","   Valor");
        System.out.println("                                  |-----------|-----------|-----------|");
        System.out.printf("                                  |%-10s |     %d     | %f|\n","Producto",valor ,precio);
        System.out.println("                                  |-----------|-----------|-----------|");


        System.out.println("                                  |-----------|-----------|-----------|");
        System.out.println("                                  |"+"Producto"+"   |"+"  Cantidad"+" |"+"  Precio"+"   |");
        System.out.println("                                  |-----------|-----------|-----------|");
        System.out.println("                                  |"+"Tablet"+"     |     "+valor+"     | "+precio +" |");
        System.out.println("                                  |-----------|-----------|-----------|");
*/


        //Operaciones por el teclado
        /*Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce la cadena de texto deseada");
            String cadena=teclado.nextLine();
            System.out.println("El cadena introducida es: "+ cadena);



            teclado.close();
            */

         Scanner teclado = new Scanner(System.in);
        //Lee nombre
           System.out.println("Introduce nombre");
           String nombre=teclado.nextLine();
        //Leer apellido
        System.out.println("Introduce apellido");
           String apellido=teclado.nextLine();
        //Leer edad
        System.out.println("Introduce edad");
        //Opción 1 limpiar buffer
           //int edad=teclado.nextInt();
          // teclado.nextLine(); //limpiar el buffer para el salto de linea
        //Opción 2
        int edad=Integer.parseInt(teclado.nextLine());
        //Leer Profesión
        System.out.println("Introduce profesion");
           String profesion=teclado.nextLine();

           System.out.println("El usuario se llama "+nombre+" "+ apellido +". Tiene "+ edad + " años y trabaja de " + profesion);





        }
    }
    

