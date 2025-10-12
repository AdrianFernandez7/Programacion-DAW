//import java.util.Scanner;

public class Bucles {
    public static void main(String[] args){

    //    //Caso básico de bucles
    //    for(int i=0;i<5;i++){   //Conozco cuantas se van a ejecutar
    //    System.out.println(i);
    //    }
        //Bucle while






    ////Bucle do-while
    //    int k=0;
    //    do{
    //        System.out.println(k);
    //        k++;
    //    }while(k<5);


    ////COSAS QUE NO QUIERO VER EN VUESTOS CODIGOS
    //for(int i=0;i<5;i++){
    //    System.out.println(i);
    //    if (i==3) break;


    //}

    ////Hacerlo mejor con un bucle while
    //int j=0;
    //boolean continua=true;
    //while(j<5 && continua){
    //   System.out.println(j);
    //   if(j==3) continua=false;
    //   j++;

    //}



    //Scanner teclado= new Scanner(System.in);
    //int numero=0;
    //do{
    //    System.out.println("Escribe un número entre 1 y 5: ");
    //    numero=teclado.nextInt();
    //}while(numero<1||numero>5);
    //teclado.close();

    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }





   }
}
 