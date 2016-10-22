/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.*;
import java.awt.Dialog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Nuevo extends javax.swing.JDialog {

    String ruta;
    ObjectOutputStream salida;
    ArrayList<Producto> productos;
    Producto p;

    public Nuevo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            ruta = "src/datos/productos.txt";
            productos = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.volcado(salida, productos);
            Helper.limpiarTabla(tblProductos);
            Helper.llenadoTabla(tblProductos, ruta);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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

        GRbGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        txtNombreProducto = new javax.swing.JTextField();
        txtUnidades = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CheckConsumo = new javax.swing.JCheckBox();
        CheckNegocio = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        RbUnisex = new javax.swing.JRadioButton();
        RbMasculino = new javax.swing.JRadioButton();
        RbFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmbGarantia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOTE");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 80, 30));

        jLabel2.setText("Nombre del Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 20));

        jLabel3.setText("Garantía");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 70, 40));

        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 80, 30));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accesorio", "Aseo Personal", "Belleza", "Calzado", "Comestible", "Electrodoméstico", "Joyeria", "Limpieza", "Muebleria", "Ropa", "Tecnologia", "Utencilios" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 150, -1));
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, -1));
        jPanel1.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, -1));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckConsumo.setText("De consumo");
        jPanel2.add(CheckConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        CheckNegocio.setText("De Negocio");
        jPanel2.add(CheckNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 250, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Género"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GRbGenero.add(RbUnisex);
        RbUnisex.setText("Unisex");
        jPanel3.add(RbUnisex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 28, -1, -1));

        GRbGenero.add(RbMasculino);
        RbMasculino.setText("Masculino");
        jPanel3.add(RbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 28, -1, -1));

        GRbGenero.add(RbFemenino);
        RbFemenino.setText("Femenino");
        jPanel3.add(RbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 28, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 270, 60));

        jLabel5.setText("Unidades");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 40));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Producto", "Tipo", "Marca", "Unidades", "Garantía", "Género", "Clasificación", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 740, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 80, -1));

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel4.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, 71));

        cmbGarantia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Mes", "2 Meses", "3 Meses", "6 Meses", "9 Meses", "1 Año", "2 Años", "3 Años" }));
        jPanel1.add(cmbGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(754, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        int i;
        String genero, clasificacion;

        productos = Helper.traerDatos(ruta);
        i = tblProductos.getSelectedRow();
        p = productos.get(i);

        txtNombreProducto.setText(p.getNombre());
        cmbGarantia.setSelectedItem(p.getGarantia());
        txtMarca.setText(p.getMarca());
        txtPrecio.setText(String.valueOf(p.getPrecio()));
        txtUnidades.setText(String.valueOf(p.getUnidades()));
        cmbTipo.setSelectedItem(p.getTipo());

        genero = p.getGenero();
        clasificacion = p.getClasificacion();
        
        Helper.radioButtons(genero, ruta, tblProductos, RbUnisex, RbMasculino, RbFemenino);
        Helper.checkBoxes(clasificacion, ruta, tblProductos, CheckConsumo, CheckNegocio);
        
    }//GEN-LAST:event_tblProductosMouseClicked

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNombreProducto.setText("");
        txtPrecio.setText("");
        txtMarca.setText("");
        cmbGarantia.setSelectedIndex(0);
        txtUnidades.setText("");
        cmbTipo.setSelectedIndex(0);
        GRbGenero.clearSelection();
        CheckConsumo.setSelected(false);
        CheckNegocio.setSelected(false);
        txtNombreProducto.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed

        try {
            String Nombre, Tipo, Marca, Garantia, Genero = "", Clasificacion = "";
            double Precio;
            int Unidades;

            Nombre = txtNombreProducto.getText();
            Marca = txtMarca.getText();
            Garantia = (String) cmbGarantia.getSelectedItem();
            Tipo = (String) cmbTipo.getSelectedItem();
            Unidades = Integer.parseInt(txtUnidades.getText());
            Precio = Double.parseDouble(txtPrecio.getText());
            
            //Genero = p.Genero(Genero, RbUnisex, RbMasculino, RbFemenino);

            if (RbUnisex.isSelected()) {
                Genero = RbUnisex.getLabel();
            }
            if (RbMasculino.isSelected()) {
                Genero = RbMasculino.getLabel();
            }
            if (RbFemenino.isSelected()) {
                Genero = RbFemenino.getLabel();
            }

            if (CheckConsumo.isSelected()) {
                Clasificacion = CheckConsumo.getLabel();
            }
            if (CheckNegocio.isSelected()) {
                Clasificacion = CheckNegocio.getLabel();
            }
            if (CheckConsumo.isSelected() && CheckNegocio.isSelected()) {
                Clasificacion = CheckConsumo.getLabel() + " y " + CheckNegocio.getLabel();
            }

            Producto p = new Producto(Nombre, Tipo, Marca, Garantia, Genero, Clasificacion, Unidades, Precio);

            p.guardar(salida);
            Helper.llenadoTabla(tblProductos, ruta);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este Producto?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblProductos.getSelectedRow();
                productos.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, productos);
                Helper.llenadoTabla(tblProductos, ruta);
                txtNombreProducto.setText("");
                txtPrecio.setText("");
                txtMarca.setText("");
                cmbGarantia.getSelectedIndex();
                txtUnidades.setText("");
                cmbTipo.setSelectedIndex(0);
                txtNombreProducto.requestFocusInWindow();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Nuevo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Nuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
         setVisible(false);
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Nuevo dialog = new Nuevo(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox CheckConsumo;
    private javax.swing.JCheckBox CheckNegocio;
    private javax.swing.ButtonGroup GRbGenero;
    private javax.swing.JRadioButton RbFemenino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JRadioButton RbUnisex;
    private javax.swing.JComboBox<String> cmbGarantia;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
