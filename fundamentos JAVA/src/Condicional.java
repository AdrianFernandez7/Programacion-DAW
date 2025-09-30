import java.util.Scanner;

public class Condicional {

public static void main(String[]args) {

   /*  int user = 20;
    if (user <= 18) {
      System.out.println("User is 18 or younger"); 
    }
    else {
        System.out.println("User is older than 18");
    }

}           */

  /*  public static void main(String[] args)   {
    int user = 45;
    if (user<=18){
        System.out.println("User is 18 or younger");
        }
        else if (user>18&&user<40){
            System.out.println("User is between 19 and 39");
        }
        else if (user==45 ||user==50){
            System.out.println("User is either 45 or 50");
        }
        else {
            System.out.println("User is older than 40");
        }
}          */

//Comprobar si un numero es divisible por 2 y 3
//Si numero%2 es 0 y numero%3 es 0 entonces
//      escribir numero es divisible por 2 y 3
//sino
//      escribir no es divisible por 2 y 3
//fin_SI
/*int numero=4;
    
if(numero%2==0 && numero %3==0){
System.out.println("El numero "+numero+" es divisible por 2 y 3");
  }
else {
    System.out.println("El numero "+numero+ " no es divisible por 2 y 3");
  }*/



//inicio
//  leer numero
//  indicar mes al que hace referencia
// imprimirlo
//fin_programa

Scanner teclado=new Scanner(System.in);
System.out.println("Introduzca un número");
int numero=teclado.nextInt();

switch(numero) {
  case 1: System.out.println("ENERO");break;
  case 2: System.out.println("FEBRERO");break;
  case 3: System.out.println("MARZO");break;
  case 4: System.out.println("ABRIL");break;
  case 5: System.out.println("MAYO");break;
  case 6: System.out.println("JUNIO");break;
  case 7: System.out.println("JULIO");break;
  case 8: System.out.println("AGOSTO");break;
  case 9: System.out.println("SEPTIEMBRE");break;
  case 10: System.out.println("OCTUBRE");break;
  case 11: System.out.println("NOVIEMBRE");break;
  case 12: System.out.println("DICIEMBRE");break;
  case 13: System.out.println("VALOR INCORRCTO");break;
}
teclado.close();

}
}


