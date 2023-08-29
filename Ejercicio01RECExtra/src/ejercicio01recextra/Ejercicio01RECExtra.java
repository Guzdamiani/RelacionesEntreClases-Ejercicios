/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package ejercicio01recextra;

import ejercicio01recextra.entities.Perro;
import ejercicio01recextra.entities.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio01RECExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");;
        ArrayList<Persona> listaPersonas = new ArrayList();
        ArrayList<Perro> listaPerros = new ArrayList();

        crearPerros(listaPerros);

        System.out.println("");

        crearPersonas(listaPersonas);

        System.out.println(listaPerros.toString());
        System.out.println("");

        System.out.println("Adopción de perros:");
        System.out.println("");

        adoptarPerros(listaPerros, listaPersonas);

        System.out.println("");
        System.out.println(listaPersonas.toString());

    }

    public static void crearPerros(ArrayList<Perro> listaPerros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");;

        System.out.println("¿Cuántos perros desea ingresar?");
        int cantPerros = leer.nextInt();

        for (int i = 0; i < cantPerros; i++) {

            Perro p1 = new Perro();

            System.out.println("Ingrese el nombre del perro nº " + (i + 1));
            p1.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro nº " + (i + 1));
            p1.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro nº " + (i + 1));
            p1.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro nº " + (i + 1));
            p1.setTamanio(leer.next());
            p1.setAdoptado(false);

            listaPerros.add(p1);

            System.out.println("");
        }

    }

    public static void crearPersonas(ArrayList<Persona> listaPersonas) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");;

        System.out.println("¿Cuántas personas desea ingresar?");
        int cantPersonas = leer.nextInt();

        for (int i = 0; i < cantPersonas; i++) {

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

            System.out.println("");
        }

    }

    public static void adoptarPerros(ArrayList<Perro> listaPerros, ArrayList<Persona> listaPersonas) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");;

        for (int i = 0; i < listaPersonas.size(); i++) {

            System.out.println("¿Qué perro desea adoptar " + listaPersonas.get(i).getNombre() + "?");
            String nombrePerro = leer.next();
            boolean perroExiste = false;

            for (Perro perro : listaPerros) {

                if (perro.getNombre().equalsIgnoreCase(nombrePerro) && perro.isAdoptado() == false) {

                    perro.setAdoptado(true);
                    System.out.println("Se ha adoptado a " + perro.getNombre() + " con éxito!");
                    perroExiste = true;
                    listaPersonas.get(i).setPerro(perro);
                    break;

                } else if (perro.getNombre().equalsIgnoreCase(nombrePerro) && perro.isAdoptado() == true) {
                    System.out.println("");
                    System.out.println("Lamentablemente, el perro " + perro.getNombre() + " ya fue adoptado.");
                    perroExiste = true;
                    break;
                }
            }

            if (!perroExiste) {
                System.out.println("");
                System.out.println("El perro ingresado no existe, o su nombre no fue ingresado de forma correcta.");
            }
        }
    }
}
