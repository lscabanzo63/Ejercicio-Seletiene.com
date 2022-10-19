/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public abstract class Producto extends ItemC {
    private int numProductos; 

    public Producto(int numProductos, String nombre, int code) {
        super(nombre, code);
        this.numProductos = numProductos;
    }

    /**
     * @return the numProductos
     */
    public int getNumProductos() {
        return numProductos;
    }

    /**
     * @param numProductos the numProductos to set
     */
    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
    
    
    
}
