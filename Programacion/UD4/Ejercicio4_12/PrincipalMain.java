package ejercicio4_12;

public class PrincipalMain {
	public static void main(String[] args) {

		Animal perro = new Perro("Mandy", 2);
		Animal gato = new Gato("Misu", 5);
		Animal animal = new Pajaro("Loro", 5, "fly");
		Pajaro pajaro = (Pajaro) animal;
		
		perro.mostrarInfo();
		System.out.println();
		pajaro.mostrarInfo();
		System.out.println();
		gato.mostrarInfo();
	}

}
