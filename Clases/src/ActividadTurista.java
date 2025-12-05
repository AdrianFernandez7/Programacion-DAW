
import actividadturista.Hotel;
import actividadturista.Reserva;
import actividadturista.Sucursal3;
import actividadturista.Toma;
import actividadturista.Turista;
import actividadturista.Vuelo;

public class ActividadTurista {
    public static void main(String[] args) {
        
        Hotel h1 = new Hotel(1,"casanova",7474747,4,"linares","avenida");
        Hotel h2 = new Hotel(2,"solagero",673484,4,"almeria","palmeras");

        Turista t1 = new Turista(1,"alameda","pepe","fernandez",82746247);
        Turista t2 = new Turista(2,"pisos picados","antonio","lozano",67544293);

        Vuelo v1 = new Vuelo(1,120625,21,"españa","japon",24);
        Vuelo v2 = new Vuelo(2,470925,12,"mexico","españa",46);

        Sucursal3 s1 = new Sucursal3(1, 6363636, "pepeneitor","pamplona","cordoba");
        Sucursal3 s2 = new Sucursal3(2,626536,"caceres","señorio de la sal","alameda auyante");

    Reserva[] reservado = new Reserva[3];
    Reserva r1=new Reserva(h1, t1, s1);
    Reserva r2=new Reserva(h2, t2, s2);
    reservado[0]=r1;
    reservado[1]=r2;

    Toma[] tomar = new Toma[3];
    Toma to1=new Toma(v1, s1, t1);
    Toma to2=new Toma(v2, s2, t2);
    tomar[0]=to1;
    tomar[1]=to2;


    System.out.println(to1);
    }

}