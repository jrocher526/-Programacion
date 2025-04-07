package ejercicio6;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getApellido() == null && p2.getApellido() == null) return 0;
        if (p1.getApellido() == null) return -1;
        if (p2.getApellido() == null) return 1;
        return p1.getApellido().compareTo(p2.getApellido());
    }
}
