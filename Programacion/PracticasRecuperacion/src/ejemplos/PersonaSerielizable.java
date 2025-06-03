package ejemplos;

import java.io.Serializable;

public class PersonaSerielizable implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;

	public PersonaSerielizable(String nombre) {
		this.nombre = nombre;
	}

	public void Persona(String nombre) {
	        this.nombre = nombre;
	    }

	public String getNombre() {
		return nombre;
	}
}
