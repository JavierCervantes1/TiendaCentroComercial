/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.NoCeroException;
import excepciones.NoNegativoException;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author user
 */
public class Producto implements java.io.Serializable {

    private String nombre;
    private String tipo;
    private String marca;
    private String garantia;
    private String genero;
    private String clasificacion;
    private int unidades;
    private double precio;

    public Producto(String nombre, String tipo, String marca, String garantia, String genero, String clasificacion, int unidades, double precio) throws NoNegativoException, NoCeroException {
       if (unidades < 0){
       throw new NoNegativoException("El número de unidades no debe ser Negativo");
       }
       if (precio < 0){
       throw new NoNegativoException("El precio no debe ser Negativo");
       }
       if (unidades == 0) {
            throw new NoCeroException("El número de unidades no debe ser Cero");
        }
       if (precio == 0) {
            throw new NoCeroException("El precio no debe ser Cero");
        }
        
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.garantia = garantia;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.unidades = unidades;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) throws NoNegativoException, NoCeroException {
        
        if (unidades < 0){
       throw new NoNegativoException("El número de unidades no debe ser Negativo");
       }
       if (unidades == 0){
       throw new NoCeroException("El número de unidades no debe ser Cero");
       }
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws NoNegativoException, NoCeroException {
        if (precio < 0){
       throw new NoNegativoException("El precio no debe ser Negativo");
       }
       if (precio == 0) {
            throw new NoCeroException("El precio no debe ser Cero");
        }
        this.precio = precio;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
