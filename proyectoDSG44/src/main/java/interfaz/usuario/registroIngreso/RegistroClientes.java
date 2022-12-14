/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.usuario.registroIngreso;

import clases.personas.Pasajero;
import estructuras.Usuarios.ListaEnlazadaResponsables;
import interfaz.launcher.PrincipalOpciones;
import interfaz.usuario.InterfazInicioUsuario;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import logica.Datos;

/**
 *
 * @author Arturo
 */
public class RegistroClientes extends javax.swing.JPanel {

    /**
     * Creates new form RegistroClientes
     */
    public RegistroClientes() {
        initComponents();
    }

    private int determinarEdad() {

        String dia = listaDias.getSelectedItem().toString();
        String mes = listaMeses.getSelectedItem().toString();
        String año = listaAños.getSelectedItem().toString();

        String fecha = dia + "/" + mes + "/" + año;

        int edad = -1;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        edad = periodo.getYears();

        return edad;
    }

    private boolean verificarEspacios() {

        boolean esCompleto = false;

        if (fieldNombres.getText().isBlank() && listaTiposDoc.getSelectedIndex() == 0 && fieldNumeroDocumento.getText().isBlank()
                && listaDias.getSelectedIndex() == 0 && listaMeses.getSelectedIndex() == 0 && listaAños.getSelectedIndex() == 0) {

            esCompleto = false;

        } else {

            esCompleto = true;

        }

        return esCompleto;
    }

    private void pasarARegistrarContacto() {

        RegistroEmergencia interfazRegistroContacto = new RegistroEmergencia();
        interfazRegistroContacto.setSize(1300, 570);
        interfazRegistroContacto.setLocation(0, 0);

        base.removeAll();
        base.add(interfazRegistroContacto, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }

    private void pasarARegistrarUser() {

        RegistroCrearUserPass interfazRegistroFin = new RegistroCrearUserPass();
        interfazRegistroFin.setSize(1300, 570);
        interfazRegistroFin.setLocation(0, 0);

        base.removeAll();
        base.add(interfazRegistroFin, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }

    private void crearPasajero(boolean esmenor) {

        ListaEnlazadaResponsables listaUser = new ListaEnlazadaResponsables();

        Pasajero pasajeroLocal = new Pasajero();
        pasajeroLocal = Datos.getTemporal();
        
        pasajeroLocal.setRegistrado(false);
        pasajeroLocal.setDatosCompletos(false);
        pasajeroLocal.setNombre(fieldNombres.getText());
        pasajeroLocal.setTipoDeDocumento(listaTiposDoc.getSelectedItem().toString());
        pasajeroLocal.setNumeroDeDocumento(fieldNumeroDocumento.getText());
        
        pasajeroLocal.setAñoDeNacimiento(Integer.parseInt(listaAños.getSelectedItem().toString()));
        pasajeroLocal.setMesDeNacimiento(Integer.parseInt(listaMeses.getSelectedItem().toString()));
        pasajeroLocal.setDiaDenacimiento(Integer.parseInt(listaDias.getSelectedItem().toString()));
        
        pasajeroLocal.setEsMenor(esmenor);
        pasajeroLocal.setResponsables(listaUser);
        
        
        
        

        Datos.setTemporal(pasajeroLocal);
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
        jPanel1 = new javax.swing.JPanel();
        fieldNumeroDocumento = new javax.swing.JTextField();
        labelTitulo = new javax.swing.JLabel();
        labelTipoDoc1 = new javax.swing.JLabel();
        fieldNombres = new javax.swing.JTextField();
        labelTipoDoc = new javax.swing.JLabel();
        listaTiposDoc = new javax.swing.JComboBox<>();
        labelNumeroDoc = new javax.swing.JLabel();
        labelFechaNacimiento = new javax.swing.JLabel();
        listaAños = new javax.swing.JComboBox<>();
        listaMeses = new javax.swing.JComboBox<>();
        listaDias = new javax.swing.JComboBox<>();
        botonCompletarReg1 = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1300, 570));
        setMinimumSize(new java.awt.Dimension(1300, 570));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        base.setBackground(new java.awt.Color(255, 255, 153));
        base.setOpaque(false);
        base.setPreferredSize(new java.awt.Dimension(1300, 570));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fieldNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 260, -1));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Registro");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, -1));

        labelTipoDoc1.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoDoc1.setText("Nombre Completo");
        jPanel1.add(labelTipoDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(fieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 260, -1));

        labelTipoDoc.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoDoc.setText("Tipo de Documento");
        jPanel1.add(labelTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        listaTiposDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cedula de Ciudadanía", "Tarjeta de Identidad", "Registro Civil", "DNI Extranjero", "Pasaporte", "No. Único de Id. Personal", "Otro" }));
        listaTiposDoc.setBorder(null);
        listaTiposDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiposDocActionPerformed(evt);
            }
        });
        jPanel1.add(listaTiposDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 260, -1));

        labelNumeroDoc.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroDoc.setText("Numero de Documento");
        jPanel1.add(labelNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        labelFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        labelFechaNacimiento.setText("Fecha de nacimiento");
        jPanel1.add(labelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        listaAños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        listaAños.setBorder(null);
        listaAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAñosActionPerformed(evt);
            }
        });
        jPanel1.add(listaAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 80, -1));

        listaMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        listaMeses.setBorder(null);
        listaMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMesesActionPerformed(evt);
            }
        });
        jPanel1.add(listaMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, -1));

        listaDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        listaDias.setBorder(null);
        listaDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasActionPerformed(evt);
            }
        });
        jPanel1.add(listaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, -1));

        botonCompletarReg1.setText("Completar Registro");
        botonCompletarReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompletarReg1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonCompletarReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 150, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, -1));

        labelError.setText(".");
        labelError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 10, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/fondo Registro.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(base, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void listaTiposDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiposDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTiposDocActionPerformed

    private void listaAñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAñosActionPerformed

    private void listaMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMesesActionPerformed

    private void listaDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDiasActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        InterfazInicioUsuario inicio = new InterfazInicioUsuario();
        inicio.setSize(1300, 570);
        inicio.setLocation(0, 0);

        base.removeAll();
        base.add(inicio, BorderLayout.CENTER);
        base.revalidate();
        base.repaint();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCompletarReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompletarReg1ActionPerformed
        // TODO add your handling code here:

        if (verificarEspacios() == true) {
            int edad = determinarEdad();

            if (edad < 18) {

                boolean esMenor = true;

                crearPasajero(esMenor);
                pasarARegistrarContacto();

            } else {

                boolean esMenor = false;

                crearPasajero(esMenor);
                pasarARegistrarUser();
            }

        }else{
            labelError.setText("Todos los espacios deben ser diligenciados");
        }


    }//GEN-LAST:event_botonCompletarReg1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCompletarReg1;
    private javax.swing.JTextField fieldNombres;
    private javax.swing.JTextField fieldNumeroDocumento;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelFechaNacimiento;
    private javax.swing.JLabel labelNumeroDoc;
    private javax.swing.JLabel labelTipoDoc;
    private javax.swing.JLabel labelTipoDoc1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<String> listaAños;
    private javax.swing.JComboBox<String> listaDias;
    private javax.swing.JComboBox<String> listaMeses;
    private javax.swing.JComboBox<String> listaTiposDoc;
    // End of variables declaration//GEN-END:variables
}
