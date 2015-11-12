/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.sun.istack.internal.logging.Logger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Jesus Ariel
 */
public class listaEquipos extends javax.swing.JFrame {

    /**
     * Creates new form listaEquipos
     */
    public listaEquipos() {
        String cate = null;
        initComponents();
        iniciar(cate);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabEquipo = new javax.swing.JTable();
        Categoria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton5.setText("Pagina Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Prestar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tabEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Equipo", "Nombre del Equipo", "Accesorios", "Decripción", "Marca", "Equipo Activo/Inactivo", "Seleccionar "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabEquipo);
        if (tabEquipo.getColumnModel().getColumnCount() > 0) {
            tabEquipo.getColumnModel().getColumn(5).setResizable(false);
        }

        Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VER TODOS LOS EQUIPOS", "Cables y Adaptadores", "Cámara", "Computación", "Expendables", "Foto Fija", "Fundas y Estuches", "Iluminación", "Inmobiliario", "Óptica", "Sonido", "Tramoya" }));
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar Equipo por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addGap(137, 137, 137)
                .addComponent(jButton2)
                .addGap(135, 135, 135)
                .addComponent(jButton3)
                .addGap(121, 121, 121)
                .addComponent(jButton6)
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            nuevoReporte IE= new nuevoReporte();
            IE.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        login pp= new login();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        equipo IE= new equipo();
        IE.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ide = null;
        for(int i=0; i<tabEquipo.getRowCount();i++)
            {
            boolean selec = (boolean)tabEquipo.getValueAt(i,6);
               if(selec == true)
                {
                   ide  = (String)tabEquipo.getValueAt(i,0);
                }else
                {
                   //FALTA MENSAJE
                }
            }
        System.out.println(ide);       
        equipo IE= new equipo(ide);
        IE.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        // TODO add your handling code here:
        Limpiar(tabEquipo);
        Object cat = Categoria.getSelectedItem();
        if (cat == "VER TODOS LOS EQUIPOS"){
            iniciar2();
            recorre();
        }else{
            String cate = String.valueOf(cat);
            iniciar(cate);
            recorre();
        //tabEquipo.setModel(new DefaultTableModel());
        }
    }//GEN-LAST:event_CategoriaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        elimina();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(listaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new listaEquipos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabEquipo;
    // End of variables declaration//GEN-END:variables

    
    public void iniciar(String cate)
    {
        conectar cc = new conectar(); // Llamar al objeto conectar 
        Connection con = cc.conexion();//creamos la variable conexion con el metodo conexion 
        DefaultTableModel Modelo = (DefaultTableModel) tabEquipo.getModel();

        try{    
        String sql = "select idEquipo, nomEquipo, accesorios, descEquipo,"
                + "marcaEquipo, equipoActivo from equipo where Categoria = '" +cate+ "';";
            try (CallableStatement cmd = con.prepareCall(sql)) {
                ResultSet rs = cmd.executeQuery();
                while (rs.next()) {
                    Object[] datos = new Object [6];
                    for (int i=0; i<=5; i++){
                        datos [i] = rs.getString(i+1);
                        //System.out.println(datos [i]);
                        //System.out.println(rs);
                    }
                    Modelo.addRow(datos);
                }   }
        con.close();
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }      
    }
 public void iniciar2()
    {
        conectar cc = new conectar(); // Llamar al objeto conectar 
        Connection con = cc.conexion();//creamos la variable conexion con el metodo conexion 
        DefaultTableModel Modelo = (DefaultTableModel) tabEquipo.getModel();

        try{    
        String sql = "select idEquipo, nomEquipo, accesorios, descEquipo,"
                + "marcaEquipo, equipoActivo from equipo;";
            try (CallableStatement cmd = con.prepareCall(sql)) {
                ResultSet rs = cmd.executeQuery();
                while (rs.next()) {
                    Object[] datos = new Object [6];
                    for (int i=0; i<=5; i++){
                        datos [i] = rs.getString(i+1);
                        //System.out.println(datos [i]);
                        //System.out.println(rs);
                    }
                    Modelo.addRow(datos);
                }   }
        con.close();
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
        //recorre();
    }
  public void recorre()
  {
      for(int i=0; i<tabEquipo.getRowCount();i++)
      {
          //boolean selec = (boolean)tabEquipo.getValueAt(i,6);
          //String cad = (String)tabEquipo.getValueAt(i,5);
          tabEquipo.setValueAt(false, i, 6);
          //System.out.println(cad);
          
      }
      /*for(int i=0; i<tabEquipo.getRowCount();i++)
      {
          boolean selec = (boolean)tabEquipo.getValueAt(i,6);
          //String cad = (String)tabEquipo.getValueAt(i,5);
          //tabEquipo.setValueAt(false, 1, 6);
          System.out.println(selec);
          
      }*/
  }
  private void Limpiar(JTable tabEquipoJTable) {
        while (tabEquipo.getRowCount()>0){
            ((DefaultTableModel) tabEquipo.getModel()).removeRow(0);
        }
    }
  public void elimina()
  {
     int response = JOptionPane.showConfirmDialog(null, "Seguro que quieres ELIMINAR","¿ELIMINAR?",JOptionPane.YES_NO_OPTION);
      if (response == JOptionPane.NO_OPTION) {
             System.out.println("NO");
           } else if (response == JOptionPane.YES_OPTION) {
             System.out.println("SI");       
      for(int i=0; i<tabEquipo.getRowCount();i++)
      {
          boolean selec = (boolean)tabEquipo.getValueAt(i,6);
          if(selec == true)
          {
              conectar cc = new conectar(); // Llamar al objeto conectar 
              Connection con = cc.conexion();//creamos la variable conexion con el metodo conexion 
              String id= (String)tabEquipo.getValueAt(i, 0);
              String sql = "DELETE from equipo WHERE idEquipo ='"+ id +"';";
                try {
                    System.out.println(id);
                    PreparedStatement pst = con.prepareStatement(sql);   //se hace para relacionar mi primer signo con marca y asi sucesivamente
                    pst.executeUpdate(); //int n = 1;    cuantos registros se han agregado    n sera 1 osea 1 registro
                    JOptionPane.showMessageDialog(rootPane, "Equipo Eliminado con Éxito");
                }catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(rootPane, ex);
                    //java.util.logging.Logger.getLogger(.class.getName()).log(Level.SEVERE, null, ex);
                }
              }
          
            }
           }
      
  }
}

/*
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if (response == JOptionPane.NO_OPTION) {
             System.out.println("No button clicked");
           } else if (response == JOptionPane.YES_OPTION) {
             System.out.println("Yes button clicked");
           } else if (response == JOptionPane.CLOSED_OPTION) {
             System.out.println("JOptionPane closed");
           }
*/