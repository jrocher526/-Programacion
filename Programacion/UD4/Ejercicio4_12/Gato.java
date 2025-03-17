package ejercicio4_12;

public class Gato extends Animal {

	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Miau Miau");
	}

	@Override
	public String moverse() {
		return "Se mueve por el techo";
	}

	
	
}
