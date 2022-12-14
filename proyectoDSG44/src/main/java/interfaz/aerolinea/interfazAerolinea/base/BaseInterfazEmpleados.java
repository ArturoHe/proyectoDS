/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.aerolinea.interfazAerolinea.base;

import interfaz.aerolinea.interfazAerolinea.opciones.InterProveedores;
import interfaz.aerolinea.interfazAerolinea.opciones.MiInfoEmpleados;
import interfaz.aerolinea.interfazAerolinea.opciones.PanelBaseVehiculos;
import interfaz.launcher.PrincipalOpciones;
import interfaz.usuario.interfazUsuario.*;
import java.awt.BorderLayout;

/**
 *
 * @author Arturo
 */
public class BaseInterfazEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form BaseInterfazUsuario
     */
    public BaseInterfazEmpleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        panelData = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        botonInfo = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonVuelo = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        panelDesconectar = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        base.setBackground(new java.awt.Color(255, 255, 153));
        base.setMaximumSize(new java.awt.Dimension(1300, 570));
        base.setMinimumSize(new java.awt.Dimension(1300, 570));
        base.setOpaque(false);
        base.setPreferredSize(new java.awt.Dimension(1300, 570));

        panelData.setMaximumSize(new java.awt.Dimension(1010, 558));
        panelData.setMinimumSize(new java.awt.Dimension(1010, 558));
        panelData.setOpaque(false);
        panelData.setPreferredSize(new java.awt.Dimension(1010, 558));
        panelData.setLayout(new java.awt.BorderLayout());

        panelOpciones.setOpaque(false);
        panelOpciones.setPreferredSize(new java.awt.Dimension(260, 160));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInfo.setText("Mi informacion");
        botonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInfoActionPerformed(evt);
            }
        });
        panelOpciones.add(botonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, -1));

        botonProveedores.setText("Proveedores");
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });
        panelOpciones.add(botonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, -1));

        botonVuelo.setText("Vehiculos");
        botonVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVueloActionPerformed(evt);
            }
        });
        panelOpciones.add(botonVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opciones260x160.png"))); // NOI18N
        panelOpciones.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelDesconectar.setOpaque(false);
        panelDesconectar.setPreferredSize(new java.awt.Dimension(260, 100));
        panelDesconectar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Desconectarse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelDesconectar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, 60));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/opciones260x100.png"))); // NOI18N
        panelDesconectar.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(baseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(baseLayout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(baseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(base, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PrincipalOpciones inicio = new PrincipalOpciones();
        inicio.setSize(1300, 570);
        inicio.setLocation(0, 0);

        base.removeAll();
        base.add(inicio, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVueloActionPerformed
        // TODO add your handling code here:

        PanelBaseVehiculos interVehiculos = new PanelBaseVehiculos();
        interVehiculos.setSize(1010, 558);
        interVehiculos.setLocation(0, 0);

        panelData.removeAll();
        panelData.add(interVehiculos, BorderLayout.CENTER);
        panelData.revalidate();
        panelData.repaint();
    }//GEN-LAST:event_botonVueloActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        // TODO add your handling code here:

        InterProveedores interProveedores = new InterProveedores();
        interProveedores.setSize(1010, 558);
        interProveedores.setLocation(0, 0);

        panelData.removeAll();
        panelData.add(interProveedores, BorderLayout.CENTER);
        panelData.revalidate();
        panelData.repaint();
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInfoActionPerformed
        // TODO add your handling code here:
        MiInfoEmpleados infoEmpleado = new MiInfoEmpleados();
        infoEmpleado.setSize(1010, 558);
        infoEmpleado.setLocation(0, 0);

        panelData.removeAll();
        panelData.add(infoEmpleado, BorderLayout.CENTER);
        panelData.revalidate();
        panelData.repaint();
    }//GEN-LAST:event_botonInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JButton botonInfo;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonVuelo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelDesconectar;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}
