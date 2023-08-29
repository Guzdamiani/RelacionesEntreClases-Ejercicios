/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

- Revolver de agua
- Jugador
- Juego
 */
package ejercicio02rec;

import ejercicio02rec.entities.Juego;
import ejercicio02rec.entities.Jugador;
import ejercicio02rec.entities.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio02REC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        System.out.println("Bienvenido a la ruleta rusa de agua!");
        System.out.println("");
        
        System.out.println("¿Cuántos jugadores desean participar? (Max 6/Min 1)");
        int jugadores = leer.nextInt();
        
        if (jugadores > 6) {
            jugadores = 6;
        } else if (jugadores < 1){
            jugadores = 1;
        }
        
        for (int i = 0; i < jugadores; i++) {
            
            Jugador j = new Jugador();
            
            System.out.println("Ingrese el nombre del jugador " + (i+1));
            j.setNombre(leer.next());

            j.setId(i+1);
            j.setMojado(false);
            
            listaJugadores.add(j);
        }
        
        System.out.println(listaJugadores.toString());
        
        Revolver r = new Revolver();
        r.llenarRevolver();
        
        Juego j = new Juego();
        j.llenarJuego(listaJugadores, r);
        
        j.ronda();
        
        System.out.println("");
        System.out.println("Ha terminado la ronda");
    }
    
}
