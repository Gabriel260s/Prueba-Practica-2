/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebapractica2_gabrielalexis;

/**
 *
 * @author gabri
 */
public class Libro {
    String Nombre,Autor,dueño;
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

    @Override
    public String toString() {
        if(Disponible){
            return "ID=" + id + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Disponibilidad=" + "Esta disponible" + '}';
        }
        else{
            return "ID=" + id + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Disponibilidad=" + "El libro ha sido prestado" + ", dueño=" + dueño + '}';
        }
    }
    
    
    
    
}
