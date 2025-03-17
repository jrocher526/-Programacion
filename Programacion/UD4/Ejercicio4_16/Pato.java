package ejercicio4_16;

public class Pato extends Animal implements Nadador, Corredor, Volador {

	public Pato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void corredor() {
		System.out.println("El pato corre");
	}

	@Override
	public void nadador() {
		System.out.println("Nada en el rio");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Cuac cuac");
	}
	
	@Override
	public void volador() {
		System.out.println("Vuela alto");
	}
}
