package ejercicio4_6;

public class FiestaModificada {
	public static void main(String[] args) {
		// Creamos personas usando el enumerado Sexo
		PersonaModificada persona1 = new PersonaModificada("Juan", 25, 1.75, Sexo.HOMBRE);
		PersonaModificada persona2 = new PersonaModificada("Ana", 30, 1.60, Sexo.MUJER);

		// Mostramos la información de las personas
		persona1.imprimirInfo();
		persona2.imprimirInfo();
	}
}
