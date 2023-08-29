/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03rec.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Baraja {

    private ArrayList<Carta> mazo = new ArrayList();
    private ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazo=" + mazo + '}';
    }

    public void llenarBaraja() {

        mazo.clear();

        String palo = null;

        for (int i = 0; i < 4; i++) {

            switch (i) {
                case 0:
                    palo = "Espada";
                    break;
                case 1:
                    palo = "Basto";
                    break;
                case 2:
                    palo = "Copa";
                    break;
                case 3:
                    palo = "Oro";
                    break;
            }

            for (int j = 1; j <= 12; j++) {

                if (j != 8 && j != 9) {

                    Carta c = new Carta(j, palo);

                    mazo.add(c);
                }

            }
        }
    }

    public void barajar() {

        Collections.shuffle(mazo);

    }

    public void siguienteCarta() {

        Carta c1 = mazo.get(0);

        System.out.println("La siguiente carta es: " + c1.toString());

        mazo.remove(c1);

        monton.add(c1);

    }

    public void cartasDisponibles() {

        System.out.println("Quedan " + mazo.size() + " cartas disponibles.");
    }

    public void darCartas() {

        Scanner leer = new Scanner(System.in);

        ArrayList<Carta> cartasDadas = new ArrayList();

        System.out.println("¿Cuántas cartas desea recibir?");
        int cantidad = leer.nextInt();

        if (cantidad <= mazo.size()) {

            Iterator<Carta> iterator = mazo.iterator();
            int contador = 0;

            while (iterator.hasNext() && contador < cantidad) {

                Carta c1 = iterator.next();
                System.out.println(c1.toString());
                iterator.remove(); // Elimina la carta del mazo usando el iterador
                monton.add(c1);
                contador++;
            }
            
        } else {

            System.out.println("No se puede realizar la acción, ya que en el mazo hay menos de " + cantidad + " cartas.");
        }
    }

    public void cartasMonton() {

        System.out.println("Al momento hay " + monton.size() + " cartas en el montón.");
        System.out.println("");
        System.out.println("Las cartas son:");

        System.out.println(monton.toString());
        System.out.println("");
    }

    public void mostrarBaraja() {

        System.out.println("");
        System.out.println("Cartas que aún están en la baraja:");
        System.out.println(mazo.toString());

    }

}
