package ejercicio6;

import java.util.Comparator;

public class ComparadorCompleto implements Comparator<Persona> {
    
	@Override
    public int compare(Persona p1, Persona p2) {
        
		// Si no tienen apellido, se consideran como ""
        String apellido1 = (p1.getApellido() == null) ? "" : p1.getApellido();
        String apellido2 = (p2.getApellido() == null) ? "" : p2.getApellido();

        int compApellido = apellido1.compareTo(apellido2);
        if (compApellido != 0) return compApellido;

        int compNombre = p1.getNombre().compareTo(p2.getNombre());
        if (compNombre != 0) return compNombre;

        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

