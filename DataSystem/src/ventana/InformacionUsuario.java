/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InformacionUsuario extends javax.swing.JFrame {
    
    String user = "", user_update = "";
    int ID;

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(630,450);
        setResizable(false);
        setTitle("Informacion del usuario " + user_update + " Sesion de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // EVITAR QUE FINALIZE AL CERRAR
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Walpaper.getWidth(),
        jLabel_Walpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Walpaper.setIcon(icono);
        this.repaint();
        
        jLabel_Titulo.setText("Informacion del Usuario "+ user_update);
        
        try {
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(""
                    + "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                ID = rs.getInt("ide_usuario");
                
                txt_nombre.setText(rs.getString("nombre_usuario"));
                txt_email.setText(rs.getString("email"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_username.setText(rs.getString("username"));
                txt_registradopor.setText(rs.getString("registrado_por"));
                
                cmb_estatus.setSelectedItem(rs.getString("estatus"));
                cmb_niveles.setSelectedItem(rs.getString("tipo_nivel"));
                
            } 
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar Informacion de usuario, contacte administrador");
        }
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_nombre1 = new javax.swing.JLabel();
        jLabel_nombre2 = new javax.swing.JLabel();
        jLabel_nombre3 = new javax.swing.JLabel();
        jLabel_nombre4 = new javax.swing.JLabel();
        jLabel_nombre5 = new javax.swing.JLabel();
        jLabel_nombre6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_registradopor = new javax.swing.JTextField();
        cmb_estatus = new javax.swing.JComboBox<>();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Restaurar = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Walpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Informacion del Usuario");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setText("Nombre:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setText("Email");
        getContentPane().add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre2.setText("Telefono");
        getContentPane().add(jLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_nombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre3.setText("Permisos De:");
        getContentPane().add(jLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_nombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre4.setText("Username");
        getContentPane().add(jLabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel_nombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre5.setText("Estatus");
        getContentPane().add(jLabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_nombre6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre6.setText("Registrado por:");
        getContentPane().add(jLabel_nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_email.setBackground(new java.awt.Color(153, 153, 255));
        txt_email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_registradopor.setBackground(new java.awt.Color(153, 153, 255));
        txt_registradopor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_registradopor.setForeground(new java.awt.Color(255, 255, 255));
        txt_registradopor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_registradopor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_registradopor.setEnabled(false);
        getContentPane().add(txt_registradopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton_Actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Actualizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Actualizar.setText("Actualizar Usuario");
        jButton_Actualizar.setBorder(null);
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, 35));

        jButton_Restaurar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Restaurar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Restaurar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Restaurar.setText("Restaurar Password");
        jButton_Restaurar.setBorder(null);
        jButton_Restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Restaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 210, 35));

        jLabel_footer.setText("Creado por Alexander Cardenas");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));
        getContentPane().add(jLabel_Walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
        
        int permiso_cmb, estatus_cmb, validacion = 0;
        String nombre, email, telefono, username, pass, permisos_sttring = "", estatus_string = "";
        
        email = txt_email.getText().trim();
        telefono = txt_telefono.getText().trim();
        username = txt_username.getText().trim();
        nombre = txt_nombre.getText().trim();
        
        permiso_cmb = cmb_niveles.getSelectedIndex() + 1;
        estatus_cmb = cmb_estatus.getSelectedIndex() + 1;
        
        if (email.equals("")) {
            txt_email.setBackground(Color.red);
            validacion ++;  
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion ++;  
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion ++;  
        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion ++;  
        }
        
        if (validacion == 0) {
            
            if (permiso_cmb == 1) {
                permisos_sttring = "Administrador";
            }
            if (permiso_cmb == 2) {
                permisos_sttring = "Capturista";
            }
            if (permiso_cmb == 3) {
                permisos_sttring = "Tecnico";
            }
            
            if (estatus_cmb == 1) {
                estatus_string = "Activo";
            }
            if (estatus_cmb == 2) {
                estatus_string = "Inactivo";
            }
            
            try {
                
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(""
                        + "Select username from usuarios where username = '" + username + "' and "
                                + "not ide_usuario = '" + ID + "'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    txt_username.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de Usuario no disponible");
                    cn.close();
                    
                }else{
                    Connection cn2 = Conexion.Conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(""
                            + "update usuarios set nombre_usuario =?, email=?, telefono=?, username=?,"
                            + "tipo_nivel=?, estatus=?  where ide_usuario = '"+ ID +"'");
                    
                    pst2.setString(1,nombre);
                    pst2.setString(2, email);
                    pst2.setString(3, telefono);
                    pst2.setString(4, username);
                    pst2.setString(5, permisos_sttring);
                    pst2.setString(6, estatus_string);
                    
                    pst2.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificacion Correcta");
                }
                
            } catch (SQLException e) {
                System.err.print("Error al Actualizar" + e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar Todos los Campos para poder Actualizarlos");
        }
        
        
        
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_RestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RestaurarActionPerformed
        RestaurarPassword rp = new RestaurarPassword();
        rp.setVisible(true);
        
    }//GEN-LAST:event_jButton_RestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Restaurar;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Walpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_nombre2;
    private javax.swing.JLabel jLabel_nombre3;
    private javax.swing.JLabel jLabel_nombre4;
    private javax.swing.JLabel jLabel_nombre5;
    private javax.swing.JLabel jLabel_nombre6;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_registradopor;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
