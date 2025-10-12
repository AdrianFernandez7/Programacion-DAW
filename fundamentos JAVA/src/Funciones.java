import java.time.LocalDateTime;

public class Funciones {

    public static void main(String[] args) {
           //Tratamiento de fechas en Javaç
           LocalDateTime hoy = LocalDateTime.now();
           System.out.println(hoy.toString());
           System.out.println(hoy.getDayOfWeek());


           //Tratamiento de Math
        //System.out.println(Math.pow(2,8));

       /*  //Numeros aleatorios
        int min=1;
        int max=15;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        //System.out.println(Math.random());
        System.out.println(aleatorio);   */
        

        //Operadores
        //++ y --
        //No es lo mismo ++variable(incrementa y despues lo usa) que variable++(coge el valor despues lo incrementa)
        int valor=1;
        valor=valor--;
        System.out.println(valor);
        valor=valor-1;
        System.out.println(valor);

        //Expresiones relacionales
        System.out.println((4>3));

        //Operadores opera-asigna
        int numero11=3;
        int numero12=4;
        numero11+=numero12;
        System.out.println(numero11);

        //Operador alternario
        int a=10 ,b=5;
        int x=a==10 ? b*2:a;      //Si se cumple una condicion se hara la operacion
        System.out.println(x);




        

        
    }


    
}
