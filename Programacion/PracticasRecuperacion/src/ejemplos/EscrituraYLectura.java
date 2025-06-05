package ejemplos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraYLectura {
	public static void main(String[] args) throws IOException {

		FileOutputStream salida = null;
		FileInputStream entrada = null;
		
		try {
			// Salida - Escribimos en fichero
			File file = new File("C:\\Users\\1DAW2425-07\\Desktop\\ejemplo.bin");
			salida = new FileOutputStream(file);
			salida.write("hola".getBytes()); 
			
			// Salida - leemos ficheros
			entrada = new FileInputStream(file);
			
			// Manera 1 de imprimir 
			 System.out.println(new String (entrada.readAllBytes()));
			
			 // manera 2 de imprimir 
			 int leerByte;
	            while ((leerByte = entrada.read()) != -1) {
	                System.out.print((char) leerByte);
	            }

	           
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("Fichero no encontrado");
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (salida != null) salida.close();
	            if (entrada != null) entrada.close();
	        }
	    }
}
