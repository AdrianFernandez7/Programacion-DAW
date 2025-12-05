public class Crupier {//Clase Crupier lista

    private String nombre;
    private int fondos;
    private int Apuesta;  // Fondos iniciales

    public Crupier(String nombre) {
        this.nombre = nombre;
        this.fondos = 100;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFondos() {
        return fondos;
    }

    public void setFondos(int fondos) {
        this.fondos = fondos;
    }
    public int getApuesta(){
        return Apuesta;
    }
    public void setApuesta(int Apuesta){
        this.Apuesta= Apuesta;
    }
    // TO STRING (OPCIONAL)
    @Override
    public String toString() {
        return  "\n=====CRUPIER=====" +
                "\nNombre =" + nombre +
                "\nFondos =" +fondos+
                "\n==================";

    }
}
