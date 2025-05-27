
package autonoma.MascotaCorrelona.wiews;

import autonoma.MascotaCorrelona.models.HiloMascota;
import autonoma.MascotaCorrelona.models.Mascota;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;



/**
 *
 * @author Luisa Fernanda Henao
 */
public class VentanaMascota extends javax.swing.JFrame {

    private Mascota mascota;
    private int mouseX = 100, mouseY = 100;

    
    public VentanaMascota() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mascota Correlona");
        setSize(600, 400);
        setLocationRelativeTo(null);
        mascota = new Mascota(100, 100);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        new HiloMascota(mascota, this).start();
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (mascota != null) {
            mascota.dibujar(g);
        }
    }                                    
  public void refresh() {
        repaint();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Cielo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cielo.setBackground(new java.awt.Color(51, 255, 255));
        Cielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CieloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cielo, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cielo, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CieloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CieloActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cielo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
