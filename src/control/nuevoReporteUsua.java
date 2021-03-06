package control;

/**
 *
 * @author Jesus Ariel
 */
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class nuevoReporteUsua extends javax.swing.JFrame {
    private boolean guardado;
    private boolean usuario;
    /**
     * Creates new form nuevoReporte
     */
    public nuevoReporteUsua(boolean usuario) {
        initComponents();
        guardado = false;
        this.usuario = usuario;
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR); 
        String fecha1=(cal.get(cal.DATE)+3)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR);
        String fecha2=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.fecha.setText(fecha); 
        this.fecha1.setText(fecha1);
        this.fecha2.setText(fecha2);
        this.hora.setText(hora);
    }
    public nuevoReporteUsua(String[] ides, boolean usuario) {
        initComponents();
        this.usuario = usuario;
        llenaTab(ides);
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR); 
        String fecha1=(cal.get(cal.DATE)+3)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR);
        String fecha2=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.fecha.setText(fecha); 
        this.fecha1.setText(fecha1);
        this.fecha2.setText(fecha2);
        this.hora.setText(hora);
    }

    nuevoReporteUsua(String[] ides, String proyecto, String solicitante, boolean usuario) {
        initComponents();
        this.usuario = usuario;
        llenaTab(ides);
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR); 
        
        Calendar caldevolucion = Calendar.getInstance(); 
        caldevolucion.add(Calendar.DAY_OF_YEAR, 3);
        String fecha1=(caldevolucion.get(caldevolucion.DATE))+"/"+(caldevolucion.get(caldevolucion.MONTH)+1)+"/"+caldevolucion.get(caldevolucion.YEAR);
        
        String fecha2=cal.get(cal.DATE)+"/"+(ca­l.get(cal.MONTH)+1)+"/"+cal.get(c­al.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        
        this.fecha.setText(fecha); 
        this.fecha1.setText(fecha1);
        this.fecha2.setText(fecha2);
        this.hora.setText(hora);
        Proyecto.setText(proyecto);
        Solicitante.setText(solicitante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        selecEquipo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        fecha2 = new javax.swing.JLabel();
        Solicitante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Proyecto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabReporte = new javax.swing.JTable();
        hora = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clausula1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        clausula2 = new javax.swing.JTextArea();
        label2 = new javax.swing.JLabel();

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR NUEVO REPORTE");

        jButton1.setText("Imprimir");
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

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        selecEquipo.setText("Elegir Equipo");
        selecEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecEquipoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha y Hora de Prestamo:");

        jLabel4.setText("Fecha Devolución");

        jLabel5.setText("Fecha Real de Entrega:");

        fecha.setText("00/00/00");

        fecha1.setText("00/00/00");

        fecha2.setText("00/00/00");

        Solicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitanteActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombre Del Solicitante:");

        Proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectoActionPerformed(evt);
            }
        });

        jLabel14.setText("Proyecto en el que trabaja:");

        tabReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Equipo", "Equipo", "Accesorios", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabReporte.setComponentPopupMenu(jPopupMenu1);
        tabReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabReporteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabReporte);

        hora.setText("00:00");

        jButton4.setText("Añadir + Equipo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label1.setText("Clausula 1");

        clausula1.setColumns(20);
        clausula1.setRows(5);
        clausula1.setText("En caso de que el equipo presente algún desperfecto en su funcionamiento o apariencia el solicitante se hará responsable de pagar los costos generados por su reparación o reposición.");
        jScrollPane1.setViewportView(clausula1);

        clausula2.setColumns(20);
        clausula2.setRows(5);
        clausula2.setText("En caso de que el equipo presente algún desperfecto en su funcionamiento o apariencia el solicitante se hará responsable de pagar los costos generados por su reparación o reposición.");
        jScrollPane3.setViewportView(clausula2);

        label2.setText("Clausula 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(440, 440, 440)
                                .addComponent(selecEquipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jButton2)
                                .addGap(125, 125, 125)
                                .addComponent(jButton3)
                                .addGap(119, 119, 119)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha)
                                    .addComponent(fecha1)
                                    .addComponent(fecha2)
                                    .addComponent(hora))
                                .addGap(0, 5, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1)
                                    .addComponent(label2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecEquipo)
                        .addComponent(jButton4)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(hora))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(fecha1)
                                .addGap(36, 36, 36)
                                .addComponent(fecha2)))
                        .addGap(18, 18, 18)
                        .addComponent(label1)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecEquipoActionPerformed
            listaEquiposUsua leu= new listaEquiposUsua(usuario);
            leu.setVisible(true);
            dispose();
    }//GEN-LAST:event_selecEquipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            listaReporteUsua leu;
            leu = new listaReporteUsua(usuario);
            leu.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolicitanteActionPerformed

    private void ProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProyectoActionPerformed

    private void tabReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabReporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabReporteMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila;
        fila=tabReporte.getSelectedRow();
        ((DefaultTableModel) tabReporte.getModel()).removeRow(fila);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String[] ides2 = new String[tabReporte.getRowCount()];
        for(int i=0; i<=tabReporte.getRowCount()-1; i++){
                
            ides2[i]=(String)tabReporte.getValueAt(i, 0);  
            }
            /*for(int p=0; p<ides2.length; p++){
                System.out.println(ides2[p]);
                System.out.println("Nuevo reporte");
            }*/
            if(usuario)
            {
                listaEquiposUsua eu = new listaEquiposUsua(ides2,Proyecto.getText(),Solicitante.getText(),usuario);
                eu.setVisible(true);
            }
            else
            {
                listaEquipos IE= new listaEquipos(ides2,Proyecto.getText(),Solicitante.getText(),usuario);
                IE.setVisible(true);
            }
            dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // imprimir
        if(!guardado){
            JOptionPane.showMessageDialog(this, "Tienes que guardar el reporte antes de imprimirlo");
            return;
        }
        JFileChooser jf = new JFileChooser();
        int res = jf.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            String path = jf.getSelectedFile() + ".pdf";
            System.out.println( "Archivo " + path );
            try {
                if(this.generapdf(path))
                {
                    JOptionPane.showMessageDialog(this, "Se ha almacenado el archivo ");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "No se ha almacenado el archivo ");
                }    
            } catch (DocumentException ex) {
                Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        //metodo para imprimir
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // guardar
        if(guardado)
        {
            jButton3.setEnabled(false);
            return;
        }
        if(Proyecto.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Tienes que indicar el nombre del proyecto");
            return;
        }
        if(Solicitante.getText().length() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Tienes que indicar el nombre del Solicitante");
            return;
        }
        if(tabReporte.getRowCount() <= 0 )
        {
            JOptionPane.showMessageDialog(this, "Selecciona el equipo a prestar");
            return;
        }  
        Calendar cal=Calendar.getInstance(); 
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechahoy = sdf.format(dt);
        String prestador = "";
        Calendar calendario = Calendar.getInstance();
        Integer horaactual = calendario.get(Calendar.HOUR_OF_DAY);
        if(horaactual < 14)
            prestador =  "usuario"; //"admin";
        else
            prestador = "usuario";
        Calendar caldevolucion = Calendar.getInstance();
        caldevolucion.add(Calendar.DAY_OF_YEAR, 3);
        String sql = "INSERT INTO `inventario`.`prestamo` (`solicitante`,`proyecto`,`fprestamo`,`fdevolucion`,`prestador`)"
                + " VALUES('" + Solicitante.getText() +"', '"+ Proyecto.getText() +"','"+ fechahoy +"','"+ caldevolucion.get(caldevolucion.YEAR)+"-"+(caldevolucion.get(caldevolucion.MONTH)+1)+"-"+(caldevolucion.get(caldevolucion.DATE))+"','" + prestador +"')";
        System.out.println(sql);
        conectar con = new conectar();
        Connection conect = con.conexion();
        boolean res = conectar.ejecutarTransaccion(sql, conect);
        
        if(res)
        {
            JOptionPane.showMessageDialog(this, "Se ha almacenado");
            jButton3.setEnabled(false);
            guardado = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR: no se ha podido almacenar");
            return;
        }
        sql = "select last_insert_id()";
        ResultSet rs = conectar.consultar(sql, conect);  
        Integer id = null;
        try {
            while(rs.next())
            {
                id = rs.getInt("last_insert_id()");
            }
            System.out.println(id);
        } catch (SQLException ex) {
            Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Object[][] contenido = this.getTableData(tabReporte);
        for(Object []fila : contenido)
        {
            sql = "INSERT INTO `inventario`.`presta` (`idprestamo`,`idEquipo`) VALUES ("+ id +",'" + fila[0].toString() +"')";
            System.out.println(sql);
            res = conectar.ejecutarTransaccion(sql, conect);
            sql = "UPDATE `inventario`.`equipo` SET `equipoActivo` = 'inactivo' WHERE `idEquipo` = '" + fila[0].toString() + "'" ;
            System.out.println(sql);
            res = conectar.ejecutarTransaccion(sql, conect);
        }
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Proyecto;
    private javax.swing.JTextField Solicitante;
    private javax.swing.JTextArea clausula1;
    private javax.swing.JTextArea clausula2;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel fecha2;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton selecEquipo;
    private javax.swing.JTable tabReporte;
    // End of variables declaration//GEN-END:variables

    
   public void llenaTab(String[] ides){
       int ise=ides.length;
       conectar cc = new conectar(); // Llamar al objeto conectar 
       Connection con = cc.conexion();//creamos la variable conexion con el metodo conexion 
       DefaultTableModel Modelo = (DefaultTableModel) tabReporte.getModel();
       
       for(int c=0; c <= ise; c++){
        try{    
        String sql = "select idEquipo, nomEquipo, accesorios, descEquipo from equipo where idEquipo = '" +ides[c]+ "';";
            try (CallableStatement cmd = con.prepareCall(sql)) {
                ResultSet rs = cmd.executeQuery();
                while (rs.next()) {
                    Object[] datos = new Object [4];
                    for (int i=0; i<=3; i++){
                        datos [i] = rs.getString(i+1);
                        //System.out.println(datos [i]);
                        //System.out.println(rs);
                    }
                    Modelo.addRow(datos);
                }   }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
       }
    
 }
   public Object[][] getTableData (JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0 ; i < nRow ; i++)
            for (int j = 0 ; j < nCol ; j++)
                tableData[i][j] = dtm.getValueAt(i,j);
        return tableData;
    }
    public boolean generapdf(String path) throws DocumentException, FileNotFoundException
    {
        boolean estado = false;
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(path));
        document.open();
        
        Image img = null;
        try {
            img = Image.getInstance("src/img/imgen.jpg");
            img.scaleAbsolute(80f,50f);
            img.setAbsolutePosition(470f, 750f);
            document.add(img);
        } catch (BadElementException ex) {
            Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(nuevoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Paragraph paragraph1 = new Paragraph("Solicitante: " + Solicitante.getText());
        Paragraph paragraph2 = new Paragraph("Proyecto: " + Proyecto.getText());
        Paragraph paragraph3 = new Paragraph("Fecha y hora del prestamo: " + fecha.getText() + " " + hora.getText());
        Paragraph paragraph4 = new Paragraph("Fecha de entrega: " + fecha1.getText());
        
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(paragraph3);
        document.add(paragraph4);
        Paragraph tmp = new Paragraph("");
        tmp.setSpacingBefore(10);
        document.add(tmp);
        PdfPTable table = new PdfPTable(4);
        table.addCell("Id Equipo");
        table.addCell("Equipo");
        table.addCell("Accesorios");
        table.addCell("Descripcion");
        Object[][] tabla = this.getTableData(tabReporte);
        for(Object[] o : tabla)
            for(Object e: o)
            {
                table.addCell((String) e);
            }
        
        document.add(table);
        System.out.println(clausula1.getText() + " " + clausula2.getText());
        Paragraph paragraph5 = new Paragraph("Clausula 1: " + clausula1.getText());
         Paragraph paragraph6 = new Paragraph("Clausula 2: " + clausula2.getText());
        document.add(paragraph5);
        document.add(paragraph6);
        tmp = new Paragraph("");
        tmp.setSpacingBefore(10);
        document.add(tmp);
        Paragraph p = new Paragraph("Firma del solicitante: ");
        p.add(new Chunk(new DottedLineSeparator()));
        p.add("   Firma del prestador: ");
        p.add(new Chunk(new DottedLineSeparator()));
        document.add(p);
        
        //PdfPTable firma = new PdfPTable(1);
        //firma.addCell("Firma");
        //document.add(new Paragraph(""));
        //document.add(firma);
        document.close();
        return true;
    }
    
    
    
    
    
}
