/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class frmOrden extends javax.swing.JFrame {

    /**
     * Creates new form frmOrden
     */
    public static int id_cliente;
    public static int id_restaurante;
    public static float descuento_cliente=0;
    public static boolean total_calculado = false;
    //public static producto po;
    
    public frmOrden() {
        initComponents();
        
        
        
        System.out.println("Formulario - Generar Orden");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String fecha_hora_orden = dateFormat.format(date); //2016/11/16 12:08:43
        tfFecha.setText(fecha_hora_orden);
        tfUsuario.setText(frmPrincipal.usuarioActivo.getCuenta());
        
        DefaultTableModel dtm = (DefaultTableModel)frmOrden.tbdetalleOrden.getModel();
        dtm.setRowCount(0);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfcedula = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        tfSaldo = new javax.swing.JTextField();
        btBuscarCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfTipo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfRestaurante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btCargarProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdetalleOrden = new javax.swing.JTable();
        tfSubTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        brIngresarOrden = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfNumeroOrden = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfDescuento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfivacero = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfiva12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        btBuscarRestaurante = new javax.swing.JButton();
        tfDescripcion = new javax.swing.JTextField();
        btCalcularTotal = new javax.swing.JButton();
        btEliminarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden");

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Saldo:");

        tfcedula.setEditable(false);

        tfNombres.setEditable(false);

        tfApellidos.setEditable(false);
        tfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosActionPerformed(evt);
            }
        });

        tfCorreo.setEditable(false);

        tfSaldo.setEditable(false);

        btBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa2.png"))); // NOI18N
        btBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClienteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Datos del Cliente");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Datos de la Orden");

        tfFecha.setEditable(false);

        jLabel10.setText("Fecha:");

        jLabel11.setText("Usuario:");

        tfUsuario.setEditable(false);

        tfTipo.setEditable(false);

        jLabel12.setText("Restaurante:");

        tfRestaurante.setEditable(false);

        jLabel13.setText("Detalle Orden:");

        btCargarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa2.png"))); // NOI18N
        btCargarProductos.setText("Agregar Productos");
        btCargarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarProductosActionPerformed(evt);
            }
        });

        tbdetalleOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Producto", "Precio Unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbdetalleOrden);

        tfSubTotal.setEditable(false);
        tfSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel14.setText("SubTotal:");

        brIngresarOrden.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        brIngresarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/orden2.png"))); // NOI18N
        brIngresarOrden.setText("Finalizar Orden");
        brIngresarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brIngresarOrdenActionPerformed(evt);
            }
        });

        jLabel15.setText("N°:");

        tfNumeroOrden.setEditable(false);

        jLabel16.setText("Descuento:");

        tfDescuento.setEditable(false);
        tfDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDescuento.setText("0.0");

        jLabel17.setText("IVA 0%:");

        tfivacero.setEditable(false);
        tfivacero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfivacero.setText("0.0");

        jLabel18.setText("IVA 12%");

        tfiva12.setEditable(false);
        tfiva12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfiva12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfiva12ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("TOTAL:");

        tfTotal.setEditable(false);
        tfTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btBuscarRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa2.png"))); // NOI18N
        btBuscarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarRestauranteActionPerformed(evt);
            }
        });

        tfDescripcion.setText("Descripcion.");

        btCalcularTotal.setText("Calcular Total");
        btCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularTotalActionPerformed(evt);
            }
        });

        btEliminarProductos.setText("Eliminar Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tfRestaurante))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jLabel10))
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(13, 13, 13)
                                                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btBuscarRestaurante)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumeroOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btBuscarCliente))
                                        .addComponent(tfNombres)
                                        .addComponent(tfApellidos)
                                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfSaldo)))))
                            .addComponent(btCargarProductos, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btCalcularTotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btEliminarProductos)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(brIngresarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSubTotal)
                                    .addComponent(tfDescuento)
                                    .addComponent(tfivacero)
                                    .addComponent(tfiva12)
                                    .addComponent(tfTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15)
                    .addComponent(tfNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(tfRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscarRestaurante))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCargarProductos)
                            .addComponent(jLabel13))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(btCalcularTotal)
                    .addComponent(btEliminarProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tfivacero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tfiva12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(brIngresarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClienteActionPerformed
        // TODO add your handling code here:
        frmBuscarClientesOrden buscarCli = new frmBuscarClientesOrden(frmPrincipal.usuarioActivo);
        buscarCli.setVisible(true);
    }//GEN-LAST:event_btBuscarClienteActionPerformed

    private void tfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosActionPerformed

    private void brIngresarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brIngresarOrdenActionPerformed
        // TODO add your handling code here:
        if(esFormularioValido() && total_calculado){
            
            System.out.println("numero de productos: "+tbdetalleOrden.getRowCount());
        }else{
            JOptionPane.showMessageDialog(this,"Formulario Invalido.","Orden",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_brIngresarOrdenActionPerformed

    private void tfiva12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfiva12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfiva12ActionPerformed

    private void btBuscarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarRestauranteActionPerformed
        // TODO add your handling code here:
        frmBuscarRestauranteOrden buscRes = new frmBuscarRestauranteOrden();
        buscRes.setVisible(true);
    }//GEN-LAST:event_btBuscarRestauranteActionPerformed

    private void btCargarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarProductosActionPerformed
        // TODO add your handling code here:
        if(tfRestaurante.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe definir un restaurante","Productos",JOptionPane.ERROR_MESSAGE);
        }else{
            restaurante r = new restaurante(id_restaurante, tfRestaurante.getText());
            frmBuscarProductoOrden buscprod = new frmBuscarProductoOrden(r);
            buscprod.setVisible(true);
        }
        calcularValores();
    }//GEN-LAST:event_btCargarProductosActionPerformed

    private void btCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularTotalActionPerformed
        // TODO add your handling code here:
        if(tfRestaurante.getText().equals("") || tfcedula.getText().equals("") || tbdetalleOrden.getRowCount()<1){    
            JOptionPane.showMessageDialog(this,"Valores incompletos.\nSe requiere Cliente y Productos.","Calculo de Valores",JOptionPane.ERROR_MESSAGE);
        }else{
            calcularValores();
            total_calculado = true;
        }
    }//GEN-LAST:event_btCalcularTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private boolean esFormularioValido(){
        if(tfRestaurante.getText().equals("") ||
           tfcedula.getText().equals("")){
            return false;
        }
        return true;
    }
    
    private void calcularValores(){
        float subtotal = 0;
        //calculo de subtotal
        for (int i=0; i<tbdetalleOrden.getRowCount(); i++){
            subtotal = subtotal + Float.parseFloat(tbdetalleOrden.getValueAt(i,3).toString());
        }        
        tfSubTotal.setText(String.valueOf(subtotal));
        //descuento
        float descuento = subtotal*(descuento_cliente*0.01f);
        tfDescuento.setText(String.valueOf(descuento));
        //iva cero
        float ivacero = subtotal - descuento;
        tfivacero.setText(String.valueOf(ivacero));
        //calculo iva
        float iva12 = ivacero*0.12f;
        tfiva12.setText(String.valueOf(iva12));
        //calculo de total
        float total = ivacero + iva12;
        tfTotal.setText(String.valueOf(total));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brIngresarOrden;
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btBuscarRestaurante;
    private javax.swing.JButton btCalcularTotal;
    private javax.swing.JButton btCargarProductos;
    private javax.swing.JButton btEliminarProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbdetalleOrden;
    public static javax.swing.JTextField tfApellidos;
    public static javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDescripcion;
    public static javax.swing.JTextField tfDescuento;
    private javax.swing.JTextField tfFecha;
    public static javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfNumeroOrden;
    public static javax.swing.JTextField tfRestaurante;
    public static javax.swing.JTextField tfSaldo;
    private javax.swing.JTextField tfSubTotal;
    public static javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfUsuario;
    public static javax.swing.JTextField tfcedula;
    private javax.swing.JTextField tfiva12;
    private javax.swing.JTextField tfivacero;
    // End of variables declaration//GEN-END:variables
}
