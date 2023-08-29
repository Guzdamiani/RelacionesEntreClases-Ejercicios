/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio01rec;

import ejercicio01rec.entities.Perro;
import ejercicio01rec.entities.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio01REC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Perro p1 = new Perro("Troya", "Labrador", 7, "mediano");
        Perro p2 = new Perro("Tara", "Salchicha", 4, "pequeño");

        ArrayList<Persona> listaPersonas = new ArrayList();

        for (int i = 0; i < 2; i++) {

            Persona p = new Persona();

            System.out.println("Ingrese el nombre de la persona nº " + (i + 1));
            p.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona nº " + (i + 1));
            p.setApellido(leer.next());
            System.out.println("Ingrese la edad de la persona nº " + (i + 1));
            p.setEdad(leer.nextInt());
            System.out.println("Ingrese el documento de la persona nº " + (i + 1));
            p.setDocumento(leer.nextLong());
            
            listaPersonas.add(p);
        }
        
        listaPersonas.get(0).setPerro(p1);
        listaPersonas.get(1).setPerro(p2);
        
        System.out.println(listaPersonas.toString());
        

    }

}
