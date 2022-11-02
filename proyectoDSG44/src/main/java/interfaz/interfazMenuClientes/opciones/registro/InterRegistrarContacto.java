/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.interfazMenuClientes.opciones.registro;

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
public class InterRegistrarContacto extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public InterRegistrarContacto() {
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

        labelTitulo = new javax.swing.JLabel();
        botonCompletarReg1 = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        fieldDireccion = new javax.swing.JTextField();
        fieldCodigoPostal = new javax.swing.JTextField();
        fieldCiudad = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        labelPostal = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        listaPaises = new javax.swing.JComboBox<>();
        labelNombres = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        fieldNombres = new javax.swing.JTextField();
        fieldApellidos = new javax.swing.JTextField();
        listaTiposDoc = new javax.swing.JComboBox<>();
        labelNumeroDoc = new javax.swing.JLabel();
        labelTipoDoc = new javax.swing.JLabel();
        labelFechaNacimiento = new javax.swing.JLabel();
        fieldNumeroDocumento = new javax.swing.JTextField();
        listaDias = new javax.swing.JComboBox<>();
        listaAños = new javax.swing.JComboBox<>();
        listaMeses = new javax.swing.JComboBox<>();
        panelOpcionesVentana = new javax.swing.JPanel();
        botonMinimizar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Alumni Sans Light", 0, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Registro - Contacto de emergencia");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 360, -1));

        botonCompletarReg1.setText("Completar Registro");
        getContentPane().add(botonCompletarReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 150, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 80, -1));

        fieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(fieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 220, -1));
        getContentPane().add(fieldCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 220, -1));
        getContentPane().add(fieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 220, -1));

        labelDireccion.setText("Direccion de Residencia");
        getContentPane().add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        labelPostal.setText("Codigo Postal");
        getContentPane().add(labelPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 416, -1, 100));

        labelCiudad.setText("Ciudad de Residencia");
        getContentPane().add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        labelPais.setText("Pais de Residencia");
        getContentPane().add(labelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        listaPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas", "Marshall", "Islas", "Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva", "Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva", "Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        listaPaises.setBorder(null);
        listaPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPaisesActionPerformed(evt);
            }
        });
        getContentPane().add(listaPaises, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 220, -1));

        labelNombres.setText("Nombres");
        getContentPane().add(labelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        labelApellidos.setText("Apellidos");
        getContentPane().add(labelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        getContentPane().add(fieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 220, -1));
        getContentPane().add(fieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 220, -1));

        listaTiposDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de ciudadania", "Pasaporte", "Documento de identificacion Extranjero" }));
        listaTiposDoc.setBorder(null);
        listaTiposDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTiposDocActionPerformed(evt);
            }
        });
        getContentPane().add(listaTiposDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 220, -1));

        labelNumeroDoc.setText("Numero de Documento");
        getContentPane().add(labelNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        labelTipoDoc.setText("Tipo de Documento");
        getContentPane().add(labelTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        labelFechaNacimiento.setText("Fecha de nacimiento");
        getContentPane().add(labelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        fieldNumeroDocumento.setBorder(null);
        fieldNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(fieldNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 220, 20));

        listaDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        listaDias.setBorder(null);
        listaDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDiasActionPerformed(evt);
            }
        });
        getContentPane().add(listaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 60, -1));
        listaDias.getAccessibleContext().setAccessibleDescription("");

        listaAños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        listaAños.setBorder(null);
        listaAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAñosActionPerformed(evt);
            }
        });
        getContentPane().add(listaAños, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 60, -1));

        listaMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        listaMeses.setBorder(null);
        listaMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMesesActionPerformed(evt);
            }
        });
        getContentPane().add(listaMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 60, -1));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void listaDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDiasActionPerformed

    private void listaMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaMesesActionPerformed

    private void listaAñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAñosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAñosActionPerformed

    private void listaTiposDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTiposDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTiposDocActionPerformed

    private void fieldNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroDocumentoActionPerformed

    private void listaPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPaisesActionPerformed

    private void fieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDireccionActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterRegistrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterRegistrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterRegistrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterRegistrarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterRegistrarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonCompletarReg1;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JTextField fieldApellidos;
    private javax.swing.JTextField fieldCiudad;
    private javax.swing.JTextField fieldCodigoPostal;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombres;
    private javax.swing.JTextField fieldNumeroDocumento;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaNacimiento;
    private javax.swing.JLabel labelNombres;
    private javax.swing.JLabel labelNumeroDoc;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelPostal;
    private javax.swing.JLabel labelTipoDoc;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JComboBox<String> listaAños;
    private javax.swing.JComboBox<String> listaDias;
    private javax.swing.JComboBox<String> listaMeses;
    private javax.swing.JComboBox<String> listaPaises;
    private javax.swing.JComboBox<String> listaTiposDoc;
    private javax.swing.JPanel panelOpcionesVentana;
    // End of variables declaration//GEN-END:variables
}
