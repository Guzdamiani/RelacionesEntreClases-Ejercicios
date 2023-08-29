/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver

Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package ejercicio02rec.entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Juego {

    private ArrayList<Jugador> listaJugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> listaJugadores, Revolver r) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", revolver=" + revolver + '}';
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        listaJugadores = jugadores;
        revolver = r;

    }

    public void ronda() {

        Scanner leer = new Scanner(System.in);

        boolean disparoAgua = false;
        int contadorRondas = 1;

        do {

            System.out.println("");
            System.out.println("Ronda nº " + contadorRondas);

            for (int i = 0; i < listaJugadores.size(); i++) {
                System.out.println("");
                System.out.println("Es el turno del jugador " + listaJugadores.get(i).getNombre());
                System.out.println("Presione enter para disparar. Suerte...");
                leer.nextLine();
                System.out.println("");

                disparoAgua = listaJugadores.get(i).disparo(revolver);

                if (disparoAgua) {
                    System.out.println("Splash!");
                    System.out.println("El jugador " + listaJugadores.get(i).getNombre() + " ha sido mojado!");
                    break;

                } else {
                    System.out.println("La pistola ha disparado aire. Has tenido suerte esta vez...");
                    System.out.println("");
                    System.out.println("Siguiente jugador:");
                    System.out.println("");
                }

            }

            if (!disparoAgua) {
                System.out.println("");
                System.out.println("Ha finalizado la ronda º " + contadorRondas);

                contadorRondas++;

            }

        } while (!disparoAgua);

    }

}
