/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import interfaz.Agregar;
import interfaz.Nuevo;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static int[][] pasarDatosMatriz(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) tabla1.getValueAt(i, j);
            }
        }
        return m;
    }
    
    public static void llenadoTabla(JTable tabla, String ruta){
        int nf;
        DefaultTableModel tm;
        ArrayList<Producto> productos = traerDatos(ruta);
        tm = (DefaultTableModel)tabla.getModel();
        nf = productos.size();
        tm.setRowCount(nf);
        limpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
           tm.setValueAt(i+1, i, 0);
           tm.setValueAt(productos.get(i).getNombre(), i, 1);
           tm.setValueAt(productos.get(i).getTipo(), i, 2);
           tm.setValueAt(productos.get(i).getMarca(), i, 3);
           tm.setValueAt(productos.get(i).getUnidades(), i, 4);
           tm.setValueAt(productos.get(i).getGarantia(), i, 5);
           tm.setValueAt(productos.get(i).getGenero(), i, 6);
           tm.setValueAt(productos.get(i).getClasificacion(), i, 7);
           tm.setValueAt(productos.get(i).getPrecio(), i, 8);
           
        }
        
    }
    
    public static ArrayList traerDatos(String ruta){
        FileInputStream archivo;
            ObjectInputStream entrada;
            ArrayList productos = new ArrayList();
            Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while((p=entrada.readObject())!=null){
                productos.add(p);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());        
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return productos;

    }
    public static void volcado(ObjectOutputStream salida, ArrayList productos){
        for (int i = 0; i < productos.size(); i++) {
            try {
                salida.writeObject(productos.get(i));
            } catch (IOException ex) {
                Logger.getLogger(Nuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}