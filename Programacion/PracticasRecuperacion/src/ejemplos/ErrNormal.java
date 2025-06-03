package ejemplos;

import java.util.Scanner;

public class ErrNormal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("introduce tu nombre");
		String nombre = sc.next();
		
		if (nombre.equals("jhonal"))
		System.err.println("Nombre incorrecto");
		
	}

}
