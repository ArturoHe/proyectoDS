/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.interfazMenuAerolinea;

/**
 *
 * @author Arturo
 */
public class SelectorDeOpcionAerolinea extends javax.swing.JPanel {

    /**
     * Creates new form SelectorDeOpcionAerolinea
     */
    public SelectorDeOpcionAerolinea() {
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

        botonProveedores = new javax.swing.JButton();
        botonVehiculos = new javax.swing.JButton();
        botonInformacion = new javax.swing.JButton();

        botonProveedores.setText("Mi vuelo");
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });

        botonVehiculos.setText("Contactos");
        botonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVehiculosActionPerformed(evt);
            }
        });

        botonInformacion.setText("Informacion");
        botonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInformacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVehiculos)
                    .addComponent(botonInformacion)
                    .addComponent(botonProveedores))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVehiculosActionPerformed

    private void botonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInformacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInformacion;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonVehiculos;
    // End of variables declaration//GEN-END:variables
}
