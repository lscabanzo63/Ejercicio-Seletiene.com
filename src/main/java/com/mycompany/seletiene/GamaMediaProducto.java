/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaMediaProducto extends Producto {
    private int valProductoGamaMedia; 

    public GamaMediaProducto(int numProductos, String nombre, int code) {
        super(numProductos, nombre, code);
        this.valProductoGamaMedia=8000;
    }

    /**
     * @return the valProductoGamaMedia
     */
    public int getValProductoGamaMedia() {
        return valProductoGamaMedia;
    }

    /**
     * @param valProductoGamaMedia the valProductoGamaMedia to set
     */
    public void setValProductoGamaMedia(int valProductoGamaMedia) {
        this.valProductoGamaMedia = valProductoGamaMedia;
    }
    
}
