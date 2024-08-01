/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import java.awt.Color;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Random;

/**
 *
 * @author tadeo
 */
public class Registros extends javax.swing.JFrame {

    Color foregroundColor = Color.black;

    /**
     * Creates new form Registros
     */
    public Registros() {
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

        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtApellidos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        pswSecreto = new javax.swing.JPasswordField();
        pswContra = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(74, 85, 162));
        jPanel2.setMinimumSize(new java.awt.Dimension(254, 100));

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Banco");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(74, 85, 162));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        PanelPrincipal.setBackground(new java.awt.Color(197, 223, 248));
        PanelPrincipal.setForeground(new java.awt.Color(197, 223, 248));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(330, 398));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDOS: ");
        PanelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 103, -1, -1));
        PanelPrincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 96, 170, 20));

        txtApellidos.setBackground(new java.awt.Color(197, 223, 248));
        txtApellidos.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidos.setText("Ingrese sus apellidos:");
        txtApellidos.setBorder(null);
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidosMousePressed(evt);
            }
        });
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 125, 156, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CORREO");
        PanelPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 163, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA: ");
        PanelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(197, 223, 248));
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setText("Ingrese su correo:");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        PanelPrincipal.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 185, 170, -1));

        btnRegistro.setText("REGISTRARME");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 358, -1, -1));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 207, 170, 20));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("VERIFIQUE LA CONTRASEÑA ");
        PanelPrincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        pswSecreto.setBackground(new java.awt.Color(197, 223, 248));
        pswSecreto.setForeground(new java.awt.Color(51, 51, 51));
        pswSecreto.setText("**********");
        pswSecreto.setBorder(null);
        pswSecreto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswSecretoMousePressed(evt);
            }
        });
        PanelPrincipal.add(pswSecreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, -1));

        pswContra.setBackground(new java.awt.Color(197, 223, 248));
        pswContra.setForeground(new java.awt.Color(51, 51, 51));
        pswContra.setText("**********");
        pswContra.setBorder(null);
        pswContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswContraMousePressed(evt);
            }
        });
        PanelPrincipal.add(pswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 156, -1));
        PanelPrincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 12));
        PanelPrincipal.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 266, 170, 10));
        PanelPrincipal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 147, 170, 10));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro");
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 19, 62, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRES:");
        PanelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 53, -1, -1));

        txtNombres.setBackground(new java.awt.Color(197, 223, 248));
        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setText("Ingrese sus nombres:");
        txtNombres.setBorder(null);
        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombresMousePressed(evt);
            }
        });
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        PanelPrincipal.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 75, 156, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMousePressed
        // TODO add your handling code here:
        if (txtApellidos.getText().equals("Ingrese sus apellidos:")) {
            txtApellidos.setText("");
        }
        //Emptys o correcciones por si no hay texto en casillas
        if (txtNombres.getText().isEmpty()) {
            txtNombres.setText("Ingrese sus nombres:");
        }

        if (String.valueOf(pswContra.getPassword()).isEmpty()) {
            pswContra.setText("**********");
            pswContra.setForeground(foregroundColor);
        }

        if (String.valueOf(pswSecreto.getPassword()).isEmpty()) {
            pswSecreto.setText("**********");
            pswSecreto.setForeground(foregroundColor);
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo:");
        }
    }//GEN-LAST:event_txtApellidosMousePressed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
        if (txtCorreo.getText().equals("Ingrese su correo:")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(foregroundColor);
        }

        if (txtNombres.getText().isEmpty()) {
            txtNombres.setText("Ingrese sus nombres:");
        }

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos:");
            txtApellidos.setForeground(foregroundColor);
        }

        if (String.valueOf(pswContra.getPassword()).isEmpty()) {
            pswContra.setText("**********");
            pswContra.setForeground(foregroundColor);
        }

    }//GEN-LAST:event_txtCorreoMousePressed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:

        /*Pasos que se realizaran para insertan los datos de un usuario a la base de datos
        1-Recibir los datos del JTextField y JPasswordField
        2-Compara y busca el correo en la base de datos
        3-Se atrae el correo, y se compara el de la base de datos con el del JTextField
        4-Si el correo ya esta entonces pide uno diferente
        5-Si el correo no esta entonces procede
        6-Con lo datos ingresados se realizara un INSERT INTO
        7-Cuando se realice el INSEERT INTO entonces cambiara el panel al del login para iniciar sesion
         */
        try {

            //Funcion que generara los 10 numero aleatorios para el numero de cuenta 
            Random random = new Random();

            int numeroAleatorio = random.nextInt(10000, 99999);
            int numeroAleatorio1 = random.nextInt(10000, 99999);
            
            String numCuenta=String.valueOf(numeroAleatorio)+" "+String.valueOf(numeroAleatorio1);
            
            //Funcion para generar los 4 numero o la clave del usuario
            int numeroAleatorio2 = random.nextInt(1000,9000);
            String claveUsuario=String.valueOf(numeroAleatorio2);

            ResultSet rs = null;
            PreparedStatement ps = null;
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String correo = txtCorreo.getText();
            String contra = String.valueOf(pswContra.getPassword());
            String secreto = String.valueOf(pswSecreto.getPassword());
            String noCuenta = numCuenta;
            String clave = claveUsuario;
            String saldo = "0";

            ConexionBd.Conexion objetoConexion = new ConexionBd.Conexion();
            String comparaCond = "SELECT correo FROM banco.cuentasusuarios WHERE correo=? ;";
            ps = objetoConexion.establecerConexion().prepareStatement(comparaCond);

            ps.setString(1, correo);

            rs = ps.executeQuery();
            if (rs.next()) {
                //Se obtiene el correo que esta en base de datos
                String email = rs.getString("correo");

                
                //Si el correo de la base de datos existe y es igual entonces se muestra el siguiente panel
                if (correo.equals(email)) {
                    JOptionPane.showMessageDialog(null, "Correo existente. Ingrese uno diferente ");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Correo no encontrado");
                //Si no hay ningun correo entonces procede con el INSERT INTO
                String agregar = "INSERT INTO banco.cuentasusuarios(nombres,apellidos,correo,contraseña,noCuenta,clave,saldo) VALUES (?,?,?,?,?,?,?);";
                ps = objetoConexion.establecerConexion().prepareStatement(agregar);
                ps.setString(1, nombres);
                ps.setString(2, apellidos);
                ps.setString(3, correo);
                ps.setString(4, contra);
                ps.setString(5, noCuenta);
                ps.setString(6, clave);
                ps.setString(7, saldo);

                int datosAgregados = ps.executeUpdate();
                if (datosAgregados > 0) {
                    JOptionPane.showMessageDialog(null, "Hola " + nombres + " Bienvenido ");
                    JOptionPane.showMessageDialog(null, "Su numero de cuenta es: "+noCuenta+", y su clave es: "+clave);
                    Inicio.Login llamar = new Inicio.Login();

                    dispose();
                    llamar.setVisible(true);

                }

            }

        } catch (Exception e) {

        }

        //El siguiente codigo son las que limitaran ciertas acciones como el ingresar datos cuando
        if (String.valueOf(pswContra.getPassword()).equals("**********") || String.valueOf(pswSecreto.getPassword()).equals("**********")) {
            JOptionPane.showMessageDialog(null, "Escriba una contraseña correcta");
        }

        String[] cajasTexto = {txtNombres.getText(), txtApellidos.getText()};
        String[] defecto = {"Ingrese sus nombres:", "Ingrese sus apellidos:"};
        int noAcept = 0;
        int cont = 0;
        for (cont = 0; cont < cajasTexto.length; cont++) {
            if (cajasTexto[cont].isEmpty() || cajasTexto[cont].equals(defecto[cont])) {
                noAcept = noAcept + 1;

            }
        }
        if (noAcept > 0) {
            JOptionPane.showMessageDialog(null, "Ingrese datos correctos en " + noAcept + " casillas ");
        }

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void pswSecretoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswSecretoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(pswSecreto.getPassword()).equals("**********")) {
            pswSecreto.setText("");
        }
        //Emptys para casillas vacias
        if (txtNombres.getText().isEmpty()) {
            txtNombres.setText("Ingrese sus nombres:");
        }

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos:");
            txtApellidos.setForeground(foregroundColor);
        }

        if (String.valueOf(pswContra.getPassword()).isEmpty()) {
            pswContra.setText("**********");
            pswContra.setForeground(foregroundColor);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo:");
        }

    }//GEN-LAST:event_pswSecretoMousePressed

    private void pswContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswContraMousePressed
        // TODO add your handling code here:
        if (String.valueOf(pswContra.getPassword()).equals("**********")) {
            pswContra.setText("");
        }
        //Emptys para casillas vacias
        if (txtNombres.getText().isEmpty()) {
            txtNombres.setText("Ingrese sus nombres:");
        }

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos:");
            txtApellidos.setForeground(foregroundColor);
        }

        if (String.valueOf(pswSecreto.getPassword()).isEmpty()) {
            pswSecreto.setText("**********");
            pswSecreto.setForeground(foregroundColor);
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo:");
        }
    }//GEN-LAST:event_pswContraMousePressed

    private void txtNombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresMousePressed
        // TODO add your handling code here:
        if (txtNombres.getText().equals("Ingrese sus nombres:")) {
            txtNombres.setText("");
        }
        //        if (txtApellidos.getText().isEmpty() || String.valueOf(pswContra.getPassword()).isEmpty() || String.valueOf(pswSecreto.getPassword()).isEmpty()) {
        //            txtApellidos.setText("Ingrese sus apellidos:");
        //            txtApellidos.setForeground(Color.black);
        //            pswContra.setText("**********");
        //            pswSecreto.setText("**********");
        //        }
        //        if (txtDia.getText().isEmpty() || txtMes.getText().isEmpty() || txtAnio.getText().isEmpty()) {
        //            txtDia.setText("DIA");
        //
        //            txtMes.setText("MES");
        //
        //            txtAnio.setText("Año");
        //        }
        // Color foregroundColor = Color.black; // Assuming you want black for all

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos:");
            txtApellidos.setForeground(foregroundColor);
        }

        if (String.valueOf(pswContra.getPassword()).isEmpty()) {
            pswContra.setText("**********");
            pswContra.setForeground(foregroundColor);
        }

        if (String.valueOf(pswSecreto.getPassword()).isEmpty()) {
            pswSecreto.setText("**********");
            pswSecreto.setForeground(foregroundColor);
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo:");
        }
    }//GEN-LAST:event_txtNombresMousePressed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

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
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pswContra;
    private javax.swing.JPasswordField pswSecreto;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}