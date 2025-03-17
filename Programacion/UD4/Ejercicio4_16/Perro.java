package ejercicio4_16;

public class Perro extends Animal implements Corredor {

	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("GUAU GUAU");
	}
	
	@Override
	public void corredor() {
		System.out.println("El perro Corre");
	}

	
}
