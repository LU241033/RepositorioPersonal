package autonoma.RelojReto.main;
import autonoma.RelojReto.models.RelojConcurrente;

/**
 * Clase principal que ejecuta el reloj concurrente.
 * Esta clase contiene el método principal que inicia el reloj concurrente.
 * El reloj se actualiza en tres hilos separados para gestionar las horas, minutos y segundos.
 * 
 * @author Luisa Fernanda Henao
 */
public class RelojConcurrenteMain {

    /**
     * Método principal que inicia la ejecución del reloj concurrente.
     * Crea una instancia del reloj y llama al método para comenzar
     * la actualización concurrente de horas, minutos y segundos.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en esta clase).
     */
    public static void main(String[] args) {
        // Crear una nueva instancia de RelojConcurrente
        RelojConcurrente relojConcurrente = new RelojConcurrente();
        
        // Iniciar la actualización concurrente del reloj
        relojConcurrente.iniciar();
    }
}
