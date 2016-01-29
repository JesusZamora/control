package control;
import java.sql.*;
import javax.swing.*;

public class conectar {
Connection conect = null;   
    public static final String USER = "root";
    public static final String PASS = "";
    public static final String DBNAME = "inventario";
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQLi89
           Class.forName("org.gjt.mm.mysql.Driver"); //activamos el driver 
           conect = DriverManager.getConnection("jdbc:mysql://localhost/" + DBNAME,USER,PASS); 
           //cadena de conexion                            ubicacion-base-usuario por default
           //JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la convocatoria?");
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
    }
   public static ResultSet consultar(String sql, Connection con) {
        ResultSet resultado;
        try {
            Statement sentencia = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
   public static boolean ejecutarTransaccion(String pSql,  Connection pConectar){
       Statement objSentencia = null;
       boolean estado = false;
       try {
            objSentencia = pConectar.prepareStatement(pSql);
            try {
                 
                 if(objSentencia.executeUpdate(pSql) > 0)
                     estado = true;
            } catch (SQLException e) {
                 e.printStackTrace();
            }
          } catch (SQLException e){
             e.printStackTrace();
        }
       return estado;
    }

}