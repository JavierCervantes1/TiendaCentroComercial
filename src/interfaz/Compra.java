/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcervant23
 */
public class Compra extends javax.swing.JDialog {

    double Unitario;
    Persona p;
    Producto c;
    String rutaP, rutaClie, rutaV;
    ObjectOutputStream salida;
    ArrayList<Compra> compras;

    public Compra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        try {
        rutaP = "src/datos/personas.txt";
        rutaClie = "src/datos/productos.txt";
        rutaV = "src/datos/compra.txt";
        compras = Helper.traerDatos(rutaV);
        
        Helper.llenarComboPersonas(cmbClientes, rutaP);
        //Helper.llenarComboProductos(cmbProductos, rutaClie);
        
            salida = new ObjectOutputStream(new FileOutputStream(rutaV));
            Helper.volcado(salida, compras);
            Helper.limpiarTabla(tblCompra);
            Helper.llenadoTablaCompra(tblCompra, rutaV);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmdBuscarCliente = new javax.swing.JButton();
        cmbClientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdBuscarProducto = new javax.swing.JButton();
        txtNombreProducto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        cmdCalcularCosto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        cmdRegistroCompra = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprador"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBuscarCliente.setText("Buscar Cliente");
        cmdBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, -1));

        jPanel2.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 350, -1));

        jLabel1.setText("Seleccionar Persona: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBuscarProducto.setText("Buscar Producto");
        cmdBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 130, -1));
        jPanel3.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 190, -1));

        tblProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Nombre", "Marca", "Unidades", "Garantia", "Valor Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductos1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 80));

        jLabel2.setText("Nombre Producto");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 680, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Unidades a Comprar");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 20));
        jPanel4.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, -1));

        cmdCalcularCosto.setText("CalcularCosto");
        cmdCalcularCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularCostoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCalcularCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 140, -1));

        jLabel4.setText("Costo Total");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 20));

        txtCosto.setEditable(false);
        jPanel4.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, -1));

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cédula", "Nombre", "Apellido", "Producto", "Garantia", "Unidades", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCompra);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 640, 100));

        cmdRegistroCompra.setText("Registrar Compra");
        jPanel4.add(cmdRegistroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 680, 200));

        cmdCancelar.setText("Cancelar");
        jPanel1.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 130, -1));

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(738, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed

        setVisible(false);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarClienteActionPerformed
      
       
    }//GEN-LAST:event_cmdBuscarClienteActionPerformed

    private void cmdBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarProductoActionPerformed
        
        String Nombre = txtNombreProducto.getText();
        Helper.mercancia1(tblProductos1, rutaClie, Nombre);
        Unitario = c.getPrecio();
        
    }//GEN-LAST:event_cmdBuscarProductoActionPerformed

    private void cmdCalcularCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularCostoActionPerformed
        int Unidades;
        double Operacion;
        
        Unidades = Integer.parseInt(txtUnidades.getText());
        Operacion = Unitario*Unidades;
        String res = String.valueOf(Operacion);
        
        txtCosto.setText(res);
        
    }//GEN-LAST:event_cmdCalcularCostoActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Compra dialog = new Compra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JButton cmdBuscarCliente;
    private javax.swing.JButton cmdBuscarProducto;
    private javax.swing.JButton cmdCalcularCosto;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdRegistroCompra;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblProductos1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
