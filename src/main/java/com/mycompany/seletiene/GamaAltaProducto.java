/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaAltaProducto extends Producto {
    private int valProductoGamaAlta;

    public GamaAltaProducto(int numProductos, String nombre, int code) {
        super(numProductos, nombre, code);
        this.valProductoGamaAlta = 15000;
    }

    /**
     * @return the valProductoGamaAlta
     */
    public int getValProductoGamaAlta() {
        return valProductoGamaAlta;
    }

    /**
     * @param valProductoGamaAlta the valProductoGamaAlta to set
     */
    public void setValProductoGamaAlta(int valProductoGamaAlta) {
        this.valProductoGamaAlta = valProductoGamaAlta;
    }
    
}
