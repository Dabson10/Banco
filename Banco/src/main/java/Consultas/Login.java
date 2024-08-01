package Consultas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login {
    
    public void validarUsuario(JTextField nombre,JTextField email,JPasswordField contra){
        
        try{
            
            ResultSet rs = null ; 
        PreparedStatement ps = null;
            ConexionBd.Conexion conexion = new ConexionBd.Conexion();
            String consulta = "SELECT nombres,correo,contraseña FROM banco.cuentasusuarios WHERE nombres=? AND correo=? AND contraseña=?;";
            ps=conexion.establecerConexion().prepareStatement(consulta);
            
            String secreto = String.valueOf(contra.getPassword());
            ps.setString(1, nombre.getText());
            ps.setString(2,email.getText());
            ps.setString(3,secreto);
         //JOptionPane.showMessageDialog(null, "Usuario correcto "+nombre.getName()+" "+email.getName() +" "+ secreto );
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Usuario correcto");
                Inicio.Menu llamar = new Inicio.Menu();
                Inicio.Login login = new Inicio.Login();
                
                llamar.setVisible(true);
               
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Datos no encontrados");
                
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
        
        
    }
    
    

}
