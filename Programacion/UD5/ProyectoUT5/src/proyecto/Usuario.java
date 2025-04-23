package proyecto;

public class Usuario implements Comparable<Usuario> {
    private String nombre;
    private String dni;
    private int edad;
    private double puntuacionMedia;

    public Usuario(String nombre, String dni, int edad, double puntuacionMedia) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.puntuacionMedia = puntuacionMedia;
    }

    public String getDni() { return dni; }
    public double getPuntuacionMedia() { return puntuacionMedia; }

    @Override
    public int compareTo(Usuario otro) {
        return Double.compare(otro.puntuacionMedia, this.puntuacionMedia); // Descendente
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - Edad: " + edad + " - Puntuación: " + puntuacionMedia;
    }
}
