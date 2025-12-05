import java.util.ArrayList;
import java.util.Scanner;
public class Partida{//Por completar

    Jugador jugador;//Añadimos las clases de jugador y crupier para poder acceder a sus metodos y atributos
    Crupier crupier;
    Mazo mazo;
    int contadorVictoriasJugador=0;
    int contadorVictoriasCrupier=0;
    int apuesta=0;
    Scanner sc=new Scanner(System.in);
    private boolean jugadorInicioSesion = false;
    private boolean crupierInicioSesion = false;
    //Arrays dinamicos para los jugadores
    private ArrayList<Carta> cartasJ=new ArrayList<>(); 
    private ArrayList<Carta> cartasC=new ArrayList<>(); 

    //Se encarga de pasar un nuevo mazo
    public Partida(){
        mazo=new Mazo();
    }
    //Usa ese mismo mazo para barajearlo y hacerle modificaciones
    public Partida(Mazo mazo){
        mazo=new Mazo();
    }

    public void MostrarMenu(){
        int option;

        do{
            System.out.println("===MENU BLACKJACK===");
            System.out.println("1. Iniciar Sesion Jugador");
            System.out.println("2. Iniciar Sesion Crupier");
            System.out.println("3. Ver cartas restantes");
            System.out.println("4. Iniciar Partida");
            System.out.println("5. Salir");
            option=sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    loginJugador();
                    break;
                case 2:
                    loginCrupier();
                    break;
                case 3:  
                    // Validar que ambos hayan iniciado sesión
                    if (jugadorInicioSesion && crupierInicioSesion) {
                    System.out.println("Cartas restantes en el mazo: " + mazo.cartasRestantes());
                    } else {
                    System.out.println("Ambos deben iniciar sesion antes de acceder a este menú.");
                    }
                    break;
                    case 4:
                    if ((jugadorInicioSesion && crupierInicioSesion)) {
                        iniciarPartida();
                    } else {
                    System.out.println("Ambos deben iniciar sesion antes de acceder a este menú.");
                    }
                    case 5:
                        System.out.println("Saliendo del juego...");
                        break;
                    default:
                        System.out.println("Esta opcion no existe");
                        break;


            }
        }while(option!=5);

    }
    // ================= LOGINS =================
    private void loginJugador() {
        System.out.print("Ingresa nombre del jugador: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine(); // usa el scanner de la clase

        if (!nombre.isEmpty()) {
            jugador = new Jugador(nombre); // asigna al atributo, no crear variable local
            jugadorInicioSesion = true;
            System.out.println("Jugador inició sesión correctamente.");
            System.out.println(jugador); // imprime toString() correctamente
        } else {
            System.out.println("Error en login del jugador.");
        }
    }


    private void loginCrupier() {
        System.out.print("Ingresa nombre del crupier: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        if (!nombre.isEmpty()) {
            crupier = new Crupier("crupier");
            crupier.setNombre(nombre);
            crupierInicioSesion = true;
            System.out.println("Crupier inició sesión correctamente.");
            System.out.println(crupier); // imprime toString() correctamente
        } else {
            System.out.println("Error en login del crupier.");
        }
    }
//==================INICIAR PARTIDA=========================
    private void iniciarPartida() {
        Apostar();

        if (mazo.estaVacio()) {
            System.out.println("El mazo está vacío, no se puede iniciar la partida.");
            return;
        } else {
            cartasJ.clear();
            cartasC.clear();

            // Sacar cartas para jugador y para crupier
            cartasJ.add(mazo.sacarCarta());
            cartasC.add(mazo.sacarCarta());

            // Mostrar cartas iniciales
            System.out.println("=====CARTAS INICIALES=====");
            System.out.println("Tus Cartas: " + cartasJ);
            System.out.println("Carta visible del crupier: " + cartasC.get(0));
            //TURNOS
            turnoJugador();
            turnoCrupier();
            // DETERMINA EL GANADOR
            determinarGanador();
        }


    }
//======================TURNOS=================================
    public void turnoJugador(){
        int opcion;
        do{
            System.out.println("Tus cartas: "+cartasJ);
            System.out.println("1. Pedir una carta");
            System.out.println("2. Plantarse");
            opcion=sc.nextInt();
              switch (opcion) {
            case 1: // Pedir carta
                cartasJ.add(mazo.sacarCarta());
                
                if (calcularPuntos(cartasJ) > 21) {
                    System.out.println("¡Te pasaste de 21!");
                    return; // Termina el turno inmediatamente
                }
                break;

            case 2: // Si decide Plantarse
                System.out.println("Te plantas.");
                break;

            default:
                System.out.println("Opción inválida. Intenta otra vez.");
        }

    } while (opcion != 2); // Se repite hasta que el jugador se plante
}
            
    
    public void turnoCrupier(){
        while(calcularPuntos(cartasC)<17){
        cartasC.add(mazo.sacarCarta());
        }
          System.out.println("Cartas del crupier: " + cartasC + " | Total: " + calcularPuntos(cartasC));
    }
    //==============CALCULAR LOS PUNTOS EN MANO==================
    public int calcularPuntos(ArrayList<Carta> mano){
        int total=0;
        int ases=0;
        for(Carta c : mano) {
            total += c.getPuntos();
            if(c.getValor().equals("A")) ases++;
        }
        // Ajustar ases: si total > 21, cada A cuenta como 1 en vez de 11
        while(total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }
        return total;
    }
    //==============GANADORES=========================
   private void determinarGanador() {

    int puntosJugador = calcularPuntos(cartasJ);
    int puntosCrupier = calcularPuntos(cartasC);

    System.out.println("\n===== RESULTADOS =====");
    System.out.println("Jugador: " + puntosJugador);
    System.out.println("Crupier: " + puntosCrupier);

    // GANA JUGADOR
    if ((puntosJugador <= 21 && puntosJugador > puntosCrupier) || puntosCrupier > 21) {
        System.out.println("¡El jugador gana!");

        jugador.setFondos(jugador.getFondos() + jugador.getApuesta());
        crupier.setFondos(crupier.getFondos() - crupier.getApuesta());
    }

    // GANA CRUPIER
    else if ((puntosCrupier <= 21 && puntosCrupier > puntosJugador) || puntosJugador > 21) {
        System.out.println("¡El crupier gana!");

        jugador.setFondos(jugador.getFondos() - jugador.getApuesta());
        crupier.setFondos(crupier.getFondos() + crupier.getApuesta());
    }

    // EMPATE
    else {
        System.out.println("Empate. No se gana ni pierde nada.");
    }

    System.out.println("\nFondos actualizados:");
    System.out.println("Jugador: " + jugador.getFondos() + "€");
    System.out.println("Crupier: " + crupier.getFondos() + "€");
}

     //=================NUEVO MAZO PARA EL JUEGO=====================
    public void reiniciarMazo() {
        mazo = new Mazo();
    }
       // ================= VERIFICAR FONDOS =================
    private boolean verificarFondos() {
        if (jugador.getFondos() <= 0) {
            System.out.println("¡Te quedaste sin fondos! Has perdido el juego.");
            return false;
        } else if (crupier.getFondos() <= 0) {
            System.out.println("¡El crupier se quedó sin fondos! Has ganado el juego.");
            return false;
        }
        return true;
    }
    //=======APUESTA DE AMBOS=====
    private void Apostar() {

    System.out.println("Fondos del Jugador: " + jugador.getFondos() + "€");
    System.out.println("Fondos del Crupier: " + crupier.getFondos() + "€");

    int jugadorApuesta;
    int crupierApuesta;

    // ========= APUESTA DEL JUGADOR =========
    do {
        System.out.print("Jugador, ¿cuánto deseas apostar?: ");
        jugadorApuesta = sc.nextInt();

        if (jugadorApuesta <= 0) {
            System.out.println("No puedes apostar 0 o una cantidad negativa.");
        } 
        else if (jugadorApuesta > jugador.getFondos()) {
            System.out.println("No tienes fondos suficientes para esa apuesta.");
        }

    } while (jugadorApuesta <= 0 || jugadorApuesta > jugador.getFondos());


    // ========= APUESTA DEL CRUPIER =========
    do {
        System.out.print("Crupier, ¿cuánto deseas apostar?: ");
        crupierApuesta = sc.nextInt();

        if (crupierApuesta <= 0) {
            System.out.println("No puedes apostar 0 o una cantidad negativa.");
        }
        else if (crupierApuesta > crupier.getFondos()) {
            System.out.println("El crupier no tiene fondos suficientes para esa apuesta.");
        }

    } while (crupierApuesta <= 0 || crupierApuesta > crupier.getFondos());


    // ========= APUESTA FINAL =========
    apuesta = Math.min(jugadorApuesta, crupierApuesta);
    System.out.println("============APUESTAS TOTALES===============");
    System.out.println("El jugador apuesta: " + jugadorApuesta + "€");
    System.out.println("El crupier apuesta: " + crupierApuesta + "€");
    System.out.println(">>> LA APUESTA FINAL ES DE: " + apuesta + "€");
}

    }


