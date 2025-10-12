package ActividadPag9;
public class ActividadPag9{

public static void main(String[] args) {
        int min=1,max=100;
        double numero1=(int)(Math.random() * (max-min+1)+min);
        double numero2=(int)(Math.random() * (max-min+1)+min);
        double cociente=numero1/numero2;
        double media=(numero1+numero2)/2.0;
        double potencia=Math.pow(numero1,numero2);
        double raiz1=Math.sqrt(numero1);
        double raiz2=Math.sqrt(numero2);

        System.out.println("Los números aleatorios son: "+numero1+" y "+numero2);
        System.out.println("El cociente es: "+cociente);
        System.out.println("La media es: "+media);
        System.out.println("La potencia es: "+potencia);
        System.out.println("La raíz del primero es "+raiz1+" y la del segundo "+raiz2);

    }
        //Actividad tema 2 diapositiva 9
        /*Realiza un programa Realiza un programa que genera 2 números y nos diga el cociente, la media, la potencia y la raíz cuadrada. Usa tipos adecuados*/

        /*Pseudocodigo
           INICIO
             GENERAR NUMERO 1 
             GENERAR NUMERO 2
                  CALCULAS OPERACIONES
             MOSTRAR EN PANTALLA
          FIN_PROGRAMA   */
          }
