package proyecto;

import java.util.*;

public class GestorUsuarios {
    private List<Usuario> listaUsuarios;
    private Map<String, Usuario> mapaUsuarios;

    public GestorUsuarios() {
        listaUsuarios = new ArrayList<>();
        mapaUsuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario u) {
        listaUsuarios.add(u);
        mapaUsuarios.put(u.getDni(), u);
    }

    public void mostrarOrdenadosPorPuntuacion() {
        List<Usuario> copia = new ArrayList<>(listaUsuarios);
        Collections.sort(copia);
        for (Usuario u : copia) {
            System.out.println(u);
        }
    }

    public Usuario buscarPorDni(String dni) {
        return mapaUsuarios.get(dni);
    }

    public void recorrerConIterador() {
        Iterator<Usuario> it = listaUsuarios.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
