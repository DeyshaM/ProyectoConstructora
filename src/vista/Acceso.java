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

public class Acceso extends javax.swing.JFrame {

    
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public Acceso() {
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

        panCaptura = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panCaptura1 = new javax.swing.JPanel();
        lblUsAcceso = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPasswordAcceso = new javax.swing.JPasswordField();
        btnEntrarSistema = new javax.swing.JButton();
        panRol = new javax.swing.JPanel();
        optAdmin = new javax.swing.JRadioButton();
        optEquipo = new javax.swing.JRadioButton();
        lblFondo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblTAccesso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCaptura.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        panCaptura1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panCaptura1.setOpaque(false);

        lblUsAcceso.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblUsAcceso.setText("Captura datos");

        lblUsuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContrasena.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblContrasena.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtPasswordAcceso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPasswordAcceso.setText("txtPassword");

        btnEntrarSistema.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEntrarSistema.setText(" Entrar al sistema");
        btnEntrarSistema.setOpaque(false);
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        panRol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona rol de usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N
        panRol.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        panRol.setOpaque(false);

        optAdmin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        optAdmin.setText("Administrador");
        optAdmin.setOpaque(false);

        optEquipo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        optEquipo.setText("Eq. Trabajadores");
        optEquipo.setOpaque(false);

        javax.swing.GroupLayout panRolLayout = new javax.swing.GroupLayout(panRol);
        panRol.setLayout(panRolLayout);
        panRolLayout.setHorizontalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRolLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(optAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(optEquipo)
                .addGap(20, 20, 20))
        );
        panRolLayout.setVerticalGroup(
            panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optEquipo)
                    .addComponent(optAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.jpg"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSalir.setText(" Salir del Programa");
        btnSalir.setOpaque(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCaptura1Layout = new javax.swing.GroupLayout(panCaptura1);
        panCaptura1.setLayout(panCaptura1Layout);
        panCaptura1Layout.setHorizontalGroup(
            panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCaptura1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrarSistema)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCaptura1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCaptura1Layout.createSequentialGroup()
                        .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasena)
                            .addComponent(lblUsuario))
                        .addGap(93, 93, 93)
                        .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)))
                .addGap(148, 148, 148))
            .addGroup(panCaptura1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(lblUsAcceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panCaptura1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblFondo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panCaptura1Layout.setVerticalGroup(
            panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCaptura1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblUsAcceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCaptura1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCaptura1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblContrasena)))
                .addGap(18, 18, 18)
                .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrarSistema)
                    .addComponent(btnSalir))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(panCaptura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panCaptura1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCaptura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCaptura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblTAccesso.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        lblTAccesso.setForeground(new java.awt.Color(0, 153, 153));
        lblTAccesso.setText("Acceso a Sistema de Proyectos ");

        javax.swing.GroupLayout panCapturaLayout = new javax.swing.GroupLayout(panCaptura);
        panCaptura.setLayout(panCapturaLayout);
        panCapturaLayout.setHorizontalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCapturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTAccesso)
                .addGap(104, 104, 104))
        );
        panCapturaLayout.setVerticalGroup(
            panCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCapturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTAccesso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        ConectarBase();
        if (optAdmin.isSelected()){ //if admin
            try {
                String usuarioAcceso=txtUsuario.getText();
                String passwordAcceso=txtPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from tusuariosadmin");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuarioadmin"))&&passwordAcceso.equals(rs.getString("passwordadmin"))){
                        error=false;

                        CRUDProyecto ventanaCRUDProyecto = new CRUDProyecto();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema Administrador\n"+usuarioAcceso);
                        ventanaCRUDProyecto.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nVerifica!!!");
                    txtUsuario.setText(usuarioAcceso);
                    txtPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }

        } else if (optEquipo.isSelected()){

            try {
                String usuarioAcceso=txtUsuario.getText();
                String passwordAcceso=txtPasswordAcceso.getText();

                boolean error=true;
                rs=stmt.executeQuery("SELECT * from tusuariosvend");
                while(rs.next()==true){
                    if(usuarioAcceso.equals(rs.getString("usuariovend"))&&passwordAcceso.equals(rs.getString("passwordvend"))){
                        error=false;

                        EquipoTrabajo ventanaAltaConsulta = new EquipoTrabajo();
                        JOptionPane.showMessageDialog(null, "Bienvenido a sistema Equipo de Trabajo "+ usuarioAcceso);
                        ventanaAltaConsulta.setVisible(true);
                        this.hide();

                    }//termina if
                }//termina while
                if(error ==true){//if si no encontro a usuario
                    JOptionPane.showMessageDialog(null, "Error al ingresar usuario\nFavor de verificar");
                    txtUsuario.setText(usuarioAcceso);
                    txtPasswordAcceso.setText(null);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error de DB verifica"+ e);
            }
        }

    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTAccesso;
    private javax.swing.JLabel lblUsAcceso;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton optAdmin;
    private javax.swing.JRadioButton optEquipo;
    private javax.swing.JPanel panCaptura;
    private javax.swing.JPanel panCaptura1;
    private javax.swing.JPanel panRol;
    private javax.swing.JPasswordField txtPasswordAcceso;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
