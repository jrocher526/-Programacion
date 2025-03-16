package ejercicio4_4;

public class Hora {

	// Atributos 
    private int hora;
    private int minuto;
    private int segundo;
    
    // Constructor con parametros
    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    // Getter y setter para la hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    // Getter y setter para el minuto
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido.");
        }
    }

    // Getter y setter para el segundo
    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido.");
        }
    }

    // Método para mostrar la hora
    public void mostrarHora() {
        System.out.printf("Hora: %02d:%02d:%02d\n", hora, minuto, segundo);
    }

    // Método para avanzar n segundos
    public void avanzarSegundos(int n) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo + n;
        hora = (totalSegundos / 3600) % 24;
        minuto = (totalSegundos / 60) % 60;
        segundo = totalSegundos % 60;
    }
}
