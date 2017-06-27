/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.usuario;
import bd.ConexionBase;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class frmUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
        
        btEliminar.enable(false);
        btEditar.enable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();
        cbtipo = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btCClave = new javax.swing.JButton();
        btNuevousuario = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Usuarios");

        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Cuenta", "Rol", "Estado", "Fecha Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbusuario);

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cuenta", "Rol", "Estado", "Fecha Registro" }));

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btCClave.setText("Cambio de Clave");
        btCClave.setMaximumSize(new java.awt.Dimension(80, 32));
        btCClave.setMinimumSize(new java.awt.Dimension(80, 32));
        btCClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCClaveActionPerformed(evt);
            }
        });

        btNuevousuario.setText("Nuevo");
        btNuevousuario.setMaximumSize(new java.awt.Dimension(80, 32));
        btNuevousuario.setMinimumSize(new java.awt.Dimension(80, 32));
        btNuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevousuarioActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.setMaximumSize(new java.awt.Dimension(80, 32));
        btEliminar.setMinimumSize(new java.awt.Dimension(80, 32));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("VALORES");

        jLabel2.setText("Rol: \"A\" Administrador, \"C\" Cajero.");

        jLabel3.setText("Estado: \"A\" Activo, \"V\" Permiso, \"D\" Despedido.");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btConsultar)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btNuevousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCClaveActionPerformed
        // TODO add your handling code here:
        frmIngresoUsuarioCambioClave eclave = new frmIngresoUsuarioCambioClave();
        eclave.setVisible(true);
    }//GEN-LAST:event_btCClaveActionPerformed

    private void btNuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevousuarioActionPerformed
        // TODO add your handling code here:
        frmIngresoUsuario ingresoU = new frmIngresoUsuario();
        ingresoU.setVisible(true);
    }//GEN-LAST:event_btNuevousuarioActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        if (formularioConsultaValidoA()){
            consultarRegistro();
            btEliminar.enable(true);
            btEditar.enable(true);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

        // TODO add your handling code here:
        if (seleccionEliminacionValida()){
            ConexionBase c = new ConexionBase();
            try{
                c.conectar();
                int filas[] =tbusuario.getSelectedRows();
                    for (int i = 0; i < filas.length; i++) {
                        int fila = filas[i];
                        String id = tbusuario.getValueAt(fila,0).toString();
                        if(!c.eliminarUsuario(Integer.parseInt(id))){
                            JOptionPane.showMessageDialog(this,"Ocurrió un error en la eliminación","Eliminación",JOptionPane.ERROR_MESSAGE);
                            return ;
                        }
                    }
            }catch(Exception e){
                System.out.println(e);
            }
            c.desconectar();
        }
        if(formularioConsultaValidoA()){
            consultarRegistro();}
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    public void consultarRegistro(){
        String tipo = cbtipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBase c = new ConexionBase();
                c.conectar();
                
                ArrayList<usuario> registro = c.consultarUsuarios();
                ArrayList<usuario> resultado = new ArrayList<usuario>();
                
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (usuario u1:registro){
                        if(tipo.equals("Cuenta")&&(descripcion.length()>0)){
                            if(u1.getCuenta().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(u1);
                            }
                        }else if(tipo.equals("Rol")){
                            if(u1.getRol().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(u1);
                            }
                        }else if(tipo.equals("Estado")){
                            if(u1.getEstado().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(u1);
                            }
                        }else if(tipo.equals("Fecha Registro")){
                            if(u1.getFecha_registro().contains(descripcion.toUpperCase())){
                                resultado.add(u1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }

                DefaultTableModel dtm = (DefaultTableModel)tbusuario.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (usuario us:resultado){
                    Object[] fila = new Object[5];
                    fila[0] = us.getId();
                    fila[1] = us.getCuenta();
                    fila[2] = us.getRol();
                    fila[3] = us.getEstado();
                    fila[4] = us.getFecha_registro();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar usuarios");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean formularioConsultaValidoA(){
        String tipo = cbtipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        if(tipo.equals("Cedula") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un número","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Nombres") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un Nombre","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Apellidos") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un Apellido","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }
        
        return true;
    }
    
    private boolean seleccionEliminacionValida(){ 
        int n = tbusuario.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar mínimo un registro para eliminar","Eliminación",JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de eliminar los registros seleccionados?","Eliminación",JOptionPane.YES_NO_OPTION);
        if(op==0)
            return true;
        else
            return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCClave;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btNuevousuario;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbusuario;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}
