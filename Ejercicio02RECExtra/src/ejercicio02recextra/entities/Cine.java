/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02recextra.entities;

import ejercicio02recextra.enumeraciones.Letra;
import ejercicio02recextra.enumeraciones.Nombre;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Cine {

    private Pelicula pelicula;
    private int precio;
    private ArrayList<Espectador> listaEspectadores = new ArrayList();
    private final boolean[][] asientos = new boolean[8][6];

    public Cine() {
    }

    public Cine(Pelicula pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public void setListaEspectadores(ArrayList<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public void crearListaEspectadores() {

        Random rand = new Random();

        for (int i = 0; i < 48; i++) {

            //Por cada iteración se crea un espectador con un nombre aleatorio(de los que se encuentran en el enum Nombre), una cantidad de dinero aleatoria y una edad aleatoria.
            Nombre nombreAleatorio = Nombre.values()[rand.nextInt(Nombre.values().length)];
            int dineroAleatorio = rand.nextInt(401) + 100;
            int edadAleatoria = rand.nextInt(60) + 8;

            Espectador e = new Espectador(nombreAleatorio, edadAleatoria, dineroAleatorio);

            listaEspectadores.add(e);

        }
    }

    public void crearPelicula() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula p = new Pelicula();

        System.out.println("");
        System.out.println("Ingrese el nombre de la pelicula:");
        p.setNombre(leer.next());
        System.out.println("Ingrese el nombre del director:");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película en minutos:");
        p.setDuracion(leer.nextInt());
        System.out.println("Ingrese la edad mínima para poder ver la película:");
        p.setEdadMinima(leer.nextInt());

        System.out.println("");
        System.out.println("Película ingresada con éxito");

        pelicula = p;
    }

    public void llenarSala() {

        int rechazados = 0; //se inicializa un contador para saber cuantas personas no pudieron ingresar por su edad
        
        for (Espectador espectador : listaEspectadores) { //se itera sobre la lista de Espectadores para asignarle un asiento, siempre y cuando cumplan con las condiciones

            if (espectador.getDinero() >= precio && espectador.getEdad() >= pelicula.getEdadMinima()) { // condicion de tener suficiente dinero
                
                int posI;
                int posJ;
                boolean seOcupo = false;
                
                do {
                    
                   posI = (int) (Math.random()*8);
                   posJ = (int) (Math.random()*6);
                    
                    if (asientos[posI][posJ] == false) {
                        
                        asientos[posI][posJ] = true;
                        seOcupo = true;
                    }
                    
                } while (!seOcupo);
                
            } else {
                rechazados++;
            }
        }
        
        System.out.println(rechazados+" personas no pudieron ingresar por no tener edad suficiente.");
    }
    
    public void mostrarSala(){
        
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                String ocupado;
                
                if (asientos[i][j]) {
                    ocupado = "X";
                } else {
                    ocupado = " ";
                }
                
                System.out.print("| "+(8-i)+Letra.values()[j]+ocupado+" |");
            }
            
            System.out.println("");
        }
       
    }
    
}
