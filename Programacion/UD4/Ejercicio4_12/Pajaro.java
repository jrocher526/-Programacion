package ejercicio4_12;

public class Pajaro extends Animal {

	public Pajaro(String nombre, int edad, String volar) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Pio, Pio");
	}

	@Override
	public String moverse() {
		return "Dando vueltas en el aire";
	}
}
