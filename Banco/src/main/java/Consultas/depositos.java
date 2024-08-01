/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author josue
 */
public class depositos {
    
    public void deposito(JTextField monto,JTextField noCuenta,JTextField clave){
        
       try{
           
       ResultSet rs = null ; 
        PreparedStatement ps = null;
            ConexionBd.Conexion conexion = new ConexionBd.Conexion();
            String dep = "SELECT noCuenta,clave,saldo FROM banco.cuentasusuarios WHERE noCuenta=? AND clave=?;";
            
            ps=conexion.establecerConexion().prepareStatement(dep);
            
            ps.setString(1, noCuenta.getText());
            ps.setString(2,clave.getText());
            
            rs=ps.executeQuery();
            if(rs.next()){
                int saldo=Integer.valueOf(rs.getString("saldo"));
                  JOptionPane.showMessageDialog(null, "Usted tiene "+saldo);
                int monto1=Integer.valueOf(monto.getText());
                
               String n1= String.valueOf(saldo+monto1);
               
                
                String actualizarPropio = "UPDATE cuentasusuarios SET saldo=? WHERE noCuenta=? AND clave=?;";
                ps=conexion.establecerConexion().prepareStatement(actualizarPropio);
                
                ps.setString(1,n1);
                ps.setString(2, noCuenta.getText());
                ps.setString(3, clave.getText());
                
                int numfila=ps.executeUpdate();
                if(numfila>0){
                     JOptionPane.showMessageDialog(null, "Su nuevo saldo es de  "+n1);
                    
                }

                
                
              
                
            }

            
            
            
           
           
           
       }catch(Exception e){
           
       }
   
        
    }
}