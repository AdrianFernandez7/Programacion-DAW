package actividadferroviaria;

public class Vagon {
    int numero;
    int cargaMaxima;
    int cargaActual;
    String tipoDeMercancia;
    
    public Vagon(){}

    public Vagon(int numero, int cargaMaxima, int cargaActual,String tipoDeMercancia){
        this.numero=numero;
        this.cargaMaxima=cargaMaxima;
        this.cargaActual=cargaActual;
        this.tipoDeMercancia=tipoDeMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoDeMercancia() {
        return tipoDeMercancia;
    }

    public void setTipoDeMercancia(String tipoDeMercancia) {
        this.tipoDeMercancia = tipoDeMercancia;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual
                + ", tipoDeMercancia=" + tipoDeMercancia + "]";
    }

    
}
