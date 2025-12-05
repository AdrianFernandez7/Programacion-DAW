import java.util.ArrayList;
import java.util.Collections;

public class Mazo {//Clase Mazo Lista
    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};//Baraja Blackjack
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//Valores de cartas Blackjack
        for (String palo : palos) {
            for (String valor: valores) {
                cartas.add(new Carta(palo, valor)); //Añade una nueva carta al arraylist
            }
        }
        barajar();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()) return null;
        return cartas.remove(0);//Devuelve la primera del mazo
    }

    public boolean estaVacio() {
        return cartas.isEmpty();
    }
    
    public int cartasRestantes() {
        return cartas.size();
    }
}
