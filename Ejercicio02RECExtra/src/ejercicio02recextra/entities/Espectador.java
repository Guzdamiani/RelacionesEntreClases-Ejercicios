/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02recextra.entities;

import ejercicio02recextra.enumeraciones.Nombre;

/**
 *
 * @author guzma
 */
public class Espectador {
    
    private Nombre nombre;
    private int edad;
    private int dinero;

    public Espectador() {
    }

    public Espectador(Nombre nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return " \n Espectador{" + "Nombre: " + nombre + ", Edad:" + edad + ", Dinero:" + dinero + '}';
    }
}
