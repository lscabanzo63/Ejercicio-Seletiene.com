/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaMediaBolsa extends Bolsa{
    private int valBolsaGamaMedia;


    public GamaMediaBolsa(int numProductosPorBolsa, String nombre, int code) {
        super(numProductosPorBolsa, nombre, code);
        this.valBolsaGamaMedia=20000;
    }

    public int getValBolsaGamaMedia() {
        return valBolsaGamaMedia;
    }

    /**
     * @param valBolsaGamaMedia the valBolsaGamaMedia to set
     */
    public void setValBolsaGamaMedia(int valBolsaGamaMedia) {
        this.valBolsaGamaMedia = valBolsaGamaMedia;
    }
    
    
}
