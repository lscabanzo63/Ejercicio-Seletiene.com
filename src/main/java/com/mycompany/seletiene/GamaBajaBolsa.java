/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaBajaBolsa extends Bolsa{
    private int valBolsaGamaBaja;

    public GamaBajaBolsa(int numProductosPorBolsa, String nombre, int code) {
        super(numProductosPorBolsa, nombre, code);
        this.valBolsaGamaBaja=10000;
    }

    /**
     * @return the valBolsaGamaBaja
     */
    public int getValBolsaGamaBaja() {
        return valBolsaGamaBaja;
    }

    /**
     * @param valBolsaGamaBaja the valBolsaGamaBaja to set
     */
    public void setValBolsaGamaBaja(int valBolsaGamaBaja) {
        this.valBolsaGamaBaja = valBolsaGamaBaja;
    }
    
}
