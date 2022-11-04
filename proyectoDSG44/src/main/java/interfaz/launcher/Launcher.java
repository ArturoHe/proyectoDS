package interfaz.launcher;

import java.awt.BorderLayout;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;
import logica.Datos;

/**
 *
 * @author Arturo
 */
public class Launcher extends javax.swing.JFrame {

    private Datos datosGeneral = new Datos();

    /**
     * Creates new form menuPrincipal
     */
    public Launcher() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setShape(new RoundRectangle2D.Double(0, 0, 1300, 1600, 50, 50));
        iniciarPrograma();
        datosGeneral.iniciarDatosUsuarios();

    }

    //metodos Propios
    public void cerrarPrograma() {

        System.exit(0);

    }

    public void minimizarPrograma() {

        this.setState(this.ICONIFIED);

    }

    public void iniciarPrograma() {
        PrincipalOpciones inicio = new PrincipalOpciones();
        inicio.setSize(1300, 570);
        inicio.setLocation(0, 0);

        base.removeAll();
        base.add(inicio, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();

    }

    public Datos getDatosGeneral() {
        return datosGeneral;
    }

    public void setDatosGeneral(Datos datosGeneral) {
        this.datosGeneral = datosGeneral;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpcionesVentana = new javax.swing.JPanel();
        botonMinimizar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        base = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonMinimizar.png"))); // NOI18N
        botonMinimizar.setBorderPainted(false);
        botonMinimizar.setContentAreaFilled(false);
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseExited(evt);
            }
        });

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonCerrar.png"))); // NOI18N
        botonCerrar.setBorderPainted(false);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setPreferredSize(new java.awt.Dimension(39, 22));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesVentanaLayout = new javax.swing.GroupLayout(panelOpcionesVentana);
        panelOpcionesVentana.setLayout(panelOpcionesVentanaLayout);
        panelOpcionesVentanaLayout.setHorizontalGroup(
            panelOpcionesVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesVentanaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(botonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelOpcionesVentanaLayout.setVerticalGroup(
            panelOpcionesVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesVentanaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panelOpcionesVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpcionesVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 120, 30));

        base.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1300, 570));

        fondo.setBackground(new java.awt.Color(204, 255, 153));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/filtro.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        // TODO add your handling code here:

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonCerrar.png")));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        // TODO add your handling code here:

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonCerrar2.png")));
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        // TODO add your handling code here:
        cerrarPrograma();
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseExited
        // TODO add your handling code here:

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonMinimizar.png")));
    }//GEN-LAST:event_botonMinimizarMouseExited

    private void botonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseEntered
        // TODO add your handling code here:

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/botonMinimizar2.png")));
    }//GEN-LAST:event_botonMinimizarMouseEntered

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        // TODO add your handling code here:
        minimizarPrograma();
    }//GEN-LAST:event_botonMinimizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panelOpcionesVentana;
    // End of variables declaration//GEN-END:variables

}
