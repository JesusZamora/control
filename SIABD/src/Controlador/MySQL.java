/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Tottus
 */
public class MySQL {

    private Coneccion conexion = new Coneccion();
    private ArrayList<ArrayList<Object>> Resultados = new ArrayList<>();
    private ArrayList<Object> Datos = new ArrayList<>();
    private ArrayList<Object[]> resulset = new ArrayList<>();
    private Statement stmt;
    private ResultSet rs;
    private boolean error;

    public MySQL() {
        conexion.Conectar();
        Resultados.clear();
        Datos.clear();
        Resultados = new ArrayList<>();
    }
    public MySQL(String cad, String u,String p){
        conexion.Conectar(cad, u, p);
        Resultados.clear();
        Datos.clear();
        Resultados = new ArrayList<>();
    }

    public void Comandos(String cad) {
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            stmt.execute(cad);
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        }
    }

    public Object Consulta(String ColumnasaVisualizar, String Tabla, String Condiciones, int Columnas, JDialog ventana) {
        Object cm = null;
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            if (!Condiciones.equalsIgnoreCase("NO")) {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + " From " + Tabla + " Where " + Condiciones);
            } else {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + " From " + Tabla);
            }
            while (rs.next()) {
                cm = rs.getObject(1);
            }
            rs.close();
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()) + "\n" + ventana.getName());
        }
        return cm;
    }

    public ArrayList<ArrayList<Object>> Query(String ColumnasaVisualizar, String Tabla, String Condiciones, int Columnas, JDialog ventana) {
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            if (!Condiciones.equalsIgnoreCase("NO")) {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + " From " + Tabla + " Where " + Condiciones);
            } else {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + " From " + Tabla);
            }

            while (rs.next()) {
                //Datos.clear();
                for (int i = 0; i < Columnas; i++) {
                    Datos.add(i, rs.getString(i + 1));
                }
                Resultados.add(Datos);
            }

            rs.close();
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        }

        return Resultados;
    }

    public ArrayList<Object[]> MiQuery(String ColumnasaVisualizar, String Tabla, String Condiciones, int Columnas, JDialog ventana) {
        Object dat[];
        try {

            stmt = (Statement) conexion.conexion.createStatement();
            if (!Condiciones.equalsIgnoreCase("NO")) {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + "\n From " + Tabla + "\n Where " + Condiciones);
            } else {
                rs = (ResultSet) stmt.executeQuery("select " + ColumnasaVisualizar + " From " + Tabla);
            }

            while (rs.next()) {
                //Datos.clear();
                dat = new Object[Columnas];
                for (int j = 0; j < Columnas; j++) {
                    dat[j] = rs.getObject(j + 1);
                }
                resulset.add(dat);
            }

            rs.close();
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        }

        return resulset;
    }

    public void Insertar(String Tabla, String Valores, JDialog ventana, boolean mostrar) {
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            stmt.executeUpdate("insert into " + Tabla + " values( " + Valores + " );");
            error = false;
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        } finally {
            if (error == false) {
                if (mostrar) {
                    JOptionPane.showMessageDialog(ventana, Tabla + " Insertado Correctamente");
                } else {
                    System.out.println(" Insertado Correctamente");
                }
            }
            error = false;
        }

    }

    public void Actualizar(String Tabla, String Valores, String Condicion, JDialog ventana, boolean mostrar) {
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            stmt.executeUpdate("update " + Tabla + " set " + Valores + " where " + Condicion + ";");
            error = false;
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        } finally {
            if (error == false) {
                if (mostrar) {
                    JOptionPane.showMessageDialog(ventana, Tabla + " Actualizado Correctamente");
                } else {
                    System.out.println(" Actualizado Correctamente");
                }

            }
            error = false;
        }
    }

    public void Eliminar(String Tabla, String Condicion, JDialog ventana, boolean mostrar) {
        try {
            stmt = (Statement) conexion.conexion.createStatement();
            stmt.executeUpdate("delete from " + Tabla + " where " + Condicion + ";");
            error = false;
            stmt.close();
            conexion.DesConectar();
        } catch (SQLException ex) {
            error = true;
            JOptionPane.showMessageDialog(ventana, "Error : " + ErroresdeConexion.MessageError(ex.getErrorCode(), ex.getMessage()));
        } finally {
            if (error == false) {
                if (mostrar) {
                    JOptionPane.showMessageDialog(ventana, Tabla + " Eliminado Correctamente");
                } else {
                    System.out.println(" Eliminado Correctamente");
                }
            }
            error = false;
        }
    }
}
