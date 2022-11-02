/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.interfazMenuClientes.opciones.ingreso;

import interfaz.interfazMenuClientes.*;
import interfaz.interfazMenuPrincipal.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Arturo
 */
public class InterIngresar extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public InterIngresar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setShape(new RoundRectangle2D.Double(0, 0, 1300, 1600, 50, 50));
        //this.setSize(300, 200);
    }

    //metodos Propios
    public void cerrarPrograma() {

        System.exit(0);

    }

    public void minimizarPrograma() {

        this.setState(this.ICONIFIED);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        botonAerolinea = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        panelOpcionesVentana = new javax.swing.JPanel();
        botonMinimizar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, -1, -1));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        botonAerolinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionAirline.png"))); // NOI18N
        botonAerolinea.setBorderPainted(false);
        botonAerolinea.setContentAreaFilled(false);
        botonAerolinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAerolineaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAerolineaMouseExited(evt);
            }
        });

        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionUsuarios.png"))); // NOI18N
        botonClientes.setBorderPainted(false);
        botonClientes.setContentAreaFilled(false);
        botonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonClientesMouseExited(evt);
            }
        });

        jLayeredPane1.setLayer(botonAerolinea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(botonClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(botonAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 340, 240));

        panelOpcionesVentana.setOpaque(false);

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baseTest2.png"))); // NOI18N
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

    private void botonClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMouseEntered
        // TODO add your handling code here:
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionUsuarios2.png")));
    }//GEN-LAST:event_botonClientesMouseEntered

    private void botonClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMouseExited
        // TODO add your handling code here:
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionUsuarios.png")));
    }//GEN-LAST:event_botonClientesMouseExited

    private void botonAerolineaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAerolineaMouseExited
        // TODO add your handling code here:
        botonAerolinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionAirline.png")));
    }//GEN-LAST:event_botonAerolineaMouseExited

    private void botonAerolineaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAerolineaMouseEntered
        // TODO add your handling code here:
        botonAerolinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opcionAirline2.png")));
    }//GEN-LAST:event_botonAerolineaMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterIngresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterIngresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAerolinea;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel panelOpcionesVentana;
    // End of variables declaration//GEN-END:variables
}
