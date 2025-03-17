package ejercicio4_16;

public class Pez extends Animal implements Nadador {

	public Pez(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Glu, Glu");
	}
	
	@Override
	public void nadador() {
		System.out.println("El pez nada");
	}

}
