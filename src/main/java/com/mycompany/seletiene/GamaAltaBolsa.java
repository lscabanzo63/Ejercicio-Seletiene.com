/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class GamaAltaBolsa extends Bolsa {
  private int valBolsaGamaAlta;  

    public GamaAltaBolsa(int numProductosPorBolsa, String nombre, int code) {
        super(numProductosPorBolsa, nombre, code);
        this.valBolsaGamaAlta=40000;
    }


    public int getValBolsaGamaAlta() {
        return valBolsaGamaAlta;
    }

    /**
     * @param valBolsaGamaAlta the valBolsaGamaAlta to set
     */
    public void setValBolsaGamaAlta(int valBolsaGamaAlta) {
        this.valBolsaGamaAlta = valBolsaGamaAlta;
    }
  
}
