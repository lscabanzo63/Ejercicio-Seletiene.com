/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaBajaProducto extends Producto {
    private int valProductoGamaBaja; 
    public GamaBajaProducto(int numProductos, String nombre, int code) {
        super(numProductos, nombre, code);
        this.valProductoGamaBaja=4000;
    }

    /**
     * @return the valProductoGamaBaja
     */
    public int getValProductoGamaBaja() {
        return valProductoGamaBaja;
    }

    /**
     * @param valProductoGamaBaja the valProductoGamaBaja to set
     */
    public void setValProductoGamaBaja(int valProductoGamaBaja) {
        this.valProductoGamaBaja = valProductoGamaBaja;
    }
    
}
