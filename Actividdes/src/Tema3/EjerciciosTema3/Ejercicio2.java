package Tema3.EjerciciosTema3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Horario: 5 días (lunes a viernes), 6 franjas horarias
        String[][] horario = {
            {"IPE", "Sistemas Informáticos", "Base de Datos", "Base de Datos", "Programación", "Programación"},      // Lunes
            {"LMSGI", "Sistemas Informáticos", "Sistemas Informáticos", "Programación", "Programación", "Entornos de desarrollo"},              // Martes
            {"Bases de Datos", "Base de Datos", "Sistemas Informáticos", "Sistemas Informáticos", "Programación", "Programación"},     // Miércoles
            {"Programación", "Entornos de desarrollo", "Entornos de desarrollo", "IPE", "Base de Datos", "Sostenibilidad"},                     // Jueves
            {"Base de Datos", "Digitalizacion", "LMSGI", "LMSGI", "IPE", "Programación"}             // Viernes
        };

        String[] horas = {"8:00", "9:00", "10:00", "11:30", "12:30", "13:30"};

        // Obtener el día actual
        DayOfWeek diaActual = LocalDate.now().getDayOfWeek();
        int indiceDia = diaActual.getValue() - 1; // Lunes = 1 → índice 0

        if (indiceDia >= 0 && indiceDia < 5) {
            System.out.println("Hoy es " + diaActual + ". Estas son tus clases:");
            for (int i = 0; i < horario[indiceDia].length; i++) {
                System.out.println(horas[i] + " -> " + horario[indiceDia][i]);
            }
        } else {
            System.out.println("Hoy es fin de semana. No tienes clases.");
        }
    }
}