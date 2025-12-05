package actividadturista;

public class Toma {
    Vuelo vuelo=null;
    Sucursal3 sucursal3=null;
    Turista turista=null;
    
    public Toma(){}

    public Toma(Vuelo vuelo, Sucursal3 sucursal3, Turista turista){
        this.vuelo = vuelo;
        this.sucursal3 = sucursal3;
        this.turista = turista;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Sucursal3 getSucursal3() {
        return sucursal3;
    }

    public void setSucursal3(Sucursal3 sucursal3) {
        this.sucursal3 = sucursal3;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    @Override
    public String toString() {
        if(vuelo!=null && turista!=null && sucursal3!=null)
            return "Escribe [Vuelo=" + vuelo.toString() + ", turista=" + turista.toString() + " y sucursal="+ sucursal3.toString()+ "]";
        else
            return "No hay ni vuelo, ni turista ni una sucursal";
    
}
}
