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

public class CRUDProyecto extends javax.swing.JFrame {

    Proyecto objProy = new Proyecto();
    
    //clases de conexion y sus objetos
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    public CRUDProyecto() {
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

        Seccion = new javax.swing.JTabbedPane();
        panAgrega = new javax.swing.JPanel();
        lblIDProy = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblCoordina = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtIDProy = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtCoordina = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnRegistrarProy = new javax.swing.JButton();
        lblZona = new javax.swing.JLabel();
        txtIDEquipo = new javax.swing.JTextField();
        lblIDEquipo = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        panEdita = new javax.swing.JPanel();
        lblIDEqrMod = new javax.swing.JLabel();
        txtIDEqMod = new javax.swing.JTextField();
        lblClienteMod = new javax.swing.JLabel();
        txtClienteMod = new javax.swing.JTextField();
        lblCoordiMod = new javax.swing.JLabel();
        txtCoordinaMod = new javax.swing.JTextField();
        lblIDPrMod = new javax.swing.JLabel();
        txtIDPrMod = new javax.swing.JTextField();
        lblTipomod = new javax.swing.JLabel();
        txtTipoMod = new javax.swing.JTextField();
        lblZonaMod = new javax.swing.JLabel();
        txtZonaMod = new javax.swing.JTextField();
        lblEdita = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        panElimina = new javax.swing.JPanel();
        txtIDProyEliminar = new javax.swing.JTextField();
        btnEliminarProy = new javax.swing.JButton();
        lblCapturaID = new javax.swing.JLabel();
        btnVerLista = new javax.swing.JButton();
        lblSistema = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Seccion.setBackground(new java.awt.Color(134, 223, 134));
        Seccion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        panAgrega.setBackground(new java.awt.Color(139, 187, 217));
        panAgrega.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agrega datos Proyecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        lblIDProy.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblIDProy.setText("ID-Proyecto:");

        lblCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblCliente.setText("Cliente:");

        lblCoordina.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblCoordina.setText("Coordinador:");

        lblAutor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblAutor.setText("Tipo de Construcción:");

        txtIDProy.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txtCliente.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtCoordina.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txtTipo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        btnRegistrarProy.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrarProy.setText("Registrar Proyecto");
        btnRegistrarProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProyActionPerformed(evt);
            }
        });

        lblZona.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblZona.setText("Zona de Construcción:");

        txtIDEquipo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblIDEquipo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblIDEquipo.setText("ID-Equpo:");

        txtZona.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        javax.swing.GroupLayout panAgregaLayout = new javax.swing.GroupLayout(panAgrega);
        panAgrega.setLayout(panAgregaLayout);
        panAgregaLayout.setHorizontalGroup(
            panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregaLayout.createSequentialGroup()
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDProy)
                    .addComponent(lblZona)
                    .addComponent(lblCliente)
                    .addComponent(lblCoordina)
                    .addComponent(lblAutor)
                    .addComponent(lblIDEquipo))
                .addGap(32, 32, 32)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDProy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoordina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgregaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarProy)
                .addGap(56, 56, 56))
        );
        panAgregaLayout.setVerticalGroup(
            panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDProy)
                    .addComponent(txtIDProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordina)
                    .addComponent(txtCoordina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZona)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAgregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnRegistrarProy)
                .addGap(28, 28, 28))
        );

        Seccion.addTab("Agregar", panAgrega);

        panEdita.setBackground(new java.awt.Color(136, 140, 101));
        panEdita.setForeground(new java.awt.Color(255, 255, 255));

        lblIDEqrMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblIDEqrMod.setForeground(new java.awt.Color(255, 255, 255));
        lblIDEqrMod.setText("ID-Equpo:");

        txtIDEqMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblClienteMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblClienteMod.setForeground(new java.awt.Color(255, 255, 255));
        lblClienteMod.setText("Cliente:");

        txtClienteMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblCoordiMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblCoordiMod.setForeground(new java.awt.Color(255, 255, 255));
        lblCoordiMod.setText("Coordinador:");

        txtCoordinaMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtCoordinaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoordinaModActionPerformed(evt);
            }
        });

        lblIDPrMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblIDPrMod.setForeground(new java.awt.Color(255, 255, 255));
        lblIDPrMod.setText("ID-Proyecto:");

        txtIDPrMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblTipomod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblTipomod.setForeground(new java.awt.Color(255, 255, 255));
        lblTipomod.setText("Tipo de Construcción:");

        txtTipoMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblZonaMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblZonaMod.setForeground(new java.awt.Color(255, 255, 255));
        lblZonaMod.setText("Zona de Construcción:");

        txtZonaMod.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        lblEdita.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblEdita.setForeground(new java.awt.Color(255, 255, 255));
        lblEdita.setText("Editar Proyecto");

        btnEditar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEditar.setText("Editar Proyecto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditaLayout = new javax.swing.GroupLayout(panEdita);
        panEdita.setLayout(panEditaLayout);
        panEditaLayout.setHorizontalGroup(
            panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(lblZonaMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtZonaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(lblIDEqrMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDEqMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(lblCoordiMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCoordinaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(lblTipomod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(26, 26, 26))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addComponent(lblEdita)
                        .addGap(24, 24, 24))
                    .addGroup(panEditaLayout.createSequentialGroup()
                        .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteMod)
                            .addComponent(lblIDPrMod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDPrMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
        );
        panEditaLayout.setVerticalGroup(
            panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdita)
                .addGap(18, 18, 18)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDPrMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDPrMod))
                .addGap(11, 11, 11)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoordinaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoordiMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipomod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZonaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZonaMod))
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(panEditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDEqMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDEqrMod))
                .addGap(30, 30, 30)
                .addComponent(btnEditar)
                .addGap(33, 33, 33))
        );

        Seccion.addTab("Editar Proyecto", panEdita);

        panElimina.setBackground(new java.awt.Color(96, 162, 133));

        txtIDProyEliminar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        btnEliminarProy.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarProy.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnEliminarProy.setText("Eliminar Proyecto");
        btnEliminarProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProyActionPerformed(evt);
            }
        });

        lblCapturaID.setBackground(new java.awt.Color(0, 0, 0));
        lblCapturaID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCapturaID.setForeground(new java.awt.Color(255, 255, 255));
        lblCapturaID.setText("Captura ID de Proyecto a eliminar");

        javax.swing.GroupLayout panEliminaLayout = new javax.swing.GroupLayout(panElimina);
        panElimina.setLayout(panEliminaLayout);
        panEliminaLayout.setHorizontalGroup(
            panEliminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminaLayout.createSequentialGroup()
                .addGroup(panEliminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblCapturaID))
                    .addGroup(panEliminaLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnEliminarProy))
                    .addGroup(panEliminaLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(txtIDProyEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panEliminaLayout.setVerticalGroup(
            panEliminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCapturaID)
                .addGap(56, 56, 56)
                .addComponent(txtIDProyEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminarProy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Seccion.addTab("Eliminar Proyecto", panElimina);

        btnVerLista.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVerLista.setText("Ver Lista de Proyectos");
        btnVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListaActionPerformed(evt);
            }
        });

        lblSistema.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSistema.setText("Sistema Control de Proyectos Constructoria");

        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSistema)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(btnVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Seccion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnVerLista)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir))
        );

        Seccion.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void btnRegistrarProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProyActionPerformed

        // llama a el metodo conectar
        ConectarBase();

        //Almacenar los valores del formulario objeto
        objProy.setIdProyecto(Integer.parseInt(txtIDProy.getText()));
        objProy.setCliente(txtCliente.getText());
        objProy.setCoordinador(txtCoordina.getText());
        objProy.setTipo(txtTipo.getText());
        objProy.setZona(txtZona.getText());
        objProy.setIdEquipo(Integer.parseInt(txtIDEquipo.getText()));
        //variable objeto para registrar alumno
        String altaLibro="INSERT INTO inmproyecto(`id Proyecto`,`Cliente`,`Coordinador`,`Tipo Construccion`,`Zona Construccion`,`id Equipo` )VALUES"
                + "('"+objProy.getIdProyecto()+"','"+
                objProy.getCliente()+"','"+objProy.getCoordinador()+"','"+objProy.getTipo()+"','"+objProy.getZona()+
                "','"+objProy.getIdEquipo()+"')";

        //estructura de control de tratamiento de errores en ejecucion
        try{
            stmt.executeUpdate(altaLibro);
            JOptionPane.showMessageDialog(null, "Se registro el proyecto de forma exitosa"+objProy.getIdProyecto());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de BD al generar alta Proyecto\n\nVerifica\n\n"+ e);
        }
    }//GEN-LAST:event_btnRegistrarProyActionPerformed

    private void btnEliminarProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProyActionPerformed
        int confirmaBaja;

        try  {
            ConectarBase();
            int proyBaja = Integer.parseInt(txtIDProyEliminar.getText());
 
            confirmaBaja = stmt.executeUpdate("DELETE FROM inmproyecto WHERE id Proyecto = '"+proyBaja+"' ");

            if (confirmaBaja==1) {
                JOptionPane.showConfirmDialog(null, "Se dio de baja el proyecto en BD\n\n"+proyBaja+"\nVerifica consulta");
            } else {
                JOptionPane.showConfirmDialog(null, "No se encuentra el id del proyecto en BD\n\n"+proyBaja+"\nVerifica consulta");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al procesar baja de BD\n\n"+Seccion+"\nVerifica consulta");
        }

    }//GEN-LAST:event_btnEliminarProyActionPerformed

    private void txtCoordinaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoordinaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoordinaModActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            ConectarBase();
            objProy.setIdProyecto(Integer.parseInt(txtIDPrMod.getText()));
            rs=stmt.executeQuery("SELECT * FROM inmproyecto WHERE id Proyecto = '"+objProy.getIdProyecto()+"' ");

            JOptionPane.showConfirmDialog(null, "Buscando Proyecto...");
            if (rs.next()==true) {
                txtClienteMod.setText(rs.getString("Cliente"));
                txtCoordinaMod.setText(rs.getString("Coordinador"));
                txtTipoMod.setText(rs.getString("Tipo Construccion"));
                txtZonaMod.setText(rs.getString("Zona Construccion"));
                txtIDEqMod.setText(rs.getString("id Equipo"));
            } else {
                JOptionPane.showConfirmDialog(null,"No existe Proyecto con ese ID\n\n"+objProy.getIdProyecto());
            }

        } catch (SQLException ex){

            JOptionPane.showConfirmDialog(null, "Error al procesar edición de BD\n\n"+ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaActionPerformed
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

    }//GEN-LAST:event_btnVerListaActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Seccion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarProy;
    private javax.swing.JButton btnRegistrarProy;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCapturaID;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteMod;
    private javax.swing.JLabel lblCoordiMod;
    private javax.swing.JLabel lblCoordina;
    private javax.swing.JLabel lblEdita;
    private javax.swing.JLabel lblIDEqrMod;
    private javax.swing.JLabel lblIDEquipo;
    private javax.swing.JLabel lblIDPrMod;
    private javax.swing.JLabel lblIDProy;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTipomod;
    private javax.swing.JLabel lblZona;
    private javax.swing.JLabel lblZonaMod;
    private javax.swing.JPanel panAgrega;
    private javax.swing.JPanel panEdita;
    private javax.swing.JPanel panElimina;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtClienteMod;
    private javax.swing.JTextField txtCoordina;
    private javax.swing.JTextField txtCoordinaMod;
    private javax.swing.JTextField txtIDEqMod;
    private javax.swing.JTextField txtIDEquipo;
    private javax.swing.JTextField txtIDPrMod;
    private javax.swing.JTextField txtIDProy;
    private javax.swing.JTextField txtIDProyEliminar;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipoMod;
    private javax.swing.JTextField txtZona;
    private javax.swing.JTextField txtZonaMod;
    // End of variables declaration//GEN-END:variables
}
