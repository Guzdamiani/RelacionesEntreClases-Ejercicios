/*
 Clase Revolver de agua: 

Esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

 */
package ejercicio02rec.entities;

/**
 *
 * @author guzma
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {

        posicionActual = ((int) (Math.random() * 6) + 1);
        posicionAgua = ((int) (Math.random() * 6) + 1);

    }

    public boolean mojar() {

        boolean mojar;

        if (posicionActual == posicionAgua) {
            mojar = true;
        } else {
            mojar = false;
        }

        return mojar;
    }

    public void siguienteChorro() {

        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual++;
        }

    }
}
