/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Transferencias {

    public void Transferir(JTextField cuentaRefer, JTextField cuentaPropia, JTextField monto, JTextField clave) {

        try {
            /*Pasos para hacer una transferencia 
            1-Se obtienen los datos de los textField y se mandan a la clase transferencia que es esta clase
            2-Se busca el numero de cuenta del referente, si existe procede sino existe no procede y pide ingresar el numero correcto
            3-Se busca el numero de cuenta propio en la base de datos, si existe procede si no pide ingresar el dato completo
            4-Ahora al buscar el numero de cuenta propio se atra el valor del saldo y se compara con el del monto que transferira,
            si es mayor el saldo de la base de datos procede, sino muestra un anuncio de que no tiene dinero en su cuenta.
            5-Al ver si es mayor se compartira el dinero con el otro usuario, y tambien se actualiza el de la cuenta propia
            6-se borra los datos del texfiel por si quiere hacer otra tranferencia.
             */
            ResultSet rs = null;
            PreparedStatement ps = null;
            String cuentaCompartir = cuentaRefer.getText();
            String cuentPropia = cuentaPropia.getText();
            String transMonto = monto.getText();
            String contra = clave.getText();

            ConexionBd.Conexion objetoConexion = new ConexionBd.Conexion();
            String comparaCompart = "SELECT noCuenta, saldo, nombres, apellidos FROM banco.cuentasusuarios WHERE noCuenta=?;";
            ps = objetoConexion.establecerConexion().prepareStatement(comparaCompart);

            ps.setString(1, cuentaCompartir);

            rs = ps.executeQuery();

            if (rs.next()) {
                //Las siguientes variables son acerca de los datos de la persona que recibira la transferencia 
                String nnombre = rs.getString("nombres");
                String appellidos = rs.getString("apellidos");
                String saldoRefer = rs.getString("saldo");
                JOptionPane.showMessageDialog(null, "Usted transferira a : " + nnombre + " " + appellidos);

                String cuentaCompara = "SELECT noCuenta,saldo,nombres,apellidos,clave FROM banco.cuentasusuarios WHERE noCuenta=? AND clave=?;";
                ps = objetoConexion.establecerConexion().prepareStatement(cuentaCompara);

                ps.setString(1, cuentPropia);
                ps.setString(2, contra);

                rs = ps.executeQuery();
                if (rs.next()) {
                    //Las siguientes variables son acerca de los datos 
                    String nomProp = rs.getString("nombres");
                    String apellPropio = rs.getString("apellidos");
                    String saldoPropio = rs.getString("saldo");

                    JOptionPane.showMessageDialog(null, "Hola " + nomProp + " " + apellPropio + " su saldo es de: " + saldoPropio);

                    //Saldo del usuario que recibira el dinero
                    int saldoTransfer = Integer.valueOf(saldoRefer) + Integer.valueOf(transMonto);
                    //Saldo que restara el monto
                    int saldoPropioActualizado = Integer.valueOf(saldoPropio) - Integer.valueOf(transMonto);
                    int creditoTransfer=Integer.valueOf(transMonto);
                    int creditoPropio =Integer.valueOf(saldoPropio);
                    //Condicionales por si no tiene diero o tiene menos con respecto a la transferencia
                    if (creditoTransfer > creditoPropio) {
                        JOptionPane.showMessageDialog(null, "No tiene suficiente saldo, DEPOSITE");
                    } else if (creditoPropio >= creditoTransfer) {
                        String actualizarRefer = "UPDATE `cuentasusuarios` SET saldo=? WHERE noCuenta=? ";
                        ps = objetoConexion.establecerConexion().prepareStatement(actualizarRefer);
                        ps.setString(1, String.valueOf(saldoTransfer));
                        ps.setString(2, cuentaCompartir);

                        int numFilas = ps.executeUpdate();
                        if (numFilas > 0) {
                            JOptionPane.showMessageDialog(null, "El usuario recibio: " + transMonto
                            );

                            String actualizarPropio = "UPDATE `cuentasusuarios` SET saldo=? WHERE noCuenta=?";
                            ps = objetoConexion.establecerConexion().prepareStatement(actualizarPropio);

                            ps.setString(1, String.valueOf(saldoPropioActualizado));
                            ps.setString(2, cuentPropia);

                            int columnasActuali = ps.executeUpdate();
                            if (columnasActuali > 0) {
                                JOptionPane.showMessageDialog(null, "Se actualizo tu saldo, antes: " + saldoPropio + ", Ahora: " + saldoPropioActualizado);
                            }

                        } 

                    }

                } else {
                    JOptionPane.showMessageDialog(null, " Ingresa tu numero de cuenta correctamente ");
                }

            } else {
                JOptionPane.showMessageDialog(null, " Ingrese el numero de cuenta correcto del otro usuario");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No tienes dinero, DEPOSITA");
        }

    }

}
