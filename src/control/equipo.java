/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Dimension;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus Ariel
 */
public final class equipo extends javax.swing.JFrame {

    /**
     * Creates new form equipo
     * @param ide
     */
    public equipo(String ide) {
        initComponents();
        modificar(ide);
    }
    public equipo() {
        initComponents();
    }
    
        void limpiar(){
        idEquipo.setText("");
        nomEquipo.setText("");
        descEqui.setText("");
        marcaEqui.setText("");
        nomFoto.setText("");
        imaEquipo.setIcon(null);
        historial.setText("");
        accesorios.setText("");
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        idEquipo = new javax.swing.JTextField();
        nomEquipo = new javax.swing.JTextField();
        marcaEqui = new javax.swing.JTextField();
        imaEquipo = new javax.swing.JLabel();
        nomFoto = new javax.swing.JTextField();
        Categoria = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        accesorios = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        descEqui = new javax.swing.JTextArea();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NUEVO EQUIPO");

        jLabel1.setText("Id Equipo :");

        jLabel2.setText("Nombre del Equipo :");

        jLabel3.setText("Descripción del Equipo :");

        jLabel5.setText("Marca :");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        idEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEquipoActionPerformed(evt);
            }
        });

        marcaEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaEquiActionPerformed(evt);
            }
        });

        nomFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomFotoActionPerformed(evt);
            }
        });

        Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cables y Adaptadores", "Cámara", "Computación", "Expendables", "Foto Fija", "Fundas y Estuches", "Iluminación", "Mobiliario", "Óptica", "Sonido", "Tramoya" }));
        Categoria.setToolTipText("");
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoría :");

        jLabel7.setText("Accesorios del Equipo :");

        accesorios.setColumns(20);
        accesorios.setRows(5);
        jScrollPane2.setViewportView(accesorios);

        historial.setColumns(20);
        historial.setRows(5);
        jScrollPane4.setViewportView(historial);

        jLabel8.setText("Historial :");

        descEqui.setColumns(20);
        descEqui.setRows(5);
        jScrollPane6.setViewportView(descEqui);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marcaEqui, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(idEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nomFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3))
                        .addComponent(imaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marcaEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            //JOptionPane.showMessageDialog(null, "VERIFICA LA CATEGORIA");
            conectar cc = new conectar(); // Llamar al objeto conectar 
            Connection cn = cc.conexion();//creamos la variable conexion con el metodo conexion 
            String equiActivo;
            FileInputStream archivoFoto;   //se crean variables temporales para guardar lo qe se iene en cajas
            String sql = "";        //variale para sentencia sql
            equiActivo = "activo";
            sql="INSERT INTO equipo (idEquipo, nomEquipo, marcaEquipo, accesorios, descEquipo, historial, equipoActivo, Categoria, nomFoto, foto)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?)"; //permite insertar los datos en nuestra base de datos
            
            try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            
            pst.setString(1,idEquipo.getText());
            pst.setString(2,nomEquipo.getText());
            pst.setString(3,marcaEqui.getText());
            pst.setString(4,accesorios.getText());
            pst.setString(5,descEqui.getText());
            pst.setString(6,historial.getText());
            pst.setString(7,equiActivo);
            Object cat = Categoria.getSelectedItem();
            String cate = String.valueOf(cat);
            pst.setString(8,cate);
            pst.setString(9,nomFoto.getText());
            archivoFoto = new FileInputStream(nomFoto.getText());
            pst.setBinaryStream(10, archivoFoto);

            int n=pst.executeUpdate(); //int n = 1;    cuantos registros se han agregado    n sera 1 osea 1 registro
            if (n>0) {   // si no esta vacio entonces 
                JOptionPane.showMessageDialog(null, "Equipo registrado con exito");
                limpiar();
                listaEquipos IE= new listaEquipos();
                IE.setVisible(true);
                dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(equipo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR: verifique los datos");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(equipo.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        listaEquipos IE= new listaEquipos();
        IE.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        final JLabel img = new JLabel();
        img.setPreferredSize(new Dimension(200,200));
        img.setHorizontalAlignment(JLabel.CENTER);
        //Creamos nuestra variable archivo en la cual podremos usar todos los metodos de la clase jFileChooser        
        final JFileChooser imaEquip = new JFileChooser();
        imaEquip.setAccessory(img);
        imaEquip.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                try{
                    if(evt.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY));
                    img.setText("");
                    img.setIcon(new ImageIcon(imaEquip.getSelectedFile().getPath()));
                    
                   }
                catch(Exception ex){
                    img.setText("Solo Imagenes");
                    img.setIcon(new ImageIcon());
                }
            }
            });
        
        //Si deseamos crear filtros para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Imagen", "jpg", "jpeg", "png", "tif", "bmp");
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        imaEquip.addChoosableFileFilter(filtro);
        // Colocamos titulo a nuestra ventana de Seleccion
        imaEquip.setDialogTitle("Abrir Foto del Equipo");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        File ruta = new File("D:/Escritorio");
        //Le implementamos a nuestro ventana de seleccion
        imaEquip.setCurrentDirectory(ruta);
        //Abrimos nuestra Ventana de Selccion
        int ventana = imaEquip.showOpenDialog(null);
       //hacemos comparacion en caso de aprete el boton abrir
        if (ventana == JFileChooser.APPROVE_OPTION)
        {
            //Obtenemos la ruta de nuestra imagen seleccionada 
            File file = imaEquip.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            nomFoto.setText(String.valueOf(file));
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto = getToolkit().getImage(nomFoto.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto = foto.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            imaEquipo.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void marcaEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaEquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaEquiActionPerformed

    private void idEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEquipoActionPerformed

    private void nomFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFotoActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Categoria;
    private javax.swing.JTextArea accesorios;
    private javax.swing.JTextArea descEqui;
    private javax.swing.JTextArea historial;
    private javax.swing.JTextField idEquipo;
    private javax.swing.JLabel imaEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField marcaEqui;
    private javax.swing.JTextField nomEquipo;
    private javax.swing.JTextField nomFoto;
    // End of variables declaration//GEN-END:variables

public void modificar(String ide)
{
        conectar cc = new conectar(); // Llamar al objeto conectar 
        Connection cn = cc.conexion();//creamos la variable conexion con el metodo conexion 
        
        try{    
        String sql = "SELECT IdEquipo, nomEquipo, marcaEquipo, accesorios, descEquipo, historial, Categoria, nomFoto, foto FROM equipo WHERE IdEquipo = '" +ide+ "' ; ";
            try (CallableStatement cmd = cn.prepareCall(sql)) {
                ResultSet rs = cmd.executeQuery();
                rs.next();
                idEquipo.setText(rs.getString("IdEquipo"));
                nomEquipo.setText(rs.getString("nomEquipo"));
                marcaEqui.setText(rs.getString("marcaEquipo"));
                descEqui.setText(rs.getString("descEquipo"));
                accesorios.setText(rs.getString("accesorios"));
                historial.setText(rs.getString("historial"));
                nomFoto.setText(rs.getString("nomFoto"));
                //imaEquipo. 
        
            }
        cn.close();
        }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
}
