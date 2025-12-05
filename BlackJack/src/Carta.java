public class Carta {//Clase Carta Lista

    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }
    
    public void setPalo(String palo){
        this.palo=palo;
    }

    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }

    // valor numérico para blackjack
    public int getPuntos() {
        switch (valor) {
            case "A": return 11; //El valor se elijira dependiendo de nuestra mano
            case "J": 
            case "Q": 
            case "K": return 10;
            default: return Integer.parseInt(valor); //Para 2-10
        }
    }

    @Override
    public String toString() {
        return "[" +valor + " de " + palo+"]";
    }
}
