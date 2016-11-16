/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;

/**
 *
 * @author Lcastane6
 */
public class ListadoMercancia extends javax.swing.JDialog {

    String ruta;

    /**
     * Creates new form ListadoMercancia
     */
    public ListadoMercancia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/productos.txt";
        JButton botonesH[] = {cmdListar};
        JButton botonesD[] = {cmdLimpiar, cmdSalir};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
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
        jPanel4 = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdListar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        RbUnisex = new javax.swing.JRadioButton();
        RbMasculino = new javax.swing.JRadioButton();
        RbFemenino = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        CheckConsumo = new javax.swing.JCheckBox();
        CheckNegocio = new javax.swing.JCheckBox();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTAR MERCANCIA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLimpiar.setText("Cancelar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        cmdListar.setText("Listar");
        cmdListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel4.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 130, 220));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por:"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        jLabel3.setText("Garantía");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 40));

        jLabel4.setText("Marca");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 80, 30));
        jPanel6.add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 150, -1));

        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        jPanel6.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, -1));

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

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CheckConsumo.setText("De consumo");
        jPanel2.add(CheckConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        CheckNegocio.setText("De Negocio");
        jPanel2.add(CheckNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 30));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 250, 60));

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        jPanel6.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 220));

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
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 460));

        setSize(new java.awt.Dimension(756, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListarActionPerformed
        if (txtTipo.getText().trim().isEmpty() && txtMarca.getText().trim().isEmpty() && txtGarantia.getText().trim().isEmpty() && !RbUnisex.isSelected() && !RbMasculino.isSelected() && !RbFemenino.isSelected() && !CheckConsumo.isSelected() && !CheckNegocio.isSelected()) {
            Helper.mensaje(this, "Por Favor utilice una forma de búsqueda", "Error", 2);
            JButton botonesH[] = {cmdListar};
            JButton botonesD[] = {cmdLimpiar, cmdSalir};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
            txtTipo.requestFocusInWindow();
        } else {
            String tipo = txtTipo.getText();
            String marca = txtMarca.getText();
            String garantia = txtGarantia.getText();
            String genero = "", clasificacion = "";

            genero = Helper.getGenero(genero, RbUnisex, RbMasculino, RbFemenino);
            clasificacion = Helper.getClasificacion(clasificacion, CheckConsumo, CheckNegocio);

            Helper.mercancia(tblProductos, ruta, tipo, marca, garantia, genero, clasificacion);

            txtMarca.setText("");
            txtGarantia.setText("");
            txtTipo.setText("");
            CheckConsumo.setSelected(false);
            CheckNegocio.setSelected(false);
            GRbGenero.clearSelection();
            txtTipo.requestFocusInWindow();

            JButton botonesH[] = {cmdLimpiar, cmdSalir};
            JButton botonesD[] = {cmdListar};
            txtTipo.setEnabled(false);
            txtMarca.setEnabled(false);
            txtGarantia.setEnabled(false);
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdListarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtMarca.setText("");
        txtGarantia.setText("");
        txtTipo.setText("");
        GRbGenero.clearSelection();
        CheckConsumo.setSelected(false);
        CheckNegocio.setSelected(false);
        txtTipo.setEnabled(true);
        txtMarca.setEnabled(true);
        txtGarantia.setEnabled(true);
        txtTipo.requestFocusInWindow();
        JButton botonesH[] = {cmdListar, cmdSalir};
        JButton botonesD[] = {cmdLimpiar};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyTyped

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
            java.util.logging.Logger.getLogger(ListadoMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListadoMercancia dialog = new ListadoMercancia(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdListar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
