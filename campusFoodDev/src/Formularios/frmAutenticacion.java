/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.usuario;
import bd.ConexionBase;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmAutenticacion extends javax.swing.JFrame {

    /**
     * Creates new form frmAutenticacion
     */
    public frmAutenticacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lusuario = new javax.swing.JLabel();
        tfusuario = new javax.swing.JTextField();
        lclave = new javax.swing.JLabel();
        pfclave = new javax.swing.JPasswordField();
        btIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autenticacion Usuarios");

        lusuario.setText("Usuario:");

        lclave.setText("Clave:");

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lclave)
                            .addComponent(lusuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfusuario)
                            .addComponent(pfclave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusuario)
                    .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lclave)
                    .addComponent(pfclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btIngresar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        // TODO add your handling code here:
        String usuario = tfusuario.getText();
        String clave = String.valueOf(pfclave.getPassword());
        
        ConexionBase c = new ConexionBase();
        try {
            c.conectar();
            usuario u = new usuario(usuario, clave);
            if(c.esUsuarioValido(u)){
                JOptionPane.showMessageDialog(null,"Usuario correcto","Autenticación",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Usuario correcto");
                frmPrincipal ingreso = new frmPrincipal();
                ingreso.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Usuario Incorrecto","Autenticación",JOptionPane.ERROR_MESSAGE);                        
                System.out.println("Usuario incorrecto");
            }
            c.desconectar();
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel lclave;
    private javax.swing.JLabel lusuario;
    private javax.swing.JPasswordField pfclave;
    private javax.swing.JTextField tfusuario;
    // End of variables declaration//GEN-END:variables
}