/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica2_gabrielalexis;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class PruebaPractica2_GabrielAlexis {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static ArrayList<Libro> Disponibles = new ArrayList<Libro>();
    static ArrayList<Libro> prestados = new ArrayList<Libro>();

    public static void main(String[] args) {
        Libro libro4 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "", 101);
        Libro libro2 = new Libro("El hobbit", "J.R.R. Tolkien", "", 102);
        Libro libro3 = new Libro("El Silmarillion", "J.R.R. Tolkien", "", 103);
        Disponibles.add(libro4);
        Disponibles.add(libro2);
        Disponibles.add(libro3);
        int opt = 0;
        while (opt != 7) {
            System.out.println(
                    "\n1. Agregar libro\n2. Prestar libro\n3. Regresar libro\n4. Buscar libro\n5. Mostrar libros disponibles\n6. Mostrar libros prestados\n7. Salir\nElije una opcion:\n");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del libro a agregar:");
                    input.nextLine();
                    String nombreLibro = input.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String Autor = input.nextLine();
                    int id = rand.nextInt(100, 1000);
                    Libro.agregarLibro(Disponibles, nombreLibro, Autor, id);
                    break;
                case 2:
                    System.out.println("Los libros disponibles son: ");
                    mostrarLibros(Disponibles);
                    System.out.println("Ingrese su nombre:");
                    input.nextLine();
                    String nombre = input.nextLine();
                    System.out.println("Ingrese la posicion del libro que se prestara: ");
                    int pos = input.nextInt();
                    Libro.prestarLibro(Disponibles, prestados, nombre, pos);
                    mostrarLibros(prestados);
                    break;
                case 3:
                    System.out.println("Los libros prestados son: ");
                    mostrarLibros(prestados);
                    System.out.println("Ingrese la posicion del libro a regresar: ");
                    int pos2 = input.nextInt();
                    if (pos2 < prestados.size()) {
                        prestados.get(pos2).setDisponible(true);
                        prestados.get(pos2).setDueño("");
                        Disponibles.add(prestados.get(pos2));
                        prestados.remove(pos2);
                    } else {
                        System.out.println("Posicion no valida");
                    }
                    System.out.println("Libro regresado con exito");

                    break;
                case 4:
                    System.out.println("Ingrese el nombre del libro a buscar:  ");
                    input.nextLine();
                    String nombreLibro2 = input.nextLine();
                    for (int i = 0; i < Disponibles.size(); i++) {
                        if (Disponibles.get(i).getNombre().equalsIgnoreCase(nombreLibro2)) {
                            System.out.println(Disponibles.get(i).toString());
                        }
                    }
                    break;
                case 5:
                    if (Disponibles.isEmpty()) {
                        System.out.println("No hay libros disponibles");
                    } else {
                        mostrarLibros(Disponibles);
                    }
                    break;
                case 6:
                    if (prestados.isEmpty()) {
                        System.out.println("No hay libros prestados");
                    } else {
                        mostrarLibros(prestados);
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static void mostrarLibros(ArrayList<Libro> libros) {
        for (int i = 0; i < libros.size(); i++) {
            String mens = libros.get(i).toString();
            System.out.println(i + " " + mens);
        }
    }

}
