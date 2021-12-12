package vista;
// librerias de conexion
import java.sql.Connection; // conexión a BD
import java.sql.DriverManager; // controlador de conexión
import java.sql.ResultSet; // resultado final de datos
import java.sql.ResultSetMetaData; // resultado de metadatos
import java.sql.SQLException; // Tratamiento de Errros de BD SQL
import java.sql.Statement; // Generador de sentencias SQL
import java.text.SimpleDateFormat; // Formatear datos
import java.util.Date; // fecha de sistema
import javax.swing.ImageIcon; // Tratamiento de imagenes
import javax.swing.JOptionPane; // ventanas emergentes
import javax.swing.table.DefaultTableModel; // tabla de datos
import pojos.Proyecto;

public class EquipoTrabajo extends javax.swing.JFrame {

    
    
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public EquipoTrabajo() {
        initComponents();
    }

     public void ConectarBase(){
    
        try{//inicia try
        
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdzunigaproyectois","root","");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nZUNIGA");
            stmt=cn.createStatement();//genera sentencias spbre objetos de la base de datos
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n"+ ex);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de base de datos 2:"+e);
        }
    }//termina metodo conectar
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarPr = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jtConsulta.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID-Proyecto", "Cliente", "Coordinador", "Tipo de Construcción", "Zona de Construcción", "ID-Equipo"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 166, 46));
        jLabel1.setText("Sistema para Equipo de Trabajadores");

        btnConsultarPr.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnConsultarPr.setText("Consultar Lista de Proyectos");
        btnConsultarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPrActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarPr)
                .addGap(192, 192, 192)
                .addComponent(btnSalir))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarPr)
                    .addComponent(btnSalir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPrActionPerformed
        try {
            ConectarBase(); //llamada a la conexion
            //Declaración de un objeto de almacenamiento logico de datos "modelo de datos"
            DefaultTableModel modeloDatos = new DefaultTableModel ();
            jtConsulta.setModel(modeloDatos);

            rs=stmt.executeQuery("SELECT * FROM inmproyecto");
            //imprimir y contar columnas
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("id Proyecto");
            modeloDatos.addColumn("Cliente");
            modeloDatos.addColumn("Coordinador");
            modeloDatos.addColumn("Tipo Construccion");
            modeloDatos.addColumn("Zona Construccion");
            modeloDatos.addColumn("id Equipo");
   
            //imprimir filas o registros
            while(rs.next()){//inicia while
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i]=rs.getObject(i+1);
                }

                modeloDatos.addRow(fila);

            }//termina while

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error 2 de BD Consulta "+e);
        }
    }//GEN-LAST:event_btnConsultarPrActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int confirmaSalida=JOptionPane.showConfirmDialog(null,"¿Quieres salir?","Mensaje Importante",JOptionPane.YES_NO_OPTION);
        if (confirmaSalida==0) {
            System.exit(0);//cierra ventana
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(EquipoTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPr;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    // End of variables declaration//GEN-END:variables
}
