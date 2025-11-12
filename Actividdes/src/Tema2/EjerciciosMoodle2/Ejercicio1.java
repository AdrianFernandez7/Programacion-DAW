package Tema2.EjerciciosMoodle2;

import java.time.LocalDateTime;

public class Ejercicio1 {
    public static void main(String[] args) {
        LocalDateTime ahora = LocalDateTime.now();
        int hora = ahora.getHour(); 

        String saludo;
        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos días ";
        } else if (hora >= 13 && hora <= 20) {
            saludo = "Buenas tardes ";
        } else { 
            saludo = "Buenas noches ";
        }
        System.out.println("La hora actual es: " + hora + "h");
        System.out.println(saludo);
    }
}
    

