/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tottus
 */
public class Coneccion {

    public Connection conexion;
    public String error = "NO";
    private int nroerror;

    public final void Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://" + "" + "localhost" + "/" + "mysql", "root", "");
            error="NO";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
            error = "SI";

            if (ex.getErrorCode() == 0) {
                JOptionPane.showMessageDialog(null, "Error El Servicio de Mysql No Se Encuentra en Ejecucion ");
            } else {
                nroerror = ex.getErrorCode();
            }
            JOptionPane.showMessageDialog(null, "Error de Coneccion " + ex.getLocalizedMessage()+"\nError Nro : "+ex.getErrorCode());


        } finally {
            if ("SI".equals(error)) {
                if (nroerror == 1049 || nroerror == 1045) {

//                    new ReparaMySQL().setVisible(true);
                }
            }
        }
    }

    public final void Conectar(String cad, String u, String p) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://" + cad, u, p);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de Coneccion " + ex.getLocalizedMessage()+"\nError Nro : "+ex.getErrorCode());
////            error = "SI";
////            if (ex.getErrorCode() == 0) {
////                JOptionPane.showMessageDialog(null, "Error El Servicio de Mysql No Se Encuentra en Ejecucion ");
////            } else if (ex.getErrorCode() == 1049 || ex.getErrorCode() == 1045) {
////                new RepararMySql(null, true).setVisible(true);
////            } else {
////                System.exit(0);
////            }
        }
    }

    public String getError() {
        return error;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void DesConectar() {
        this.conexion = null;
    }
}
