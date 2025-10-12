package ActividadRecursividad;

public class Actividad2 {
    public static int sumaNumeros(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma+=i;

        }
        return suma;
    }
    public static void main(String[] args) {
        int numero=4;
        System.out.println(sumaNumeros(numero));

    }
}
    

