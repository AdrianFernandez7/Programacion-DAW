package Tema2.ActividadesTema2.ActividadRecursividad;

public class Actividad1 {
    public static int numeroDigitos(int n){
        int contador=0;
        while(n>0){
            n=n/10;
            contador++;
        }
        return contador;
    }
    public static int numeroDigitosRecursivo(int n){
        if(n>00 && n<10){
            return 1;
        }
        else{
            return 1+numeroDigitosRecursivo(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(numeroDigitos(1376492711));
        System.out.println(numeroDigitosRecursivo(2332442));
        
    }
}
