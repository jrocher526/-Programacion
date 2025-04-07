package ejercicio6;

public class Persona implements Comparable<Persona> {

    public enum Sexo {
        HOMBRE, MUJER
    }

    // Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double estatura;
    protected Sexo sexo;

    // Constructor
    public Persona(String nombre, String apellido, int edad, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Constructor sin apellido
    public Persona(String nombre, int edad, double estatura) {
        this(nombre, null, edad, estatura);
    }

    @Override
    public int compareTo(Persona otra) {
        return this.nombre.compareTo(otra.nombre);
    }

    // Métodos GET y SET
    public String getNombre() { 
    	return nombre; }
    
    public void setNombre(String nombre) { 
    	this.nombre = nombre; }

    public String getApellido() { 
    	return apellido; }
    
    public void setApellido(String apellido) { 
    	this.apellido = apellido; }

    public int getEdad() { 
    	return edad; }
    
    public void setEdad(int edad) { 
    	this.edad = edad; }
}

