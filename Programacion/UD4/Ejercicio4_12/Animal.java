package ejercicio4_12;

abstract class Animal {

	// Atributos
	protected String nombre;
	protected int edad;
	
	// Constructor para inicializar atributos
	public Animal(String nombre, int edad) {
		this.nombre = nombre; 
		this.edad = edad;
	}
	
	// Metodos abstractos
	
	public abstract void hacerSonido();
	public abstract String moverse();
	
	// Metodo concreto
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        hacerSonido();
        System.out.println("Se mueve: " + moverse());
	}
	
	// Get y Set
	 
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre() {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad() {
		this.edad = edad;
	}
	
}
