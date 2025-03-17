package ejercicio4_16;

public class PrincipalMain {
	public static void main(String[] args) {

		// Creamos el Objeto
		Animal perro = new Perro("Mandy", 2);
		Animal pajaro = new Pajaro("loro", 5);
		Animal pez = new Pez("Nemo", 5);
		Animal pato = new Pato("Donalds", 1);
		
		// Convertimos los Animales a su tipo que corresponde
		Pajaro pajarito = (Pajaro) pajaro;
		Perro perrito = (Perro) perro;
		Pez peces = (Pez) pez;
		Pato patito = (Pato) pato;
		
		// Informacion de Animales
		
		// Perro
		perrito.mostrarInfo();
		perrito.corredor();
		System.out.println();
		
		// Pez
		peces.mostrarInfo();
		peces.nadador();
		System.out.println();
		
		// Pajaro
		pajarito.mostrarInfo();
		pajarito.volador();
		System.out.println();
		
		// Pato
		patito.mostrarInfo();
		patito.volador();
		patito.corredor();
		patito.nadador();
	}
}
