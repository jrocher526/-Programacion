package ejemplos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {
	    public static void main(String[] args) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
	        	PersonaSerielizable p = (PersonaSerielizable) ois.readObject();
	            System.out.println("Nombre deserializado: " + p.getNombre());
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


