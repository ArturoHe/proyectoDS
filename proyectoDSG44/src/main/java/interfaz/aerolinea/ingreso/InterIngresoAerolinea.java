/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.aerolinea.ingreso;

import estructuras.aerolinea.ListaEnlazadaEmpleados;
import interfaz.aerolinea.interfazAerolinea.base.BaseInterfazEmpleados;
import interfaz.launcher.PrincipalOpciones;
import interfaz.usuario.registroIngreso.*;
import interfaz.usuario.interfazUsuario.BaseInterfazUsuario;
import java.awt.BorderLayout;
import logica.Datos;

/**
 *
 * @author Arturo
 */
public class InterIngresoAerolinea extends javax.swing.JPanel {

    /**
     * Creates new form Ingreso
     */
    public InterIngresoAerolinea() {
        initComponents();
    }

    private boolean verificacionUsuario() {

        ListaEnlazadaEmpleados lista = new ListaEnlazadaEmpleados();

        lista = Datos.getListaEmpleadosPrincipal();

        boolean esIngresoAprobado = false;

        for (int i = 0; i < lista.longitud(); i++) {

            String usuarioActual = lista.obtener(i).getUsuario();
            String contraActual = lista.obtener(i).getPassword();

            if (usuarioActual.equals(fieldUsuario.getText()) && (String.valueOf(contraActual)).equals(String.valueOf(fieldPassword.getPassword()))) {

                System.out.println("si");
                Datos.setIndiceEmpleado(i);
                esIngresoAprobado = true;

                break;

            } else {

                System.out.println("no");
                esIngresoAprobado = false;

            }

        }

        return esIngresoAprobado;
    }

    private boolean verificarEspacios() {

        boolean espaciosLlenos;

        if (fieldUsuario.getText().isEmpty()
                || String.valueOf(fieldPassword.getPassword()).isEmpty()) {

            espaciosLlenos = false;
        } else {
            espaciosLlenos = true;
        }

        return espaciosLlenos;
    }

    private void ingresar() {

        BaseInterfazEmpleados InterfazEmpleado = new BaseInterfazEmpleados();
        InterfazEmpleado.setSize(1300, 570);
        InterfazEmpleado.setLocation(0, 0);

        base.removeAll();
        base.add(InterfazEmpleado, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();

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
        labelTitulo = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonFinalizar = new javax.swing.JButton();
        labelErrorInicio = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        botonVerContra = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1300, 570));
        setLayout(new java.awt.BorderLayout());

        base.setBackground(new java.awt.Color(255, 255, 153));
        base.setMinimumSize(new java.awt.Dimension(1300, 570));
        base.setPreferredSize(new java.awt.Dimension(1300, 570));

        labelTitulo.setFont(new java.awt.Font("Alumni Sans Light", 0, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Ingreso Empleados");

        labelUsuario.setText("Usuario");

        labelContraseña.setText("Contraseña");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonFinalizar.setText("Ingresar");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        labelErrorInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelErrorInicio.setText(".");

        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });

        botonVerContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerContraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerContraMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseLayout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelErrorInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseLayout.createSequentialGroup()
                        .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(labelContraseña))
                        .addGap(80, 80, 80)
                        .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(baseLayout.createSequentialGroup()
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(botonVerContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(656, Short.MAX_VALUE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(labelTitulo)
                .addGap(8, 8, 8)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseña)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar)
                    .addComponent(botonFinalizar))
                .addGap(18, 18, 18)
                .addComponent(labelErrorInicio)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        add(base, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        PrincipalOpciones inicio = new PrincipalOpciones();
        inicio.setSize(1300, 570);
        inicio.setLocation(0, 0);

        base.removeAll();
        base.add(inicio, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        // TODO add your handling code here:
        boolean esIngreso = verificacionUsuario();
        boolean esCompleto = verificarEspacios();

        if (esCompleto == false) {

            labelErrorInicio.setText("Todos los espacios deben estar diligenciados");

        } else {

            if (esIngreso == true) {
                ingresar();
            } else {

                labelErrorInicio.setText("Usuario y/o contraseña incorrectos");

            }
        }

    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void botonVerContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerContraMousePressed
        // TODO add your handling code here:

        fieldPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_botonVerContraMousePressed

    private void botonVerContraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerContraMouseReleased
        // TODO add your handling code here:
        fieldPassword.setEchoChar('*');
    }//GEN-LAST:event_botonVerContraMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JButton botonVerContra;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelErrorInicio;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
