/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.cliente;
import Objetos.restaurante;
import Objetos.usuario;
import bd.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class frmClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmClientes
     */
    public frmClientes(usuario u) {
        initComponents();
        
        //cargando usuario Activo
        System.out.println("Formulario Clientes\nusuario activo: "+u.getCuenta());
        
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
        tbClientes = new javax.swing.JTable();
        cbConsulta = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btNuevoCliente = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Clientes");

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombres", "Apellidos", "Correo", "Direccion", "Telefono", "Tipo", "Saldo", "Dscto.", "Edad", "Sexo", "Id Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        cbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cedula", "Nombres", "Apellidos" }));

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btNuevoCliente.setText("Nuevo");
        btNuevoCliente.setPreferredSize(new java.awt.Dimension(75, 30));
        btNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoClienteActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.setPreferredSize(new java.awt.Dimension(75, 30));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.setPreferredSize(new java.awt.Dimension(75, 30));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(btNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdescripcion)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoClienteActionPerformed
        // TODO add your handling code here:
        frmIngresoClientes mantIngCli= new frmIngresoClientes();
        mantIngCli.setVisible(true);
    }//GEN-LAST:event_btNuevoClienteActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        frmEdicionClientes2 mantEdiCli= new frmEdicionClientes2();
        mantEdiCli.setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        if (formularioConsultaValido()){
            consultarRegistroC();
            //btEditar.enable(true);
            //btEditar.setFocusable(true);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //funciones
    
    public void consultarRegistroC(){
        String tipo = cbConsulta.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBD c = new ConexionBD();
                c.conectar();
                
                ArrayList<cliente> registro = c.consultarClientes("","cliente");
                ArrayList<cliente> resultado = new ArrayList<cliente>();
                
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (cliente c1:registro){
                        if(tipo.equals("Cedula")&&(descripcion.length()>0)){
                            if(c1.getCedula().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(c1);
                            }
                        }else if(tipo.equals("Nombres")&&(descripcion.length()>0)){
                            if(c1.getNombres().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(c1);
                            }
                        }else if(tipo.equals("Apellidos")&&(descripcion.length()>0)){
                            if(c1.getApellidos().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(c1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                
                DefaultTableModel dtm = (DefaultTableModel)tbClientes.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos for
                for (cliente cli:resultado){
                    Object[] fila = new Object[13];
                    fila[0] = cli.getId();
                    fila[1] = cli.getCedula();
                    fila[2] = cli.getNombres();
                    fila[3] = cli.getApellidos();
                    fila[4] = cli.getCorreo();
                    fila[5] = cli.getDireccion();
                    fila[6] = cli.getTelefono();
                    fila[7] = cli.getTipo();
                    fila[8] = cli.getSaldo();
                    fila[9] = cli.getDescuento();
                    fila[10] = cli.getEdad();
                    fila[11] = cli.getSexo();
                    fila[12] = cli.getId_usuario();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar clientes");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean formularioConsultaValido(){
        String tipo = cbConsulta.getSelectedItem().toString();
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
        int n = tbClientes.getSelectedRowCount();
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
    
    //funcion para establecer seleccion valida al momento de editar
    private boolean seleccionEdicionnValida(){ 
        int n = tbClientes.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar mínimo un registro para editar","Edicion",JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btNuevoCliente;
    private javax.swing.JComboBox<String> cbConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}
