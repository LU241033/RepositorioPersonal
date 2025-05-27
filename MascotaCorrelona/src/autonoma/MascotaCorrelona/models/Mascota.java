package autonoma.MascotaCorrelona.models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


///***

public class Mascota {
    int x, y;
    private final int velocidad = 2;
    private final int ancho = 50, alto = 50;
    private Image imagen;

    public Mascota(int x, int y) {
        this.x = x;
        this.y = y;

        try {
            imagen = new ImageIcon(getClass().getResource("/autonoma/MascotaCorrelona/images/GatoCorrelon.png")).getImage();
        } catch (NullPointerException e) {
            System.err.println("⚠️ No se pudo cargar la imagen de la mascota. Verifica la ruta.");
            imagen = null;
        }
    }

   public void moverHacia(int objetivoX, int objetivoY) {
    if (x < objetivoX) x += velocidad;
    if (x > objetivoX) x -= velocidad;
    if (y < objetivoY) y += velocidad;
    if (y > objetivoY) y -= velocidad;

    // Restringir para que no se salga del fondo
    if (x < 0) x = 0;
    if (y < 0) y = 0;
    if (x > 600 - ancho) x = 600 - ancho;
    if (y > 400 - alto) y = 400 - alto;
}


    public void dibujar(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, x, y, ancho, alto, null);
        } else {
            g.setColor(Color.RED);
            g.fillOval(x, y, ancho, alto);
        }
    }
}
