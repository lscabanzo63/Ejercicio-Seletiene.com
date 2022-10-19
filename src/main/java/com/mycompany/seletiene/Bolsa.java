/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public abstract class Bolsa extends ItemC{
    private int numProductosPorBolsa; 

    public Bolsa(int numProductosPorBolsa, String nombre, int code) {
        super(nombre, code);
        this.numProductosPorBolsa = numProductosPorBolsa;
    }

    public Bolsa(String nombre, int code) {
        super(nombre, code);
        this.numProductosPorBolsa=3;
    }
    

    /**
     * @return the numProductosPorBolsa
     */
    public int getNumProductosPorBolsa() {
        return numProductosPorBolsa;
    }

    /**
     * @param numProductosPorBolsa the numProductosPorBolsa to set
     */
    public void setNumProductosPorBolsa(int numProductosPorBolsa) {
        this.numProductosPorBolsa = numProductosPorBolsa;
    }
    

    
    

}