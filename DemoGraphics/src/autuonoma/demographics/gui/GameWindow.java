package autuonoma.demographics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 * @author Luisa Fernanda Henao
 */
public class GameWindow extends javax.swing.JFrame {
    public GameWindow() {
        initComponents();
        
    }
    /**
     * @param g
     * @param 
     */
    @Override
public void paint(Graphics g) {
    super.paint(g); 
    drawHouseScene(g);  

    g.setColor(Color.RED);
    g.fillRect(400, 50, 100 , 100); 

    g.setColor(Color.BLUE);
    g.fillOval(420, 70 , 20 , 20);
    g.fillOval(460, 70 , 20 , 20); 

    g.setColor(Color.MAGENTA);
    g.fill3DRect(390, 160, 120, 150, rootPaneCheckingEnabled); 

    g.setColor(Color.BLACK);
    g.drawLine(350, 200, 390, 180); 
    g.drawLine(510, 180, 550, 200); 

    g.setColor(Color.BLUE);
    g.fillRect(410, 310 , 20, 50); 
    g.fillRect(470, 310 , 20, 50); 

}
    private void drawHouseScene(Graphics g) {
    g.setColor(Color.ORANGE);
    g.fillRect(100, 150, 200, 150);

    g.setColor(Color.RED);
    int[] xPoints = {100, 200, 300};
    int[] yPoints = {150, 50, 150};
    g.fillPolygon(xPoints, yPoints, 3);

    g.setColor(new Color(139, 69, 19));
    g.fillRect(175, 220, 50, 80);

    g.setColor(Color.CYAN);
    g.fillRect(120, 170, 30, 30);
    g.fillRect(250, 170, 30, 30);

    g.setColor(new Color(34, 139, 34)); 
    g.fillOval(50, 180, 50, 50);
    g.setColor(new Color(139, 69, 19));
    g.fillRect(65, 230, 20, 50);

    g.setColor(Color.YELLOW);
    g.fillOval(320, 50, 50, 50);
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(100, 100));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    switch (evt.getKeyCode()){
        case KeyEvent.VK_Q -> {
            System.exit(0);
                {
                }
            }
}
    }//GEN-LAST:event_formKeyPressed
public static void main (String args[]){
        GameWindow window = new GameWindow();
        window.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        window.setVisible(true);
            }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
