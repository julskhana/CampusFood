/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.usuario;
import bd.ConexionBase;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmIngresoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmIngresoUsuario
     */
    public frmIngresoUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btIngresar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        pfclave1 = new javax.swing.JPasswordField();
        pfclave2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tfcuenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso Usuarios");
        setResizable(false);

        jLabel1.setText("Rol:");

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "C" }));

        jLabel2.setText("Tipos de Rol: Administrador o Cajero.");

        jLabel3.setText("Ingrese una clave, maximo de 10 caracteres.");

        jLabel4.setText("Clave:");

        jLabel5.setText("Confirme Clave:");

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Cuenta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpiar)
                                .addGap(121, 121, 121)
                                .addComponent(btIngresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pfclave1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pfclave2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pfclave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pfclave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiar)
                    .addComponent(btIngresar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        // TODO add your handling code here:
        
        //generar fecha de ingreso de usuario
        //String fecha = new SimpleDateFormat("")
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String fecha_hora_in = dateFormat.format(date); //2016/11/16 12:08:43
        
        
        if (es_formulario_valido()){
            String cuenta = tfcuenta.getText();
            String clave = pfclave1.getText();
            String rol = cbRol.getSelectedItem().toString();
            String estado = "A";
            //recopilacion de datos para crear nuevo usuario
            usuario u = new usuario(cuenta,clave,rol,estado,fecha_hora_in);
            //conexion a la base
            ConexionBase c = new ConexionBase();
            
            if (Arrays.equals(pfclave1.getPassword(), pfclave2.getPassword())){
                try{
                    c.conectar();
                    if (c.ingresarUsuario(u)){
                        System.out.println("Usuario Ingresado exitosamente...");
                        JOptionPane.showMessageDialog(this,"Usuario Ingresado Correctamente.");
                        System.out.println("Usuario Ingresado Correctamente.\nFrecha de Registro: "+fecha_hora_in);
                        limpiar();
                        this.dispose();
                    }else{
                        System.out.println("Error al ingresar el usuario");
                    }
                    c.desconectar();
                
                }catch (Exception e){
                    System.out.println(e);
                }
            }else{
                JOptionPane.showMessageDialog(this,"Claves no coinciden.","Informacion Incorrecta",JOptionPane.ERROR_MESSAGE);
                System.out.println("Claves no son iguales\nUsuario no ingresado.");
            }
        }else{
            System.out.println("Error al ingresar Usuario.");
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btLimpiarActionPerformed

    
    private boolean es_formulario_valido(){
        if ((pfclave1.getText().length()>10)||(pfclave2.getText().length()>10)){
            System.out.println("clave invalida, maximo 10 caracteres...");
            JOptionPane.showMessageDialog(this,"Formulario Incorrecto\nMáximo 10 caracteres.","Ingreso de Usuarios",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(pfclave1.getText().equals("")){
            System.out.println("clave invalida, campos no pueden estar vacios...");
            JOptionPane.showMessageDialog(this,"Formulario Incorrecto\nCampos incompletos.","Ingreso de Usuarios",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (pfclave2.getText().equals("")){
            System.out.println("clave invalida, campos no pueden estar vacios...");
            JOptionPane.showMessageDialog(this,"Formulario Incorrecto\nCampos incompletos.","Ingreso de Usuarios",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (pfclave1.getText().equals("")&&pfclave2.getText().equals("")){
            System.out.println("clave invalida, campos no pueden estar vacios...");
            JOptionPane.showMessageDialog(this,"Formulario Incorrecto\nLa clave no puede ser nula.","Ingreso de Usuarios",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void limpiar(){
        pfclave1.setText("");
        pfclave2.setText("");
    }
    
    private boolean validarDuplicidadCuenta(){
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField pfclave1;
    private javax.swing.JPasswordField pfclave2;
    private javax.swing.JTextField tfcuenta;
    // End of variables declaration//GEN-END:variables
}
