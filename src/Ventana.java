
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    private String SERVORIGEN, SERVDESTINO, USERORIGEN, USERDESTINO, PASSORIGEN, PASSDESTINO, BASEORIGEN, BASEDESTINO;
    private boolean origenOk, destinoOk;
    private ConfigOrigen confIn;
    private ConfigDestino confOut;
    public Ventana() {
	initComponents();
	Lector lee = new Lector();
	this.confIn = lee.leerConfOrigen();
	this.confOut = lee.leerConfDestino();
	
	if(this.confIn != null){
	    setConfigOrigen();
	}
	
	if(this.confOut != null){
	    setConfigDestino();
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuarioOrigen = new javax.swing.JTextField();
        txtServidorOrigen = new javax.swing.JTextField();
        txtPasswordOrigen = new javax.swing.JPasswordField();
        btnProbarOrigen = new javax.swing.JButton();
        btnGuardarOrigen = new javax.swing.JButton();
        btnLimpiarOrigen = new javax.swing.JButton();
        comboBaseOrigen = new javax.swing.JComboBox<>();
        imagen1 = new com.alee.extended.image.WebImage();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBaseDestino = new javax.swing.JTextField();
        txtPasswordDestino = new javax.swing.JPasswordField();
        txtUsuarioDestino = new javax.swing.JTextField();
        txtServidorDestino = new javax.swing.JTextField();
        btnProbarDestino = new javax.swing.JButton();
        btnGuardarDestino = new javax.swing.JButton();
        btnLimpiarDestino = new javax.swing.JButton();
        imagen2 = new com.alee.extended.image.WebImage();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalidas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPane2.setDividerLocation(500);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Origen"));
        jPanel2.setMaximumSize(new java.awt.Dimension(499, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(499, 200));

        jLabel1.setText("Servidor: ");

        jLabel2.setText("Usuario: ");

        jLabel3.setText("Password: ");

        jLabel4.setText("Base datos: ");

        btnProbarOrigen.setText("Probar");
        btnProbarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarOrigenActionPerformed(evt);
            }
        });

        btnGuardarOrigen.setText("Guardar");
        btnGuardarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarOrigenActionPerformed(evt);
            }
        });

        btnLimpiarOrigen.setText("Limpiar");
        btnLimpiarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarOrigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnProbarOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarOrigen))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBaseOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtServidorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPasswordOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtServidorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPasswordOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBaseOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProbarOrigen)
                    .addComponent(btnGuardarOrigen)
                    .addComponent(btnLimpiarOrigen))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino"));
        jPanel3.setMaximumSize(new java.awt.Dimension(499, 200));
        jPanel3.setMinimumSize(new java.awt.Dimension(499, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(499, 200));

        jLabel5.setText("Servidor: ");

        jLabel6.setText("Usuario: ");

        jLabel7.setText("Password: ");

        jLabel8.setText("Base datos: ");

        btnProbarDestino.setText("Probar");
        btnProbarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarDestinoActionPerformed(evt);
            }
        });

        btnGuardarDestino.setText("Guardar");
        btnGuardarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDestinoActionPerformed(evt);
            }
        });

        btnLimpiarDestino.setText("Limpiar");
        btnLimpiarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDestinoActionPerformed(evt);
            }
        });

        jButton2.setText("Copiar nombre origen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnProbarDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarDestino))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtServidorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPasswordDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBaseDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtServidorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPasswordDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBaseDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProbarDestino)
                    .addComponent(btnGuardarDestino)
                    .addComponent(btnLimpiarDestino))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel1);

        jSplitPane1.setTopComponent(jSplitPane2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        jSplitPane3.setDividerLocation(100);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(937, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jSplitPane3.setTopComponent(jPanel5);

        txtSalidas.setBackground(new java.awt.Color(0, 0, 0));
        txtSalidas.setColumns(20);
        txtSalidas.setForeground(new java.awt.Color(102, 255, 0));
        txtSalidas.setRows(5);
        jScrollPane1.setViewportView(txtSalidas);

        jSplitPane3.setRightComponent(jScrollPane1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProbarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarOrigenActionPerformed
	probarOrigen();
    }//GEN-LAST:event_btnProbarOrigenActionPerformed

    private void btnProbarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarDestinoActionPerformed
	probarDestino();
    }//GEN-LAST:event_btnProbarDestinoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	traerTablasOrigen();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	txtBaseDestino.setText("");
	if(comboBaseOrigen.getItemCount() > 0){
	    txtBaseDestino.setText(this.comboBaseOrigen.getSelectedItem().toString());
	}
	
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLimpiarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarOrigenActionPerformed
	txtServidorOrigen.setText("");
	txtUsuarioOrigen.setText("");
	txtPasswordOrigen.setText("");
	DefaultComboBoxModel modelo = (DefaultComboBoxModel) comboBaseOrigen.getModel();
	modelo.removeAllElements();
	comboBaseOrigen.setModel(modelo);
    }//GEN-LAST:event_btnLimpiarOrigenActionPerformed

    private void btnLimpiarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDestinoActionPerformed
	txtServidorDestino.setText("");
	txtUsuarioDestino.setText("");
	txtPasswordDestino.setText("");
	txtBaseDestino.setText("");
    }//GEN-LAST:event_btnLimpiarDestinoActionPerformed

    private void btnGuardarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarOrigenActionPerformed
	SERVORIGEN = txtServidorOrigen.getText();
	BASEORIGEN = comboBaseOrigen.getSelectedItem().toString();
	USERORIGEN = txtUsuarioOrigen.getText();
	String pass = new String(txtPasswordOrigen.getPassword());
	PASSORIGEN = pass;
	
	guardarOrigen();
    }//GEN-LAST:event_btnGuardarOrigenActionPerformed

    private void btnGuardarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDestinoActionPerformed
	SERVDESTINO = txtServidorDestino.getText();
	BASEDESTINO = txtBaseDestino.getText();
	USERDESTINO = txtUsuarioDestino.getText();
	String pass = new String(txtPasswordDestino.getPassword());
	PASSDESTINO = pass;
	guardarDestino();
    }//GEN-LAST:event_btnGuardarDestinoActionPerformed

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
	    java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new Ventana().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDestino;
    private javax.swing.JButton btnGuardarOrigen;
    private javax.swing.JButton btnLimpiarDestino;
    private javax.swing.JButton btnLimpiarOrigen;
    private javax.swing.JButton btnProbarDestino;
    private javax.swing.JButton btnProbarOrigen;
    private javax.swing.JComboBox<String> comboBaseOrigen;
    private com.alee.extended.image.WebImage imagen1;
    private com.alee.extended.image.WebImage imagen2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextField txtBaseDestino;
    private javax.swing.JPasswordField txtPasswordDestino;
    private javax.swing.JPasswordField txtPasswordOrigen;
    private javax.swing.JTextArea txtSalidas;
    private javax.swing.JTextField txtServidorDestino;
    private javax.swing.JTextField txtServidorOrigen;
    private javax.swing.JTextField txtUsuarioDestino;
    private javax.swing.JTextField txtUsuarioOrigen;
    // End of variables declaration//GEN-END:variables


    void probarOrigen() {
	this.cambiaImagen1(false, "bien");
	DefaultComboBoxModel modelo = (DefaultComboBoxModel) comboBaseOrigen.getModel();
	modelo.removeAllElements();
	comboBaseOrigen.setModel(modelo);
	log("Se inicia prueba de origen.");
	String pass = new String(txtPasswordOrigen.getPassword());
	Conexion c = new Conexion(txtServidorOrigen.getText(), txtUsuarioOrigen.getText(), pass);

	try {
	    if (c.testConexion()) {
		log("Conexión origen exitosa.");
		SERVORIGEN = txtServidorOrigen.getText();
		USERORIGEN = txtUsuarioOrigen.getText();
		PASSORIGEN = pass;
		traerBasesOrigen();
		this.cambiaImagen1(true, "bien");
		origenOk = true;
	    }
	    c.cerrar();
	} catch (ClassNotFoundException | SQLException ex) {
	    log("No se ha podido probar la conexión de origen.");
	    log(ex.toString());
	    this.cambiaImagen1(true, "mal");
	    c.cerrar();
	    origenOk = false;
	}
	c.cerrar();
    }

    void probarDestino() {
	this.cambiaImagen2(false, "bien");
	log("Se inicia prueba de destino.");
	String pass = new String(txtPasswordDestino.getPassword());
	Conexion c = new Conexion(txtServidorDestino.getText(), txtUsuarioDestino.getText(), pass);

	try {
	    if (c.testConexion()) {
		log("Conexión destino exitosa.");
		SERVDESTINO = txtServidorDestino.getText();
		USERDESTINO = txtUsuarioDestino.getText();
		PASSDESTINO = pass;
		this.cambiaImagen2(true, "bien");
		destinoOk = true;
	    }
	    c.cerrar();
	} catch (ClassNotFoundException | SQLException ex) {
	    log("No se ha podido probar la conexión de destino.");
	    log(ex.toString());
	    this.cambiaImagen2(true, "mal");
	    c.cerrar();
	    destinoOk = false;
	}
	c.cerrar();
    }

    void traerBasesOrigen() {
	Conexion c = new Conexion(SERVORIGEN, USERORIGEN, PASSORIGEN);
	try {
	    String[] basesOrigen = c.traerBases();
	    for (String base : basesOrigen) {
		if(!base.toUpperCase().equals("INFORMATION_SCHEMA")){
		    this.comboBaseOrigen.addItem(base);
		}
	    }
	} catch (SQLException ex) {
	    log("No se ha podido traer las bases de datos del servidor de origen");
	    log(ex.toString());
	}
    }

    public void log(String texto) {
	txtSalidas.append(texto);
	txtSalidas.append(System.getProperty("line.separator"));
    }

    public void cambiaImagen1(boolean hayImagen, String caso) {
	String rutaMala = "delete-24.png";
	String rutaBuena = "tick2-24.png";
	if (hayImagen) {
	    switch (caso) {
		case "bien":
		    ImageIcon i1 = new ImageIcon(rutaBuena);
		    imagen1.setIcon(i1);
		    imagen1.setSize(20, 20);
		    imagen1.setVisible(true);
		    break;
		case "mal":
		    ImageIcon i2 = new ImageIcon(rutaMala);
		    imagen1.setIcon(i2);
		    imagen1.setSize(20, 20);
		    imagen1.setVisible(true);
		    break;
	    }
	}
    }

    public void cambiaImagen2(boolean hayImagen, String caso) {
	String rutaMala = "delete-24.png";
	String rutaBuena = "tick2-24.png";
	if (hayImagen) {
	    switch (caso) {
		case "bien":
		    ImageIcon i1 = new ImageIcon(rutaBuena);
		    imagen2.setIcon(i1);
		    imagen2.setSize(20, 20);
		    imagen2.setVisible(true);
		    break;
		case "mal":
		    ImageIcon i2 = new ImageIcon(rutaMala);
		    imagen2.setIcon(i2);
		    imagen2.setSize(20, 20);
		    imagen2.setVisible(true);
		    break;
	    }
	}
    }

    public void traerTablasOrigen() {
	BASEORIGEN = this.comboBaseOrigen.getSelectedItem().toString();
	String query = "SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = '" + BASEORIGEN + "' AND TABLE_TYPE = 'BASE TABLE'";
	Conexion origen = new Conexion(SERVORIGEN, BASEORIGEN, USERORIGEN, PASSORIGEN);
	ResultSet rs = origen.ejecutarQuery(query);
	String tabActual = "";
	String scriptActual = "";
	try {
	    while (rs.next()) {
		tabActual = rs.getString("TABLE_NAME");
		String queryTabla = "SHOW CREATE TABLE " + BASEORIGEN + ".`" + tabActual + "`";
		Conexion tablas = new Conexion(SERVORIGEN, BASEORIGEN, USERORIGEN, PASSORIGEN);
		ResultSet r = tablas.ejecutarQuery(queryTabla);
		while(r.next()){
		    scriptActual = r.getString("Create Table");
		    tabActual = r.getString("Table");
		    log("Generando tabla: " + tabActual);
		    scriptActual = scriptActual.replace("ENGINE=Aria", "");
		    scriptActual = scriptActual.replace("CREATE TEMPORARY TABLE", "CREATE TABLE");
		    scriptActual = scriptActual.replace(" PAGE_CHECKSUM=0", "");
		    scriptActual = scriptActual.replace("0000-00-00 00:00:00", "1900-01-01 00:00:00");
		    crearTabla(scriptActual);
		}
	    }
	    log(System.getProperty("line.separator"));
	    log("Tablas creadas.");
	} catch (SQLException ex) {
	    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
	    if(ex.toString().contains("Row size too large")){
		
	    }
	}
    }
    
    void crearTabla(String script){
	Conexion con = new Conexion(SERVDESTINO, this.txtBaseDestino.getText(), USERDESTINO, PASSDESTINO);
	con.crear(script);
	con.cerrar();
    }
    
    public void setConfigOrigen(){
	this.txtServidorOrigen.setText(this.confIn.getServidor());
	this.txtUsuarioOrigen.setText(this.confIn.getUsuario());
	this.txtPasswordOrigen.setText(this.confIn.getPassword());
	this.comboBaseOrigen.setSelectedItem(this.confIn.getBaseDato());
    }
    
    public void setConfigDestino(){
	this.txtServidorDestino.setText(this.confOut.getServidor());
	this.txtUsuarioDestino.setText(this.confOut.getUsuario());
	this.txtPasswordDestino.setText(this.confOut.getPassword());
	this.txtBaseDestino.setText(this.confOut.getBaseDato());
    }
    
    public void guardarOrigen(){
	ConfigOrigen conf = new ConfigOrigen();
	conf.setBaseDato(this.comboBaseOrigen.getSelectedItem().toString());
	conf.setPassword(new String(this.txtPasswordOrigen.getPassword()));
	conf.setServidor(this.txtServidorOrigen.getText());
	conf.setUsuario(this.txtUsuarioOrigen.getText());
	Escritor es = new Escritor();
	log(es.escribirOrigen(conf));
    }
    
    public void guardarDestino(){
	ConfigDestino conf = new ConfigDestino();
	conf.setBaseDato(this.txtBaseDestino.getText());
	conf.setPassword(new String(this.txtPasswordDestino.getPassword()));
	conf.setServidor(this.txtServidorDestino.getText());
	conf.setUsuario(this.txtUsuarioDestino.getText());
	Escritor e = new Escritor();
	log(e.escribirDestino(conf));
    }
    
    public void traerDatos(){
	
    }
}
