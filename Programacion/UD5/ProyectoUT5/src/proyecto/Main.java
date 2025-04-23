package proyecto;

public class Main {
    public static void main(String[] args) {
        GestorUsuarios gestor = new GestorUsuarios();

        gestor.agregarUsuario(new Usuario("Ana", "12345678A", 25, 88.5));
        gestor.agregarUsuario(new Usuario("Luis", "23456789B", 30, 91.2));
        gestor.agregarUsuario(new Usuario("Marta", "34567890C", 22, 77.9));

        System.out.println("🧾 Todos los usuarios (iterador):");
        gestor.recorrerConIterador();

        System.out.println("\n🏆 Ordenados por puntuación:");
        gestor.mostrarOrdenadosPorPuntuacion();

        System.out.println("\n🔍 Búsqueda por DNI:");
        System.out.println(gestor.buscarPorDni("23456789B"));
    }
}

