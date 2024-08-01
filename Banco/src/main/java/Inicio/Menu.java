/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.paneles.Depositos;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import panelesMenu.Cuenta;

import panelesMenu.Informacion;
import panelesMenu.Retirar;
import panelesMenu.Tranferencia;

/**
 *
 * @author tadeo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        initStyles();
        iniciarPaneles();
        establecerDia();
    }
    
    public void establecerDia() {
        
        LocalDate nuevo = LocalDate.now();
        int day = nuevo.getDayOfMonth();
        int month = nuevo.getMonthValue();
        int year = nuevo.getYear();
        
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        
        txtDiaActual.setText("dia " + day + " mes " + month + " Año " + year);

        //Esta linea es para que se cree la fecha en español
        Locale definirDia = new Locale("es", "ES");
        
        DateTimeFormatter reiniciar = DateTimeFormatter.ofPattern("  'Hoy es 'EEEE dd 'de' MMMM 'de' yyyy", definirDia);

        //Se formate la fecha actual 
        String diaNombre = nuevo.format(reiniciar);
        txtDiaActual.setText(diaNombre);
        
    }
    
    
    public void iniciarPaneles(){
        mostrarPaneles(new Informacion());
    }
    
    private void mostrarPaneles(JPanel panel){
        panel.setSize(628, 450);
        panel.setLocation(0,0);
        
        PanelPrincipal.removeAll();
        PanelPrincipal.add(panel,BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    
    public void initStyles(){
          lblTitulo.putClientProperty("FlatLaf.style", "font: light $h1.regular.font");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpcion = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCuenta = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtDiaActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpcion.setBackground(new java.awt.Color(74, 85, 162));
        panelOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(197, 223, 248));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        panelOpcion.add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 630, 450));

        lblTitulo.setText("Banco");
        panelOpcion.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        btnCuenta.setText("Cuenta");
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });
        panelOpcion.add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, -1));

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        panelOpcion.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, -1));

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        panelOpcion.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));

        btnTransferencia.setText("Transferir");
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        panelOpcion.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelOpcion.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 70, -1));

        txtDiaActual.setText("Fecha actual");
        panelOpcion.add(txtDiaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        getContentPane().add(panelOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        // TODO add your handling code here:
        mostrarPaneles(new Tranferencia());
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        // TODO add your handling code here:
        mostrarPaneles(new Cuenta());
    }//GEN-LAST:event_btnCuentaActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        // TODO add your handling code here:
        mostrarPaneles(new Depositos());
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        mostrarPaneles(new Retirar());
    }//GEN-LAST:event_btnRetirarActionPerformed

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
            FlatDarkLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        
        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelOpcion;
    private javax.swing.JLabel txtDiaActual;
    // End of variables declaration//GEN-END:variables
}
