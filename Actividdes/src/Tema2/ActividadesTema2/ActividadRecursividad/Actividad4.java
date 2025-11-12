package Tema2.ActividadesTema2.ActividadRecursividad;

public class Actividad4 {
    public static String pasarBinario(int n){
        String cadena="";
        if(n==0){
            return cadena;
        }
        else{
            cadena=cadena+n%2;
            pasarBinario(n/2);
        }
        return cadena;
        
    }
    public static void main(String[] args) {
        System.out.println(pasarBinario(83631983));
    }
}
