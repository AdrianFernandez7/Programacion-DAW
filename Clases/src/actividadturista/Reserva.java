package actividadturista;

public class Reserva {
    Hotel hotel=null;
    Turista turista=null;
    Sucursal3 sucursal3=null;

    public Reserva(){}

    public Reserva(Hotel hotel,Turista turista, Sucursal3 sucursal3){
        this.hotel = hotel;
        this.turista = turista;
        this.sucursal3 = sucursal3;
    
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Sucursal3 getSucursal3() {
        return sucursal3;
    }

    public void setSucursal3(Sucursal3 sucursal3) {
        this.sucursal3 = sucursal3;
    }

    @Override
    public String toString() {
        if(hotel!=null && turista!=null && sucursal3!=null)
            return "Escribe [Hotel=" + hotel.toString() + ", turista=" + turista.toString() + " y sucursal="+ sucursal3.toString()+ "]";
        else
            return "No hay ni hotel, ni turista ni una sucursal";
    
}
}
