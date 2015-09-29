package control;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Jesus Ariel
 */
public class conectar {
    
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQLi89
           Class.forName("org.gjt.mm.mysql.Driver"); //activamos el driver 
           conect = DriverManager.getConnection("jdbc:mysql://localhost/inventario","root","1234"); 
           //cadena de conexion                            ubicacion-base-usuario por default
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
    }
}