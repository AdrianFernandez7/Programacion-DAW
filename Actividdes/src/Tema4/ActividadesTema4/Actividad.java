package Tema4.ActividadesTema4;

public class Actividad {
    String nombre;
    String DNI;
    int fechaNacimiento;
    String direccion;
    boolean genero;
    boolean estadoCivil;

    public Actividad(String nombre, String DNI, int fechaNacimiento, String direccion,boolean genero, boolean estadoCivil){
        this.nombre=nombre;
        this.DNI=DNI;
        this.fechaNacimiento=fechaNacimiento;
        this.direccion=direccion;
        this.genero=genero;
        this.estadoCivil=estadoCivil;
    }
     public void setNombre(String cadena){
        this.nombre=cadena;
     }

     public String getNombre(){
        return this.nombre;
     }

     public void setDNI(String codigo){
        this.DNI=codigo;
     }

     public String getDNI(){
        return this.DNI;
     }

     public void setFechaNacimiento(int fecha){
        this.fechaNacimiento=fecha;
     }

     public int getFechaNacimiento(){
        return this.fechaNacimiento;
     }

     public void setDireccion(String direccionn){
        this.direccion=direccionn;
     }

     public String getDireccion(){
        return this.direccion;
     }

     public void setGenero(boolean gen){
        this.genero=gen;
     }

     public boolean getGenero(){
        return this.genero;
     }

     public void setEstadoCivil(boolean estadoCiv){
        this.estadoCivil=estadoCiv;
     }

     public boolean getEstadoCivil(){
        return this.estadoCivil;
     }

     public void imprimePersona1(){
        System.out.println("Me llamo "+this.nombre+" con DNI "+this.DNI+". Naci el "+this.fechaNacimiento+" y mi direccion es "+this.direccion+". Mi genero es "+this.genero+" y mi estado civil "+this.estadoCivil);
     }
}
