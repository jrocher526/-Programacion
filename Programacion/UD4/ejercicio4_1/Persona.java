package ejercicio4_1;

public class Persona {

	// Atributos
    private String nombre;
    private int edad;
    private double estatura;
    
    // Constructor
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    // Metodo para incrementar la edad en uno
    public void cumplirAños() {
        edad++; // Aumenta la edad en 1
    }
    
    // Metodo para incrementar la estatura segun un valor dado
    public void crecer(double incremento) {
        estatura += incremento; 
    }
    
    // Metodos getters y setters
    public String getNombre() {
        return nombre;
    }
  
    public void setNombre() {
    	this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void SetEdad() {
    	this.edad = edad;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    public void setEstatura() {
    	this.estatura = estatura;
    }
    
    // Metodo toString para representar a la persona como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura;
    }
}
