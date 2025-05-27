package autonoma.MascotaCorrelona.models;

import autonoma.MascotaCorrelona.wiews.VentanaMascota;

public class HiloMascota extends Thread {
    private final Mascota mascota;
    private final VentanaMascota ventana;

    public HiloMascota(Mascota mascota, VentanaMascota ventana) {
        this.mascota = mascota;
        this.ventana = ventana;
    }

    @Override
    public void run() {
        while (true) {
            mascota.moverHacia(ventana.getMouseX(), ventana.getMouseY());
            ventana.repaint();
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}