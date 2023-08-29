/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package ejercicio03rec;

import ejercicio03rec.entities.Baraja;
import ejercicio03rec.entities.Carta;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio03REC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Baraja mazo = new Baraja();

        String eleccion;

        do {

            System.out.println("");
            System.out.println("Menu:");
            System.out.println("");
            System.out.println("1. Llenar Baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Pedir siguiente carta");
            System.out.println("4. Cartas disponibles");
            System.out.println("5. Dar cartas");
            System.out.println("6. Cartas monton");
            System.out.println("7. Mostrar baraja");
            System.out.println("8. Salir");
            System.out.println("");
            System.out.println("Elija la opción deseada:");
            System.out.println("");

            eleccion = leer.next();

            switch (eleccion) {
                case "1":
                    mazo.llenarBaraja();
                    System.out.println("");
                    System.out.println("La baraja se ha llenado con éxito.");
                    break;
                case "2":
                    mazo.barajar();
                    System.out.println("");
                    System.out.println("Se ha barajado con éxito.");
                    break;
                case "3":
                    mazo.siguienteCarta();
                    break;
                case "4":
                    mazo.cartasDisponibles();
                    break;
                case "5":
                    mazo.darCartas();
                    break;
                case "6":
                    mazo.cartasMonton();
                    break;
                case "7":
                    mazo.mostrarBaraja();
                    break;
                case "8":
                    System.out.println("Has salido con éxito!");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (!eleccion.equalsIgnoreCase("8"));

        

    }

}
