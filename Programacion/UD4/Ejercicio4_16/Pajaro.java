package ejercicio4_16;

public class Pajaro extends Animal implements Volador  {

	public Pajaro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Fly, Fly");
	}

	@Override
	public void volador() {
		System.out.println("El pajaro vuela");
	}

	
	
}
