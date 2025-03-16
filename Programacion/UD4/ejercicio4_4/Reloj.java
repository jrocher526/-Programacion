package ejercicio4_4;

import java.util.Scanner;

public class Reloj {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar hora, minuto, segundo y cantidad de segundos a avanzar
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Introduce el minuto (0-59): ");
        int minuto = scanner.nextInt();
        System.out.print("Introduce el segundo (0-59): ");
        int segundo = scanner.nextInt();
        
        System.out.print("Introduce el número de segundos a avanzar: ");
        int n = scanner.nextInt();
        
        // Crear el objeto Hora
        Hora horaActual = new Hora(hora, minuto, segundo);
        
        // Mostrar la hora inicial
        horaActual.mostrarHora();
        
        // Avanzar n segundos
        horaActual.avanzarSegundos(n);
        
        // Mostrar la hora después de avanzar
        System.out.println("Después de avanzar " + n + " segundos:");
        horaActual.mostrarHora();
    }
}

