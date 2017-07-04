/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Objetos.usuario;
import bd.ConexionBD;
import com.sun.xml.internal.ws.client.ContentNegotiation;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(String usuarioact) {
        initComponents();
        tfusuarioActivo.setText(usuarioact);
        
        System.out.println("Formulario Principal.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        tfusuarioActivo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mMantenimientoUsuario = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        mMantenimiento = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miRestaurantes = new javax.swing.JMenuItem();
        miProductos = new javax.swing.JMenuItem();
        mProcesos = new javax.swing.JMenu();
        miOrden = new javax.swing.JMenuItem();
        mAyuda = new javax.swing.JMenu();
        miAcercaDe = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Java - CampusFood");

        jLabel1.setText("Usuario Activo:");

        tfusuarioActivo.setEditable(false);
        tfusuarioActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfusuarioActivoActionPerformed(evt);
            }
        });

        mArchivo.setText("Archivo");

        mMantenimientoUsuario.setText("Usuarios");
        mMantenimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMantenimientoUsuarioActionPerformed(evt);
            }
        });
        mArchivo.add(mMantenimientoUsuario);

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mArchivo.add(miSalir);

        jMenuBar1.add(mArchivo);

        mMantenimiento.setText("Mantenimiento");

        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        mMantenimiento.add(miClientes);

        miRestaurantes.setText("Restaurantes");
        miRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRestaurantesActionPerformed(evt);
            }
        });
        mMantenimiento.add(miRestaurantes);

        miProductos.setText("Productos");
        miProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProductosActionPerformed(evt);
            }
        });
        mMantenimiento.add(miProductos);

        jMenuBar1.add(mMantenimiento);

        mProcesos.setText("Procesos");

        miOrden.setText("Orden");
        miOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOrdenActionPerformed(evt);
            }
        });
        mProcesos.add(miOrden);

        jMenuBar1.add(mProcesos);

        mAyuda.setText("Ayuda");

        miAcercaDe.setText("Acerca de...");
        miAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaDeActionPerformed(evt);
            }
        });
        mAyuda.add(miAcercaDe);

        jMenuBar1.add(mAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfusuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfusuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        // TODO add your handling code here:
        frmClientes mantCli= new frmClientes(tfusuarioActivo.getText());
        mantCli.setVisible(true);
    }//GEN-LAST:event_miClientesActionPerformed

    private void miAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaDeActionPerformed
        // TODO add your handling code here:
        
        frmAcercaDe info = new frmAcercaDe();
        info.setVisible(true);
    }//GEN-LAST:event_miAcercaDeActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        //SALIR
        int opt1= JOptionPane.showConfirmDialog(this,"¿Esta Seguro de que desea Salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(opt1==0){
            System.exit(0);
        }
    }//GEN-LAST:event_miSalirActionPerformed

    private void miOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOrdenActionPerformed
        // TODO add your handling code here:
        frmOrden genOrden = new frmOrden();
        genOrden.setVisible(true);
    }//GEN-LAST:event_miOrdenActionPerformed

    private void miRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRestaurantesActionPerformed
        // TODO add your handling code here:
        frmRestaurante mantRes= new frmRestaurante();
        mantRes.setVisible(true);
    }//GEN-LAST:event_miRestaurantesActionPerformed

    private void miProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProductosActionPerformed
        // TODO add your handling code here:
        frmProducto mantPro= new frmProducto();
        mantPro.setVisible(true);
    }//GEN-LAST:event_miProductosActionPerformed

    private void mMantenimientoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMantenimientoUsuarioActionPerformed
        // TODO add your handling code here:
        frmUsuarios user = new frmUsuarios();
        user.setVisible(true);
    }//GEN-LAST:event_mMantenimientoUsuarioActionPerformed

    private void tfusuarioActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfusuarioActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfusuarioActivoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mAyuda;
    private javax.swing.JMenu mMantenimiento;
    private javax.swing.JMenuItem mMantenimientoUsuario;
    private javax.swing.JMenu mProcesos;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miOrden;
    private javax.swing.JMenuItem miProductos;
    private javax.swing.JMenuItem miRestaurantes;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTextField tfusuarioActivo;
    // End of variables declaration//GEN-END:variables
}
