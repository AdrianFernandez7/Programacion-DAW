public class Jugador {

    private String Nombre;
    private int Fondos;
    private int apuesta;

    public Jugador(String Nombre){
        this.Nombre = Nombre;
        this.Fondos = 100; // FONDOS INICIALES
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public int getFondos(){
        return Fondos;
    }

    public void setFondos(int Fondos){
        this.Fondos = Fondos;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    @Override
    public String toString() {
        return  "\n=====JUGADOR=====" +
                "\nNombre = "  + Nombre +
                "\nFondos = " + Fondos +
                "\n==================";
    }
}

