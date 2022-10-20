/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seletiene;

/**
 *
 * @author santi
 */
public class TarjetaCredito implements TipoPago {
    private int numTarjeta;
    private int numCuotas;
    private String Nombre;
    private String Apellido;
    private int Vencimiento;
    private int CVV;
    private int CC;
    
    
    @Override
    public void pagar() {
          
    }   

    /**
     * @return the numTarjeta
     */
    public int getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * @param numTarjeta the numTarjeta to set
     */
    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    /**
     * @return the numCuotas
     */
    public int getNumCuotas() {
        return numCuotas;
    }

    /**
     * @param numCuotas the numCuotas to set
     */
    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Vencimiento
     */
    public int getVencimiento() {
        return Vencimiento;
    }

    /**
     * @param Vencimiento the Vencimiento to set
     */
    public void setVencimiento(int Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    /**
     * @return the CVV
     */
    public int getCVV() {
        return CVV;
    }

    /**
     * @param CVV the CVV to set
     */
    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    /**
     * @return the CC
     */
    public int getCC() {
        return CC;
    }

    /**
     * @param CC the CC to set
     */
    public void setCC(int CC) {
        this.CC = CC;
    }
    
}
