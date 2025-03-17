package ejercicio4_12;

public class Perro extends Animal {

	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("GUAU GUAU");
	}

	@Override
	public String moverse() {
		return "Juega en el parque";
	}

	
}
