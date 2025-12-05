package actividadferroviaria;

public class Maquinista {
    String nombre; 
    int DNI;
    int sueldo;
    int rango;
     public Maquinista(){}

     public Maquinista(String nombre, int DNI, int sueldo, int rango){
        this.nombre=nombre;
        this.DNI=DNI;
        this.sueldo=sueldo;
        this.rango=rango;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public int getDNI() {
         return DNI;
     }

     public void setDNI(int dNI) {
         DNI = dNI;
     }

     public int getSueldo() {
         return sueldo;
     }

     public void setSueldo(int sueldo) {
         this.sueldo = sueldo;
     }

     public int getRango() {
         return rango;
     }

     public void setRango(int rango) {
         this.rango = rango;
     }

     @Override
     public String toString() {
        return "Maquinista [nombre=" + nombre + ", DNI=" + DNI + ", sueldo=" + sueldo + ", rango=" + rango + "]";
     }

     
     
}
