package autonoma.RelojReto.models;

/**
 * Esta clase simula un reloj con horas, minutos y segundos.
 * Utiliza hilos para actualizar de manera concurrente las horas, minutos y segundos.
 * 
 * El reloj actualiza los segundos cada 1 segundo, los minutos cada 60 segundos y las horas cada 60 minutos.
 * 
 * @author Luisa Fernanda Henao Posada
 * @since 03052025
 * @version 1.0.0
 * 
 */
public class RelojConcurrente {

    /** Variable que guarda las horas actuales del reloj. */
    private int horas = 0;

    /** Variable que guarda los minutos actuales del reloj. */
    private int minutos = 0;

    /** Variable que guarda los segundos actuales del reloj. */
    private int segundos = 0;

    /**
     * Obtiene las horas actuales del reloj.
     * 
     * @return El valor de las horas actuales.
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Obtiene los minutos actuales del reloj.
     * 
     * @return El valor de los minutos actuales.
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Obtiene los segundos actuales del reloj.
     * 
     * @return El valor de los segundos actuales.
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Inicia los hilos para actualizar los segundos, minutos y horas de manera concurrente.
     * Cada hilo actualiza su respectiva unidad de tiempo de forma independiente:
     * <ul>
     *   <li>El hilo de segundos incrementa cada 1 segundo.</li>
     *   <li>El hilo de minutos incrementa cada 60 segundos.</li>
     *   <li>El hilo de horas incrementa cada 60 minutos.</li>
     * </ul>
     */
    public void iniciar() {

        // Hilo para los segundos
        Thread hiloSegundos = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000); // Esperar 1 segundo
                        segundos++; // Incrementar los segundos
                        if (segundos >= 60) {
                            segundos = 0; // Si los segundos alcanzan 60, se reinician
                        }
                        imprimirHora(); // Imprimir la hora actual
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // Si ocurre una excepción, se imprime el error
                    }
                }
            }
        });

        // Hilo para los minutos
        Thread hiloMinutos = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(60000); // Esperar 60 segundos (1 minuto)
                        if (segundos == 0) {
                            minutos++; // Incrementar los minutos cuando los segundos sean 0
                            if (minutos >= 60) {
                                minutos = 0; // Si los minutos alcanzan 60, se reinician
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // Si ocurre una excepción, se imprime el error
                    }
                }
            }
        });

        // Hilo para las horas
        Thread hiloHoras = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3600000); // Esperar 60 minutos (1 hora)
                        if (minutos == 0 && segundos == 0) {
                            horas++; // Incrementar las horas cuando los minutos y segundos sean 0
                            if (horas >= 24) {
                                horas = 0; // Si las horas alcanzan 24, se reinician
                            }
                        }
                    } catch (InterruptedException e) {
                        // No se maneja la excepción de forma explícita aquí.
                    }
                }
            }
        });

        // Iniciar los tres hilos
        hiloSegundos.start();
        hiloMinutos.start();
        hiloHoras.start();
    }

    /**
     * Imprime la hora actual en formato HH:MM:SS.
     * Este método se llama cada vez que se actualiza el valor de los segundos.
     */
    private void imprimirHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
