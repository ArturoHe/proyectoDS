/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz.interfazMenuPrincipal;

/**
 *
 * @author Arturo
 */
public class MenuClientes extends javax.swing.JPanel {

    /**
     * Creates new form MenuClientes
     */
    public MenuClientes() {
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

        botonIngresar = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(882, 520));
        setMinimumSize(new java.awt.Dimension(882, 520));
        setPreferredSize(new java.awt.Dimension(882, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIngresar.setText("Ingresar");
        add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 70, -1));

        botonRegistrarse.setText("Registrarse");
        add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, -1));

        fondo.setText("Aqui va fondo");
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}