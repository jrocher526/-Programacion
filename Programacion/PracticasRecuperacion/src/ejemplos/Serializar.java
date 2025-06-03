package ejemplos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializar {
	    public static void main(String[] args) {
	    	PersonaSerielizable p = new PersonaSerielizable("Albert Einstein");

	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
	            oos.writeObject(p);
	            System.out.println("Objeto serializado en persona.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


