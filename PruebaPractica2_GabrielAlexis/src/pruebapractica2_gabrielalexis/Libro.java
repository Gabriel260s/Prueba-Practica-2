/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebapractica2_gabrielalexis;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Libro {
    String Nombre, Autor, dueño;
    int id;
    boolean Disponible = true;

    public Libro(String Nombre, String Autor, String dueño, int id) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.dueño = dueño;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public static void agregarLibro(ArrayList<Libro> Disponibles, String nombreLibro, String Autor, int id) {
        Libro libro = new Libro(nombreLibro, Autor, "", id);
        Disponibles.add(libro);
        System.out.println("Libro agregado con exito");
    }

    public static void prestarLibro(ArrayList<Libro> Disponibles, ArrayList<Libro> prestados, String nombre, int pos) {
        if (pos < Disponibles.size()) {
            Disponibles.get(pos).setDisponible(false);
            Disponibles.get(pos).setDueño(nombre);
            prestados.add(Disponibles.get(pos));
            Disponibles.remove(pos);
            System.out.println("Libro prestado con exito");
            System.out.println("Tus libros prestados son: ");

        } else {
            System.out.println("Posicion no valida");
        }
    }

    @Override
    public String toString() {
        if (Disponible) {
            return "ID=" + id + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Disponibilidad=" + "Esta disponible"
                    + '}';
        } else {
            return "ID=" + id + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Disponibilidad="
                    + "El libro ha sido prestado" + ", dueño=" + dueño + '}';
        }
    }

}
