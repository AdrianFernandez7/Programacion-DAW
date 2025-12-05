package actividadturista;

public class Vuelo {
    int id;
    int fecha;
    int hora;
    String origen;
    String destino;
    int plazasTotales;

    public Vuelo(){}

    public Vuelo(int id, int fecha, int hora, String origen, String destino, int plazasTotales){
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    @Override
    public String toString() {
        return "Vuelo [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", origen=" + origen + ", destino=" + destino
                + ", plazasTotales=" + plazasTotales + "]";
    }

     
}
