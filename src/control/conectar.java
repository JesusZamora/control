package control;
import java.sql.*;
import javax.swing.*;

public class conectar {
Connection conect = null;   
    public static final String USER = "root";
    public static final String PASS = "12345";
    public static final String DBNAME = "inventario";
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQLi89
           Class.forName("org.gjt.mm.mysql.Driver"); //activamos el driver 
           conect = DriverManager.getConnection("jdbc:mysql://localhost/inventario","root",""); 
           //cadena de conexion                            ubicacion-base-usuario por default
           //JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la convocatoria?");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
    }

}